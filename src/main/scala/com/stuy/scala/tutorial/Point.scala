package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
class Point(xc: Int, yc: Int) extends Equal{
  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x
}

object Point{
  def main(args: Array[String]): Unit = {
    val p1 = new Point(2, 3)
    println("p1.isEqual(p1) " + p1.isEqual(p1))
    println("p1.isEqual(2) " + p1.isEqual(2))
  }
}
