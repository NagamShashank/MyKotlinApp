package com.example.mykotlinapp.MyPractice

fun main(args:Array<String>){
    var a = 10
    var b = 12

    println("Before Swaping Number : A = $a , B = $b")

    b -= a
    a += b
    b = a-b

    println("After Swaping Number : A = $a, B = $b")

}