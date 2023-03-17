package com.knoldus

object SquareOfElements extends App{
  def squareListPatternMatching(userList: List[Int]): List[Int] = {
    userList match {
      case Nil => userList
      case head :: tail => head * head :: squareListPatternMatching(tail)
    }
  }

  def squareListMapApproach(userList: List[Int]): List[Int] = {
    userList map(element => element*element)
  }


  //val list=List(1,2,3)
  //println(squareListPatternMatching(list))
  //println(squareListMapApproach(list))
}
