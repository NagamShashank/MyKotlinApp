package com.example.mykotlinapp.MyPractice

class myData(){
    infix fun display(name : String){
        println("Name is $name")
    }
}

fun main(args:Array<String>){
    val obj = myData()
    obj display "Shashank Nagam"

}