package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object CurryingFunction {

  def main(args: Array[String]): Unit = {
    var test = 1 :: 2 :: List(3, 4)
    println(test)
    println(strcat("Hello")("World"))
  }

  def strcat(s1: String)(s2: String) = s1 + s2

}
