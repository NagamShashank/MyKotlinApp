package com.example.mykotlinapp

interface Add{
    abstract fun Addition(a: Int,b: Int)
}

interface Sub{
   abstract  fun Subtraction(p: Int,q: Int)
}

class perform : Add,Sub{

    override fun Addition(a: Int,b: Int) {
        var c = a+b
        println("Addition is : $c")
    }

    override fun Subtraction(p: Int,q: Int) {
        var l = p-q
        println("Subtraction is : $l")
    }

}

fun main(args:Array<String>){

    val objP = perform()

    print("Enter number X : ")
    var m = readLine()!!.toInt()

    print("Enter number Y : ")
    var n = readLine()!!.toInt()

    objP.Addition(m,n)
    objP.Subtraction(m,n)

}