package com.example.mykotlinapp.ScopeFunctions

class Base{
    var name : String = "Shashank Nagam"
    var position : String = "Android Developer"
    var age: Int = 21
}

fun main(args: Array<String>) {
    val baseobj = Base()
//    with(baseobj) {
//       println(name)
//        println(position)
//    }

    val afterFiveYrs: Int = with(baseobj)  {
        println(name)
        println(position)
        println(age)
        age + 5

    }

    println("Age after 5 Years is : $afterFiveYrs")
}