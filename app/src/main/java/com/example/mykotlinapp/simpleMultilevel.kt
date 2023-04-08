package com.example.mykotlinapp

open class NumCheck{
    fun Add(a:Int,b:Int) {

        var c = a+b;
        println("Addition of $a and $b is : $c")
    }
}

open class NumCheck2 : NumCheck() {
    fun Sub(m:Int,n:Int) {

        var p = m-n;
        println("Subtraction of $m and $n is : $p")
    }
}

class NumCheck3 : NumCheck2(){
    fun multiply(i:Int,j:Int){

        var k = i*j
        println("Product of $i and $j is : $k")
    }
}

fun main(args:Array<String>){

    println("Enter a Number X : ")
    var X = readLine()!!.toInt()

    println("Enter a Number Y : ")
    var Y = readLine()!!.toInt()

    var objNum = NumCheck3()

    objNum.Add(X,Y)
    objNum.Sub(X,Y)
    objNum.multiply(X,Y)

}