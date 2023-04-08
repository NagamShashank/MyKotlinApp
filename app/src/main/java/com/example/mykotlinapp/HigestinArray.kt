package com.example.mykotlinapp

fun main(args:Array<String>){
    val NumArray = arrayOf(1,3,56,29,12,10,6,8)

    var max = NumArray[0]
    var max2 = NumArray[0]
    var min = NumArray[0]
    for(i in 1..NumArray.size){
        if(i > max){
            max = NumArray[i]
        }else if (i < min){
            min = NumArray[i]
        }

    }

    for(j in 1..NumArray.size){
        if (NumArray[j] < max){
            max2 = NumArray[j]
        }
    }
    println("Highest in array is : $max")
    println("Smallest in array is : $min")
    println("Second Highest in array is : $max2")
}