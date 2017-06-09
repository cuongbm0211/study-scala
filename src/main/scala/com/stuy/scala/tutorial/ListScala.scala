package com.stuy.scala.tutorial

/**
  * Created by cuongbui on 6/9/17.
  */
object ListScala {
  def main(args: Array[String]): Unit = {
    val fruits: List[String] = List("apple", "orange")
    println(fruits)

    val empty: List[Nothing] = List()
    println(empty)

    // tow dimension list
    val dim: List[List[Int]] =
      List(
        List(1, 2, 3),
        List(4, 5, 6)
      )

    println(dim)

    // Declare list use sugar syntactic
    var listFruit = "orange" :: Nil
    println(listFruit)

    listFruit = "apple" :: "orange" :: Nil
    println(listFruit)

    // Creates 5 elements using the given function.
    val squares = List.tabulate(6)(n => n * n)
    println( "squares : " + squares  )

    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "mul : " + mul  )

  }
}
