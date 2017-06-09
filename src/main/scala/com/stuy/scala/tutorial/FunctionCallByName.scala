package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object FunctionCallByName {
  def main(args: Array[String]): Unit = {
    delay(time())
  }

  def time(): Long = {
    println("Getting time in nano seconds")
    System.nanoTime()
  }

  def delay(f: => Long): Unit = {
    println("In delayed method")
    println("Param: " + f)
  }
}
