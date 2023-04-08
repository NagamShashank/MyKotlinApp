package com.example.mykotlinapp

fun main(args:Array<String>){

    //Swap Number
    /*print("Enter number X = ")
    var X = readLine()!!.toInt()
    print("Enter number Y = ")
    var Y = readLine()!!.toInt()

    //var temp = Int

    var temp = X
    X = Y
    Y = temp

    println("X = $X")
    println("Y = $Y")*/

    //reverse number

    print("Enter Number you want to Reverse : ")
    var n = readLine()!!.toInt()
    var check = n
    //Reverse(n)

    var m = Reverse(n)

    println("Reverse of Given Number is : $m")

    if (check==m){
        println("Number is Palindrome ")
    }else{
        println("Number is not Palindrome")
    }

    rec()

}
var count =0
fun rec() {
    count++
    if(count<=5){
        println("hello$count")
        rec()
    }

}

fun Reverse(X: Int): Int {

    var Y = X

    var rev = 0
    var rem = 0

    while(Y!=0){
        rem = Y % 10
        rev = rev * 10 + rem
        Y /= 10
    }

    return rev

}
