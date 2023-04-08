package com.example.mykotlinapp

fun main(args:Array<String>){

    val sumResult = high(20,40, ::sum)
    println(sumResult)
}

fun sum(p:Int,q:Int) = p + q

fun high(a: Int,b: Int, operation:(Int,Int) -> Int): Int{
   return operation(a,b)
}
