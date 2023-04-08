package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    var a = 10
    var b = 12

    b -= a
    a += b
    b = a-b

    println("A = $a")
    println("B = $b")
}