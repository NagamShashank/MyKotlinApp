package com.example.mykotlinapp

fun main(args:Array<String>){


//    var str1 = "Shashank"
//
//    var str2 = "Shas"
//
//    println(str1.compareTo(str2))


//    var Str = "Shashank"
//
//    println(Str.getOrNull(0))
//    println(Str.getOrNull(4))
//    println(Str.getOrNull(8))
//    println(Str.getOrNull(10))

//    val num = 1244
//    println(num.toString())

//    val names = arrayOf("rohan","mohan","nitin","ritik")

//    println(names[0])
//    println(names[2])
//
//    names.set(2,"mahesh")
//
//    println(names.get(2))
//
//    println(names.size)

//    for(i in names){
//        println(i)
//    }

//    if("mahesh" in names){
//        println("It exists")
//    }else{
//        println("It Does Not exists")
//    }

//    for (char in ('A'..'G').reversed()){
//        println(char)
//    }


//    println("Enter a Number  : ")
//    val num1 = readLine()!!.toInt()
//    println("Enter a Number Y : ")
//    val num2 = readLine()!!.toInt()

//    println("Sum of $num1 and $num2 is : "+ sum(num1,num2))

    println("Enter a Number  : ")
    val num1 = readLine()!!.toInt()

    println("Factorial of given Number is : "+ fact(num1))

}

//fun sum(a:Int,b:Int) : Int{
//
//    val c = a + b
//    return c
//
//}


fun fact(r:Int) : Int{
    val num : Int

    if(r <= 1){
        num = r
    }else{
        num = r*fact(r-1)
    }
    return num
}