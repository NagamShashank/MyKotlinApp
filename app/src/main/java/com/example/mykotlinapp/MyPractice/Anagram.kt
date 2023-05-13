package com.example.mykotlinapp.MyPractice

import java.util.Arrays

fun main(args:Array<String>){
    println("Enter 1st String : ")
    val enteredString = readLine()!!.toString()

    println("Enter 2nd String : ")
    val enteredString2 = readLine()!!.toString()

    val newString = enteredString.toCharArray()
    val newString2 = enteredString2.toCharArray()

    Arrays.sort(newString)
    Arrays.sort(newString2)

    val sortString = String(newString)
    val sortString2 = String(newString2)

    if(sortString == sortString2){
        println("Entered Strings are Anagrams")
    }else{
        println("Entered Strings are Not Anagrams")
    }

}