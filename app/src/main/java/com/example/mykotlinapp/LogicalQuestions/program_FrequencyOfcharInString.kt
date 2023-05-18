package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    println("Enter a String : ")
    val enteredString = readLine()!!.toString()

    checkFrequency(enteredString)

}

fun checkFrequency(enString: String) {
    val newString = enString.lowercase()

    val myMapArray = mutableMapOf<Char,Int>()

    for(mychar in newString){
        if(myMapArray.containsKey(mychar)){
            myMapArray[mychar] = myMapArray[mychar]!! + 1
        }else{
            myMapArray[mychar] = 1
        }
    }

    for((i,j) in myMapArray){
        println("$i = $j")
    }

}
