package com.example.mykotlinapp

fun main(args: Array<String>){
    var obj2 = show2()

    var obj = show()

    println("Enter a Number X : ")
    var X = readLine()!!.toInt()
    println("Enter a Number Y :")
    var Y = readLine()!!.toInt()

    obj2.method(X,Y)
    obj.method(X,Y)

    println(obj2.hint)

    println(obj.hint)


}

open class show(){

    open val hint = "Show Class"

open fun method(a:Int, b:Int){
    var l = a-b

    println("Subtraction of $a and $b is : $l")
}

}

class show2(): show(){

    override val hint = "Show Class 2"

    override fun method(a:Int, b:Int){
        var m = a+b

        println("Addtion of $a and $b is : $m")
    }

}