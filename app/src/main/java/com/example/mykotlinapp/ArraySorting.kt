package com.example.mykotlinapp

import java.util.Scanner

fun main(args: Array<String>){

    val sc = Scanner(System.`in`)

    var i = 0
    //println("Enter Number of Elements To be entered in Array")
    //val num = sc.nextInt()

    val arrnum = arrayOf(10,67,36,21,12,90,54,24)

    println("The Array is :")
    for(j in arrnum){
        print("$j ")
    }

    println()

    println("Array in Ascending Order : ")
    arrnum.sort()
    for(x in arrnum){
        print("$x ")
    }

    println()

    println("Array in Descending Order :")
    arrnum.sortDescending()

    for(y in arrnum){
        print("$y ")
    }

}