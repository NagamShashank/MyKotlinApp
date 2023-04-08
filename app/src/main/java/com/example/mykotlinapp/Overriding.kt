package com.example.mykotlinapp


open class Ride(){

    open fun vechile(){

        val Vname = "Mercedes"
        println("Car name is : $Vname")
    }

}

class LongRide():Ride(){
 override fun vechile(){

     val LVname = "Tata Nexon"
     println("Car name is : $LVname")
 }

}

fun main(args: Array<String>){

    val objV = LongRide()

    println(objV.vechile())

}