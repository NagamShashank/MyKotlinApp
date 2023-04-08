package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    val numarray = arrayOf(10,25,36,78,90,15,20,25)
    val numarrayeven = arrayOf<Int>()
    val arraynum = numarrayeven.toMutableList()
    for(i in numarray){
        if(i % 2==0){
            arraynum.add(i)
        }
    }

    for(j in numarray){
        print("$j ")
    }

    println("Even Numbers from List are :")
    for(k in arraynum){
        print("$k ")
    }
}