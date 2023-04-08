package com.example.mykotlinapp

open class Hello{
 open fun checkNum(n:Int): Boolean {
    if(n<=0){
        println("Invalid Number ")
        return false
    }else{
        println("Correct Number ")
        return true
    }
 }
}

open class NumberRev : Hello(){

    open fun rev(a:Int): Int {
        var b = a
        var rev =0
        var rem =0
        while(b!=0){
            rem = b % 10
            rev = rev * 10 + rem
            b /= 10
        }
        //println("Reverse of Number is : $rev")
        return rev
    }

}
 class EvenOddCheck: Hello(){
     fun Eve(eveNum:Int){
         if(eveNum % 2==0){
             println("Number is Even")
         } else{
             println("Number is Odd")
         }
     }
 }

class PalinCheck : NumberRev(){
    fun Palin(Pnum:Int){
        val X = rev(Pnum)
        if(Pnum == X){
            println("Number is Palindrome")
        }else{
            println("Number is not Palindrome")
        }
    }
}

fun main(args:Array<String>){

    println("Enter a Positive Number :")
    val number = readLine()!!.toInt()

    val obj = NumberRev()
    val result = obj.checkNum(number)
    if(result){
        obj.rev(number)

    }

    val obj2 = EvenOddCheck()
    val result2 = obj2.checkNum(number)
    if(result2){
        obj2.Eve(number)
    }

    val obj3 = PalinCheck()
    obj3.Palin(number)

}