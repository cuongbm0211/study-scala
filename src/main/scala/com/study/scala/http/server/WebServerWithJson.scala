package com.study.scala.http.server

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.Done
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._

import scala.io.StdIn

import scala.concurrent.Future

/**
  * Created by cuongbui on 6/8/17.
  */
object WebServerWithJson {

  // domain model
  case class Item(name: String, id: Long)
  case class Order(items: List[Item])

  // format for unmarshalling and marshalling
  implicit val itemFormat = jsonFormat2(Item)
  implicit val orderFormat = jsonFormat1(Order)

  val itemCuong = new Item("Cuong", 123)
  var mockReturnItem  = List(itemCuong)
  println(mockReturnItem)

  // (fake) async database query api
  def fetchItem(itemId: Long): Future[Option[Item]] = ???

  def saveOrder(order: Order): Future[Done] = ???

  def main(args: Array[String]): Unit = {
    // needed to run the route
    implicit val system = ActorSystem()
    implicit val materializer = ActorMaterializer()
    // needed for the future map/flatmap in the end
    implicit val executionContext = system.dispatcher

    val route: Route =
      get {
        pathPrefix("item" / LongNumber) { id =>
          // there might be no tiem for a given id
          val maybeItem: Future[Option[Item]] = Future {
            Some(itemCuong)
          }

          onSuccess(maybeItem) {
            case Some(item) => complete(item)
            case None       => complete(StatusCodes.NotFound)
          }
        }
      } ~
      post {
        path("create-order") {
          entity(as[Order]) { order =>
            val saved: Future[Done] = saveOrder(order)
            onComplete(saved) { done =>
              complete("order created")
            }
          }
        }
      }

    val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)
    println(s"Server online at http://localhost:8080/\nPress RERURN to stop...")
    StdIn.readLine() // let it run util user presses ruturn
    bindingFuture
        .flatMap(_.unbind())
        .onComplete(_ => system.terminate())

  }
}
