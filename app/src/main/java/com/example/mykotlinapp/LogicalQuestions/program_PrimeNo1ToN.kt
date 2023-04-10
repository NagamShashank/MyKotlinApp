package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    println("Enter Number To print Prime Numbers : ")
    val num = readLine()!!.toInt()
    printPrime(num)
}

fun printPrime(N:Int){
    var temp = 0
    for(i in 1..N){
        for( j in 2 until i){
            if(i % j ==0){
                temp += 1
            }
        }
        if(temp ==0){
            print("$i ")
        }else{
            temp =0
        }
    }
}