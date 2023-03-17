package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class SquareOfElementsTest extends AnyFlatSpec with Matchers{
  try
  {
    "squareListMapApproach" should "calculate the square of List(1,2,3)" in {
      assert(SquareOfElements.squareListMapApproach(List(1,2,3)) == List(1,4,9))
    }
    "squareListPatternMatching" should "calculate the square of List(1,2,3)" in {
      assert(SquareOfElements.squareListPatternMatching(List(1,2,3)) == List(1,4,9))
    }
    "squareListPatternMatching" should "calculate the square of List()" in {
      assert(SquareOfElements.squareListPatternMatching(List()) == List())
    }
    "squareListMapApproach" should "calculate the square of List()" in {
      assert(SquareOfElements.squareListMapApproach(List()) == List())
    }
  }
  catch
  {
    case error: Exception =>
      println("Error while calculating square  " + error.getMessage)

  }
}
