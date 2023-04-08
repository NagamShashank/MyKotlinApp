package com.example.mykotlinapp

interface simple{
    abstract fun numrev(a:Int)
    abstract fun numeveodd(b:Int)

}

class Base : simple{

    override fun numrev(p:Int) {
        var Y = p

        var rev = 0
        var rem = 0

        while(Y!=0){
            rem = Y % 10
            rev = rev * 10 + rem
            Y /= 10
        }

        println("Reverse of $Y is : $rev")
    }


    override fun numeveodd(b: Int) {
        if(b%2==0){
            println("Number is EVEN")
        }else{
            println("Number is ODD")
        }
    }

}

fun main(args:Array<String>){

    print("Enter a number : ")
    var n = readLine()!!.toInt()

    var objBase = Base()

    objBase.numeveodd(n)
    objBase.numrev(n)

}