package com.example.mykotlinapp

fun main(args: Array<String>){




    println("Choose any one triangle to print : ")
    println("1. Right Angled Triangle\n 2. Flipped Right Angled Triangle\n 3. Mirrored Right Angle Triangle\n 4. Flipped Mirrored Right Angle Triangle")
    var triangle = readLine()?.toInt()

    println("Enter Number of rows you want to enter : ")
    var num = readLine()!!.toInt()

    when(triangle){

        /*

        *
        **
        ***
        ****
        *****

        */
        1 ->
            for(r in 1..num!!){
                for(c in 1..r){
                    print("*")
                }
                println()
            }

        2 ->
            for(r in num downTo 1){
                for(c in 1..r){
                    print("*")
                }
                println()
            }

        3 ->
            for (r in num!! downTo 1){
                for (c in 1..r){
                    print(" ")
                }
                for (d in 0..(num-r)){
                    print("*")
                }
                println()
            }

        4 ->
            for(r in 1..num!!){
                for(c in 1..r){
                    print(" ")
                }
                for(d in 0..(num-r)){
                    print("*")
                }
                println()
            }

        else -> println("Entered Invalid Option")

    }

    //Right Angle Triangle
    /*for(r in 1..num!!){
        for(c in 1..r){
            print("*")
        }
        println()
    }*/

    //Flip Right Angle Triangle
       /* for(r in 5 downTo 1){
            for(c in 1..r){
                print("*")
            }
            println()
        }*/

    //Mirrored Right Angle Triangle
    /*for (r in num!! downTo 1){
        for (c in 1..r){
            print(" ")
        }
        for (d in 1..(num-r)){
            print("*")
        }
        println()
    }*/

    //Flipped Mirrored Right Angle Triangle

    /*for(r in 1..num!!){
        for(c in 1..r){
            print(" ")
        }
        for(d in 0..(num-r)){
            print("*")
        }
        println()
    }*/

}