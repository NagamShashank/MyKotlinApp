package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    val arrayNum = arrayListOf<Int>(1,2,4,6,7)
    val missingNumbers = mutableListOf<Int>()
    val sortedArray = arrayNum.sorted()

    for(i in 1 until sortedArray.size){
        val diff = sortedArray[i] - sortedArray[i-1]
        if(diff > 1){
            for(j in 1 until diff){
                missingNumbers.add(sortedArray[i-1]+j)
            }
        }
    }

    println("Missing Numbers are : ")
    for ( item in missingNumbers){

        print("$item ")
    }

}