package com.mylearnings.scala

object FunctionWithNamedArgs {

  // Main method
  def main(args: Array[String]) {
    //printArguments("1st", "2nd", 10);
    
    // Calling a method with named arguments i.e., preceded by a parameter names 
    printArguments(StrArgTwo = "2nd", IntArg = 10, StrArgOne = "1st");
  }
  
   // Method
  def printArguments(StrArgOne: String, StrArgTwo: String, IntArg: Int) = {
    println("StrArgOne: " + StrArgOne)
    println("StrArgTwo: " + StrArgTwo)
    println("IntArg: " + IntArg)
  }
  
}