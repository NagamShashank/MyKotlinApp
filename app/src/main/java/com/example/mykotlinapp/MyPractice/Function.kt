package com.example.mykotlinapp.MyPractice

fun main(args:Array<String>){
    println("Enter a Number : ")
    val number = readLine()!!.toInt()
    var check = operation(number)
    if(check){
        println("Number is Palindrome")
    }else {
        println("Number is not Palindrome")
    }
}

fun operation( num : Int):Boolean{
    if(num <= 0){
        return false
    }
    var rev = 0
    var newNum = num
    while(newNum != 0){
        val rem = newNum % 10
        rev = rev *10 +rem
        newNum /= 10
    }
    return num == rev
}