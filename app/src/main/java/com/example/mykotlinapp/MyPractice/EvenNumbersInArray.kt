package com.example.mykotlinapp.MyPractice

fun main(args:Array<String>){
    val myArray = arrayListOf<Int>(1,24,56,87,10,12,40,71)
    for(i in myArray){
        if(i %2 == 0){
            print("$i ")
        }
    }
}

