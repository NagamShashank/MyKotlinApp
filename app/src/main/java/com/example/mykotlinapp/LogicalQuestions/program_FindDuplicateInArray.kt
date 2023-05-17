package com.example.mykotlinapp.LogicalQuestions

fun main(args:Array<String>){
    val arraynum = arrayListOf(12,34,55,67,90,10,44,19,90,12,55)
    val duplicates = mutableListOf<Int>()
    for(i in 0 until  arraynum.size){
        for(j in i+1 until arraynum.size){
            if(arraynum[i] == arraynum[j]){
                duplicates.add(arraynum[i])
            }

        }
    }
    println("Duplicate Numbers are :")
    for(e in duplicates){
        print("$e ")
    }
}


//fun main(args:Array<String>){
//    val arraynum = arrayListOf(12,34,55,67,90,10,44,19,90,12,55)
//    val duplicates = mutableListOf<Int>()
//    for(i in 0 until  arraynum.size){
//        for(j in i+1 until arraynum.size){
//            if(arraynum[i] == arraynum[j]){
//                duplicates.add(arraynum[i])
//            }
//
//        }
//    }
//    var duplicateElements = List<Int>()
//    for (k in arraynum){
//        duplicateElements.add(k)
//    }
//    println("array without duplicates:"+ duplicateElements)
//    for(e in duplicates){
//
//        print("$e ")
//    }
//}

