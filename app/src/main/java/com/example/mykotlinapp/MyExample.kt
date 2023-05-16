package com.example.mykotlinapp

fun main(args:Array<String>){
//    val month = MyEnum.August
//    println(month)


    for(i in MyEnum.values()){
        println(i)
    }

}

enum class MyEnum{
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}