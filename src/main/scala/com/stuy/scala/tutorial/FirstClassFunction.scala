package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object FirstClassFunction {
  def main(args: Array[String]): Unit = {
    def printInteger = (x: Int) => println("I print: " + x)
    printInteger(888)

    def multiply = (x: Int, y: Int) => x*y
    println(multiply(2,3))
  }

}
