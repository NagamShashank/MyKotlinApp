package com.example.mykotlinapp

open class Baseclass{

    open fun NumC(N: Int) : Boolean{
        if(N>=0){
            println("Correct Number ..")
            return true
        }else{
            println("Wrong Number Entered ..")
            return false
        }
    }
}

open class Child1 : Baseclass(){

    fun numRev(M: Int):Int{

        var Y = M
        var rev =0
        var rem =0

        while(Y!=0){
            rem = Y%10
            rev = rev*10+rem
            Y /= 10
        }

        println("Reverse of $M is : $rev")
        return rev

    }

}

class Child2 : Baseclass(){

    fun eve(A: Int){
        if(A%2==0){
            println("Number is even ..")
        }else{
            println("Number is Odd ..")
        }
    }

}

class GrandChild : Child1(){

    fun Palin(B: Int){
        var C = numRev(B)

        if(B==C){
            println("Number is Palindrome")
        }else{
            println("Number is not Palindrome")
        }

    }

}

fun main(args: Array<String>){

    println("Enter a Number : ")
    val num = readLine()!!.toInt()

    val objP = GrandChild()

    val D = objP.NumC(num)

    if(D==true){
        objP.Palin(num)
    }

    val objE = Child2()
    val E = objE.NumC(num)

    if(E==true){
        objE.eve(num)
    }

}