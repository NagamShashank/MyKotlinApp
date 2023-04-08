package com.example.mykotlinapp

fun main(args: Array<String>){

    val i =10
    val j = 20

    val sc = School("Shashank",21)
    val sch = School("Rohan",18)


    println(sc.name)
    println(sc.Roll)
    println(sc.present())
    println(sc.absent())



}

class School(var name:String,var Roll:Int){

    fun present() {
        println("$name is Present")
    }

    fun absent(){
        println("$name is Absent")
    }

}