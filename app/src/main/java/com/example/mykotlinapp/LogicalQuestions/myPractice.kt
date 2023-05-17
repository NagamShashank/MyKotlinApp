package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){

    println("Enter Age : ")
    val age = readLine()!!.toInt()

    if(age <= 18 ){
        throw ArithmeticException("Under Age")
    }else{
        println("Eligible")
    }

}