package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    println(apply(layout, 5))
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout(x: Int): String = {
    "[" + x.toString + "]"
  }
}
