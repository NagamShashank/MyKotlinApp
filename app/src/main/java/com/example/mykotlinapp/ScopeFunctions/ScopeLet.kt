package com.example.mykotlinapp.ScopeFunctions

fun main(args:Array<String>){
    val name: String? = "Shashank"

    val stringLength = name?.let {
        println(it.capitalize())
        println(it.reversed())
        it.length
    }

    println(stringLength)

}