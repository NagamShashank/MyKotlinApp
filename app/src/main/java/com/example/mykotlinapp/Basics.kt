package com.example.mykotlinapp

import kotlin.reflect.KFunction1

class CompanionClass{

    companion object{
        fun sum(A:Int,B:Int){
            val C = A+B
            println("Addition of $A and $B is : $C")
        }
    }

    fun sub(P:Int,Q:Int){
        val R = P-Q
        println("Subtraction of $P and $Q is : $R")
    }

}

fun main(args:Array<String>){

   CompanionClass.sum(20,40)
    CompanionClass().sub(90,20)

}

