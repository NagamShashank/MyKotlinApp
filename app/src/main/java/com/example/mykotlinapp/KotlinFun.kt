package com.example.mykotlinapp

import kotlin.math.pow

fun main(args: Array<String>){
    println(addition(2,8,))
    println(power(0.2,0.2))

}

fun addition (a: Int,b: Int):Int {
    return a+b
}

fun power (a:Double,b:Double):Double{
return a.pow(b);
}
