package com.example.mykotlinapp

fun main(args: Array<String>){
    print("Enter Number X = ")
    var X = readLine()!!.toInt()
    print("Enter Number Y = ")
    var Y = readLine()!!.toInt()
    println("Addtion of X and Y is : "+ add(X,Y))
    println("Subtraction of X and Y is : "+ sub(X,Y))
    println("Product of X and Y is : "+ product(X,Y))
    println("Division of X and Y is : "+ Div(X,Y))


    var i = 10

    for(m in 0..i){
        println(m)
        if(m==5){
            continue
        }
    }
}

fun add(i: Int, j: Int): Int {
    return i + j
}

fun sub(i: Int, j: Int): Int {
    return i - j
}

fun product(i: Int, j: Int): Int {
    return i * j
}

fun Div(i: Int, j: Int): Int {
    return i / j
}
