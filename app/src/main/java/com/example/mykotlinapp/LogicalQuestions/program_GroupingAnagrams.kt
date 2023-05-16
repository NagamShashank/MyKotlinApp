package com.example.mykotlinapp.LogicalQuestions

import java.util.Arrays

fun main(args:Array<String>){
    val words = arrayListOf("eat","tea","tan","ate","nat","bat")

//    for(k in newArray){
//        println(k)
//    }
    anagramPairs(words)
}

fun anagramPairs(array:ArrayList<String>){

    val newArray = arrayListOf<String>()
    for(i in 0 .. array.size-1){

        for(j in i+1 .. array.size-1){

            val myString = array[i].toCharArray()
            val myString2 = array[j].toCharArray()

            Arrays.sort(myString)
            Arrays.sort(myString2)
            val newMyString = String(myString)
            val newMyString2 = String(myString2)

            if(newMyString == newMyString2){
                println("( " + array[i] +" , "+ array[j]+ " )")
            }

            newArray.add(newMyString)

        }

    }


}