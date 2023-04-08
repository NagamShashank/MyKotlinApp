package com.example.mykotlinapp

fun main(args:Array<String>){

    //Fibonacci Series
   /*print("Enter a number : ")
    var num = readLine()!!.toInt()
    var num1 = 0
    var num2 = 1
    for(i in 1..num){

        var sum = num1+num2
        num1 = num2
        num2 = sum
        print("$num1 ")
    }*/

    var i = 0


    println("Enter the Number of elements you want to enter")
    var num = readLine()!!.toInt()

    var numarray = IntArray(num)

    println("Enter your elements : ")

    while(i < num){
        numarray[i] = readLine()!!.toInt()
        i++
    }

    println("Entered Elements are : ")
    for(j in numarray){
        print("$j ")
    }

    println()

    var max = numarray[0]
    var max2 = numarray[0]
    var min = numarray[0]


    for (h in 0..numarray.size){

        if (h > max){
            max = h
        }

        if (h < min){
            min = h
        }
    }

    println("Highest Element in the array is : $max")

    println("Smallest Element in the array is : $min")


}