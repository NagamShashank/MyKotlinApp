package com.example.mykotlinapp

class BaseHead{
    var name  = "RamChandra"
    var age = 24
}

fun main(args:Array<String>){

    var hc = BaseHead()

    hc.apply {
        name = "Rohan"
        age = 35

    }

   with(hc) {
        println(name)
        println(age)
    }

}