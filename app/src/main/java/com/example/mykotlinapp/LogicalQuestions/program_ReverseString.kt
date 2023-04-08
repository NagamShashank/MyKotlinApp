package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    println("Enter a String To Reverse : ")
    val word = readLine()!!.toString()

    println("Reverse of String is : " + reverseString(word))

}

fun reverseString(wordS:String):String{

    val S = wordS

    var L = S.length -1
    var temp = ""

    while(L>=0){
        temp = temp + S[L]
        L--
    }

    return temp
}