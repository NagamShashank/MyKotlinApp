package com.example.mykotlinapp

fun main(args: Array<String>){

    var obj = A()

    println("Enter number X : ")
    var i = readLine()!!.toInt()
    println("Enter number Y : ")
    var j = readLine()!!.toInt()

    var resultsum = obj.sum(i,j)
    var resultsub = obj.sub(i,j)

    println("Addition is : $resultsum")
    println("Subtraction is : $resultsub")

    //println(obj.sum(i,j))
    //println(obj.sub(i,j))

}

class A(){
    fun sum(a:Int,b:Int):Int{
        var c = a + b
        //println("Addition of $a and $b is $c")

        return c
    }

    fun sub(p:Int,q:Int):Int{
        var r = p-q
        //println("Subtraction of $p and $q is $r")

        return r
    }
}



