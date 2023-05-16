package com.example.mykotlinapp.MyPractice

fun main(args:Array<String>){
      val day = DAYS.THURSDAY
      day.printFormattedDay()


//    println(day)

//    for(i in DAYS.values()){
//        println(i)
//    }
}

enum class DAYS{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    fun printFormattedDay(){
        println("Day is $this")
    }
}