package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object SugarSyntactic {
  def main(args: Array[String]): Unit = {
    // 1.
    val f: Int => Long = value => value * value
    // f: Int => Long : we need function f, with input is Int, output is Long
    println(f(2))

    // 2.
    def square(x: Int):Long = {
      x*x
    }
    val g: (Int => Long) = square // assign function
    println(g(2))
    println(g.apply(5))

    // 3.
    def printHello(): Unit = {
      println("Hello sugar syntactic")
    }
    val printFunction: () => Unit = printHello
    // printFunction: () => Unit : we need function with no parameter, and no return any thing
    printFunction()
    printFunction.apply()

  }

}
