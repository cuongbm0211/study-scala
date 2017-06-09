package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object FunctionWithVariableArgument {
  def main(args: Array[String]): Unit = {
    printStrings("Hello", "World")
  }

  def printStrings(args: String*): Unit = {
    args.map(x => println(x))
  }
}
