package com.example.mykotlinapp

import java.util.*

fun main(args:Array<String>){
    println("Enter String 1 : ")
    var word = readLine()!!.toString()
    println("Enter String 2 : ")
    var word2 = readLine()!!.toString()

    val string1 = word.toCharArray()
    val string2 = word2.toCharArray()

    Arrays.sort(string1)
    Arrays.sort(string2)



    val sortString1 = String(string1)
    val sortString2 = String(string2)

    if(sortString1==sortString2){
        println("Strings are Anagram")
    }else{
        println("Strings are not Anagram")
    }

}