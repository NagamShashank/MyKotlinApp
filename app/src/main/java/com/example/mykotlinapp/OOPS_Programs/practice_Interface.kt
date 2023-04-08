package com.example.mykotlinapp.OOPS_Programs

import kotlin.math.pow


interface Check{
    fun CheckNumber(a:Int)
}

interface CheckEve{
    fun CheckEvenOdd(b:Int)
    fun ArmStrong(E:Int)
}

interface Factorial{
    fun fact(c:Int)
    fun fibo(d:Int)
}

class Operation : Check,CheckEve,Factorial{
    override fun CheckNumber(a: Int) {
        if(a>=0){
            println("Number is Positive")
        } else{
            println("Number is Negative")
        }
    }

    override fun CheckEvenOdd(b: Int) {
        if(b %2 ==0 ){
            println("Number is Even")
        }else{
            println("Number is Odd")
        }
    }

    override fun ArmStrong(E: Int) {
        var count = 0
        var EInt = E
        var rem = 0
        var result = 0

        while (EInt !=0){
            EInt /= 10
            count++
        }

        var EInt2 = E
        while(EInt2!=0){
            rem = EInt2 % 10
            result = (result+ rem.toDouble().pow(count)).toInt()
            EInt2 /= 10
        }

        if(E == result){
            println("Number is ArmStrong")
        }else{
            println("Number is Not ArmStrong")
        }
    }

    override fun fact(c: Int) {
        var f = 1
        for(i in 1..c){
            f *= i
        }
        println("Factorial of $c is : $f")
    }

    override fun fibo(d: Int) {
        var t1 =0
        var t2 =1
        println("Fibonacci Series :")
        for(j in 1..d){
            print("$t1 ")
            val sum = t1 +t2
            t1 = t2
            t2 = sum
        }
        println()
    }
}

fun main(args:Array<String>){
println("Enter a Number X : ")
    val N = readLine()!!.toInt()
     val obj = Operation()
    obj.CheckNumber(N)
    obj.CheckEvenOdd(N)
    obj.fact(N)
    obj.fibo(N)
    obj.ArmStrong(N)
}