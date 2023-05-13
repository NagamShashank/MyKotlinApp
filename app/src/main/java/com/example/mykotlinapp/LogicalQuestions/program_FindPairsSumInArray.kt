package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){

    val numbers = arrayListOf(80, 60, 10, 50, 30, 100, 0, 50)
    val sum = 40

    pairs(sum,numbers)
}

fun pairs(sum:Int,array:ArrayList<Int>){
    var count = 0

    for(i in 0 until  array.size){
        for(j in i+1 until array.size){
            if((array[i]+array[j]) == sum){
                count++
                println("("+array[i]+","+array[j]+")")
            }

        }
    }

    println("Total Count is : $count")
}

// Time complexity is O(n x n)
