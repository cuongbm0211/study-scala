package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object OptionScala {
  def main(args: Array[String]): Unit = {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println("Capital France: " + capitals.get("France"))
    println("Capital VietName: " + capitals.get("Vietnam"))

    println("Show Capital France: " + show(capitals.get("France")))
    println("Show Capital VietName: " + show(capitals.get("Vietnam")))
  }

  def findPerson(key: Int): Option[String] = ???

  // Most common way to work with option
  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
