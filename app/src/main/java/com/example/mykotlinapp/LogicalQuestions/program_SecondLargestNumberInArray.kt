package com.example.mykotlinapp.LogicalQuestions


// Second Largest Element Without Deleting duplicate Elements

fun main(args:Array<String>){
    val numarray = arrayListOf(12,34,55,80,67,67,90,10,44,12,19)

    var max = numarray[0]
    var max2 = numarray[0]

    for(i in 0 until numarray.size){
        if(numarray[i] > max){
            max = numarray[i]
        }

    }

    numarray.sort()
    for(j in numarray.size-2 downTo 0){
        if (numarray[j] != numarray[numarray.size-1])
            max2 = numarray[j]
            break
    }

    println("Second Highest In Array : $max2")
}