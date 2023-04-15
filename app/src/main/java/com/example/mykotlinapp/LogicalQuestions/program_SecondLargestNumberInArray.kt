package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    val numarray = arrayListOf(12,34,55,67,90,10,44,19)

    var max = numarray[0]
    var max2 = numarray[0]

    for(i in 0 until numarray.size){
        if(numarray[i] > max){
            max = numarray[i]
        }
        if(numarray[i]  < max){
            max2 = numarray[i]
        }
    }


    println("Second Highest In Array : $max2")
}