package com.example.mykotlinapp.ScopeFunctions

class Employee{
    var empName:String = ""
    var empAge:Int=0
    var empSalary:Int=0

}

fun main (args:Array<String>){
    val employee = Employee().apply {
        empName = "Prakash Shinde"
        empAge = 26
        empSalary = 10500
    }

    val display:Int =  with(employee){
        println(empName)
        println(empAge)
        //println(empSalary)
        empSalary + 100
    }

    println(display)

    employee.also {
        it.empName = "Amit Girkar"
        println("New name is : ${it.empName}")
    }
}