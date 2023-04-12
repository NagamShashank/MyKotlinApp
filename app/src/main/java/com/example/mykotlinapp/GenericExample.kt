package com.example.mykotlinapp
//Generic Class Example..................
//class MyGeneric<T>(Name:T,Age:T){
//    var age = Age
//    var name = Name
//    init {
//        println("$age  $name")
//    }
//}
//
//fun main(args:Array<String>){
//    var age = MyGeneric("Shashank",26)
//}




//Generic Method Example..................
fun main(args:Array<String>){
    val names = arrayListOf("shashank","Tanmay","Shoeb","Shubham","Sanket")
    val ages = arrayListOf(26,22,21,20,27,26)

    generic(names)
    generic(ages)
}

fun <T>generic(list:ArrayList<T>){
    for(item in list){
        println(item)
    }
}