package com.mylearnings.scala

object FunctionWithDefaultArgs {
  
  // Main method
  def main(args: Array[String]): Unit = {
    
    // Calling 'add' method without having to pass the arguments
    println(add())
  }
  
  // Method with default arguments 
  def add(val1: Int = 10, val2: Int = 20): Int = {
    val1 + val2    
  }
  
}