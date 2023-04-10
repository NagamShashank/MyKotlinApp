package com.example.mykotlinapp

fun main(args:Array<String>){

    println("Enter a Number : ")
    val num = readLine()!!.toInt()

    if (checkPrime(num)){
        println("Number is Prime")
    }else{
        println("Number is not Prime")
    }

}

fun checkPrime(number :Int): Boolean{
    if(number < 2) return false

    for(i in 2..number/2){
        if(number % i==0) return false
        else{
            print("$i ")
        }
    }
    return true
}