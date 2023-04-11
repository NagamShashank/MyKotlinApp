package com.example.mykotlinapp.ScopeFunctions

class PersonClass{
    var name : String = "Shashank Nagam"
    var position : String = "Android Developer"
    var age: Int = 21
}

fun main(args: Array<String>) {
    val person : PersonClass ? = PersonClass()

    val afterFiveYrs = person?.run   {
        println(name)
        println(position)
        println(age)
        age + 5
    }

    println("Age after 5 Years is : $afterFiveYrs")
}