package com.example.mykotlinapp.MyPractice

sealed class Fruit(val i : String){

    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")

}

class Banana : Fruit("Banana")

fun display(fruit : Fruit){
    when(fruit){
        is Fruit.Apple -> println("${fruit.i} is good for Iron")
        is Banana -> println("${fruit.i} is good in Taste")
        is Fruit.Mango -> println("${fruit.i} is delicious")
    }
}

fun main(args:Array<String>){
val obj = Fruit.Apple()
    val obj2 = Fruit.Mango()
    val obj3 = Banana()

    display(obj)
    display(obj2)
    display(obj3)


}
