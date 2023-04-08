package com.example.mykotlinapp.LogicalQuestions

fun main (args:Array<String>){
    println("Enter a String : ")
    val s = readLine().toString()

    val check = stringPalindrome(s)
    if(check){
        println("String is Palindrome")
    }else{
        println("String is not Palindrome")
    }

}

fun  stringPalindrome(name : String): Boolean {
    val S = name

    var L = name.length -1
    var temp = ""

    while(L>=0){
        temp += name[L]
        L--
    }

    return S == temp

}