package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    println("Enter a Number : ")
    val num = readLine()!!.toInt()

    println("Square Root of $num is "+ squareRoot(num))
}

fun squareRoot(N:Int): Int {
    var i = 1
    var result = 1

    while(result <= N){
        i++
        result = i *  i
    }
    return i-1
}