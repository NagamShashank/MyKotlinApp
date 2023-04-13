package com.example.mykotlinapp.ExceptionHandling

fun main(args:Array<String>) {
   println("Enter a Number : ")
    val num = readLine()!!.toInt()

    if(num <= 0){
        throw IllegalArgumentException("Negative Number Entered")
    }
}