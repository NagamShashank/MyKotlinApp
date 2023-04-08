package com.example.mykotlinapp

open class over{
    open fun call(){
        println("This is call function with no parameters")
    }

    open fun call(A: Int){

        println("This is call function with Parameters")

        if(A%2==0){
            println("Number is Even")
        }else{
            println("Number is Odd")
        }
    }
}

fun main(args: Array<String>){

    var objOver = over()

    print("Enter a Number : ")
    var num = readLine()!!.toInt()

    objOver.call()

    objOver.call(num)

}