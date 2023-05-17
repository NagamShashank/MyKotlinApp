package com.example.mykotlinapp


//Extension Function Example....................

class Operation{
    fun square(Num:Int){
        println("Square of $Num is :"+(Num*Num))
    }
}

fun Operation.squareRoot(number:Int): Int {
    var i =0
    var result =0
    while(result <= number){
        i++
        result = i*i
    }
    return i-1
}

infix fun Operation.evenOddCheck(n : Int){
    if(n%2 == 0){
        println("Number is Even")
    }else{
        println("Number is Odd")
    }
}

fun main(args:Array<String>){
    println("Enter a Number : ")
    val N = readLine()!!.toInt()

    val obj = Operation()
    obj.square(N)
    println("SquareRoot of $N is : "+obj.squareRoot(N))

    obj evenOddCheck N
}



// Inline Function Example........................
//fun main(args:Array<String>){
//    println("Enter a Number : ")
//    val N = readLine()!!.toInt()
//    println("SquareRoot of $N is : " + squareRoot(N))
//}
//
//inline fun squareRoot(number:Int): Int {
//    var i =0
//    var result =0
//    while(result <= number){
//        i++
//        result = i*i
//    }
//    return i-1
//}


