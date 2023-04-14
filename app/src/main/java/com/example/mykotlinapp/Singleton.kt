package com.example.mykotlinapp

class Single{
    object SingleTonInstance{
        fun hello(){
            println("Hello World")
        }
    }
}

fun main(args:Array<String>){

    val obj1 = Single.SingleTonInstance
    val obj2 = Single.SingleTonInstance

    println(obj1.hello())

    println("Hashcode of obj1 : ${obj1.hashCode()} and obj2 : ${obj2.hashCode()}")

}