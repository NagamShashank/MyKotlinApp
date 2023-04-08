package com.example.mykotlinapp.OOPS_Programs


 abstract class Age{
     abstract fun Calculate(a:Int)
 }

class Sub: Age(){
    override fun Calculate(a: Int) {
       if(a>=18){
           println("Eligible for Voting")
       } else{
           println("Not Eligible for Voting")
       }
    }
}

fun main(args:Array<String>){

    println("Enter your Age ")
    val num = readLine()!!.toInt()
    val obj = Sub()
    obj.Calculate(num)
}