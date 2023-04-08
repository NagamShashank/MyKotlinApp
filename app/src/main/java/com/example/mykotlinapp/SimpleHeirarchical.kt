package com.example.mykotlinapp

open class CheckNum{
    fun  Check_Num(a:Int): Boolean {
        if(a>=0){
            println("Correct number ")
            return true
        }else{
            println("Wrong Number ")
            return false
        }
    }
}

class EvenOdd : CheckNum(){

    fun Checkevenodd(b:Int){
        if(b%2==0){
            println("Number is Even")
        }else{
            println("Number is Odd")
        }
    }
}

class Reverse : CheckNum(){

   fun CheckReverse(m:Int){
       var Y = m

       var rev = 0
       var rem = 0

       while(Y!=0){
           rem = Y % 10
           rev = rev * 10 + rem
           Y /= 10
       }

       println("Reverse of $m is : $rev")
   }
}

fun main(args: Array<String>){

    println("Enter a Number : ")
    var D = readLine()!!.toInt()

    var objrev = Reverse()

    var Dnum = objrev.Check_Num(D)

    if(Dnum == true){
        objrev.CheckReverse(D)
    }

    var objevenodd = EvenOdd()

    var Enum = objevenodd.Check_Num(D)

    if(Enum==true){
        objevenodd.Checkevenodd(D)
    }

}