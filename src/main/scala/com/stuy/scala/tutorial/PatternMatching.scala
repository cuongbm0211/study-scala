package com.stuy.scala.tutorial

import scala.util.matching.Regex.Match

/**
  * Created by cuongbui on 6/9/17.
  */
object PatternMatching {
  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTestAny(1))
    println(matchTestAny("two"))
    println(matchTestAny("bbbb"))

    val cuong = new Person("Cuong", 31)
    val kien = new Person("Kien", 32)

    val list = List(cuong, kien)
    for (person <- list){
      person match {
        case Person("Cuong", 31) => println("Hello Cuong")
        case _ => println("Hello other")
      }
    }
  }

  def matchTest(x: Int): String = x match{
    case 0 => "Zero"
    case _ => "Many"
  }

  def matchTestAny(x: Any): Any = x match {
    case 1 => "One"
    case "two" => 2
    case _ => "default"
  }

  case class Person(name: String, age: Int)
}
