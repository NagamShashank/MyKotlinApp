package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    val numarray = arrayOf(12,34,55,67,90,10,44,19)

    var max = numarray[0]
    var max2 = numarray[0]

    for(i in 1.. numarray.size){
        if(i > max){
            max = numarray[i]
        }
    }

    for(j in 1.. numarray.size){
        if(numarray[j] < max){
            max2 = numarray[j]
        }
    }

    println("Second Highest In Array : $max2")
}