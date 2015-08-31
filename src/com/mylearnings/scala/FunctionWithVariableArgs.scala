package com.mylearnings.scala

object FunctionWithVariableArgs {

  // Main method
  def main(args: Array[String]) {
    printStrings("1st", "2nd", "3rd");
  }

  // Method with variable arguments
  def printStrings(args: String*) = {
    var i: Int = 0;

    for (arg <- args) {
      println(arg);
      i = i + 1;
    }
  }
  
}