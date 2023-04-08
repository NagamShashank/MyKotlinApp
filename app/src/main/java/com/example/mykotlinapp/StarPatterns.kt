package com.example.mykotlinapp

fun main(args:Array<String>){

    println("Enter Number Of Rows Below : ")
    var Rows = readLine()!!.toInt()

//    *
//    **
//    ***
//    ****
//    *****
//    for (i in 0..Rows){
//        for(j in 1..i){
//            print(" *")
//        }
//        println()
//    }



//    *****
//     ****
//      ***
//       **
//        *
//    for(i in 0..Rows){
//        for(j in 1..i){
//            print(" ")
//        }
//        for(k in 1..(Rows-i) ){
//            print("*")
//        }
//        println()
//    }



//    *****
//    ****
//    ***
//    **
//    *
//    for(i in Rows downTo 0){
//        for(j in 1 .. i ){
//            print("*")
//        }
//        println()
//    }



//         *
//        **
//       ***
//      ****
//     *****
//    for(i in Rows downTo 0){
//        for(j in 1..i){
//            print(" ")
//        }
//        for(k in 1..(Rows-i)){
//            print("*")
//        }
//        println()
//    }

// Diamond
    for(i in Rows downTo 0){
        for(j in 1..i){
            print(" ")
        }
        for(k in 1..(Rows-i)){
            print(" *")
        }
        println()
    }
    for(l in 1..Rows){
        for(m in 1..l){
            print(" ")
        }
        for(n in 1..(Rows-l)){
            print(" *")
        }
        println()
    }


}