package com.mylearnings.scala

object CallFunctionByName {

  //  Main method
  def main(args: Array[String]) {
    // Invoking the Call-By-Name method called 'methodOne'
    methodOne(methodTwo());
  }
  
  def methodTwo() = {
    println("Inside 'methodTwo'")
    "Method - 2";
  }
  
  // Call-By-Name method takes another function as parameter  
  def methodOne (m: => String) = {
    println("Inside 'methodOne'")
    println("Parameter: " + m)
  }
  
}