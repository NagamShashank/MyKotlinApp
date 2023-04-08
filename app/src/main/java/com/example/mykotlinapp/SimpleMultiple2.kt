package com.example.mykotlinapp

interface StarPyramid{
    abstract fun Pyramid(N : Int)
}

interface StarDiamond{
    abstract fun Diamond(M : Int)
}

class Star : StarPyramid,StarDiamond{

    override fun Pyramid(N: Int) {
        for (r in N!! downTo   0){
            for (y in 1..r){
                print(" ")
            }
            for(z in 1..(N-r)){
                print("* ")
            }
            println()
        }
    }

    override fun Diamond(M: Int) {

        for (row in M!! downTo   0){
            for (S in 1..row){
                print(" ")
            }
            for(E in 1..(M-row)){
                print("* ")
            }
            println()
        }



        for (q in 0 until M!!){
            for (y in 1..q){
                print(" ")
            }
            for(Y in 1..(M-q)){
                print("* ")
            }
            println()
        }

    }

}

fun main(args:Array<String>){

println("Enter Number of Rows Below :")
    val num = readLine()!!.toInt()

    val objS = Star()

    println("Star Pyramid :")
    objS.Pyramid(num)

    println("Diamond : ")
    objS.Diamond(num)

}