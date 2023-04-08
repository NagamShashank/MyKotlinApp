package com.example.mykotlinapp

fun main(args: Array<String>){

   /* val arr = arrayOf(1,2,3)
    try {

        println(arr[5])
    }catch (e: Exception){
        println("Please check the array Index Provided")
    }
    finally {
        println("This will Execute Inspite of Any Error Occurs")
    }   */

    println("Please enter a positive number : ")

    val num = readLine()!!.toInt()
    if(num <= 0){
        throw IllegalArgumentException("Entered number is not a positive Number !!!!")
    }else{
        println("Your entered number is : $num")
    }

}