package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){


    println("Enter a Number to Reverse : ")
    var num = readLine()!!.toInt()

    println("Reverse of Given Number is : "+ reverse(num))
}

fun reverse(N : Int) : Int{
    var rev = 0
    var rem = 0
    var Number = N

    while(Number!=0){
        rem = Number % 10
        rev = rev * 10 + rem
        Number /= 10
    }
    return rev
}