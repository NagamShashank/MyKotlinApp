package com.example.mykotlinapp.MyPractice

fun main(args:Array<String>){
    println("Enter a String : ")
    var entString = readLine().toString()

    println("After Reversering String =" + reverseString(entString))


}

fun reverseString(string : String) : String {

    //val stringArr = string.toCharArray()
    val newStringArr = ""

    var length = string.length - 1
    var tempString = ""

    while(length >= 0){
        tempString += string[length]
        length--
    }

    return tempString

}
