package com.study.scala.testTrait

/**
  * Created by cuongbui on 6/13/17.
  */
trait TestTraitHaveConstructor {
  implicit val redisClient = new RedisClient()

  redisClient.printHello()
}
