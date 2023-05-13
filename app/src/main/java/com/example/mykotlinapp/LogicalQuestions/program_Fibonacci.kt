package com.example.mykotlinapp.LogicalQuestions
// __________________________________With Recursion_______________________________________
//fun main(args:Array<String>){
//    println("Enter a Number to Print Fibonacci : ")
//    var num = readLine()!!.toInt()
//    println(fibonacci(num))
//}
//
//fun fibonacci(count:Int,first:Int = 0,second:Int =1,result:MutableList<Int> = mutableListOf()):MutableList<Int>{
//    return if(count > 0){
//        result.add(first)
//        fibonacci(count-1,second,first+second,result)
//    }else{
//        result
//    }
//}



//_____________________________________WithOut Recursion_________________________________



fun main(args:Array<String>){
    println("Enter a Number to Print Fibonacci : ")
    val num = readLine()!!.toInt()
    var n1 = 0
    var n2 = 1

    for(i in 0..num){
        print("$n1 ")
       val sum = n1+n2
        n2 = n1
        n1 = sum
    }

}