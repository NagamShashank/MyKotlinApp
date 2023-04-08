package com.example.mykotlinapp

class Head{
    var name = "Shashank"
    var age = 21
}

fun main(args:Array<String>){

    val objH = Head()

    val detail:Int  =  with(objH){
        println(name)
        println(age)
        age +5
    }

    println("New age is : $detail")

}