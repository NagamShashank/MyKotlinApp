package com.example.mykotlinapp.TailRecursion

fun main(args:Array<String>){

    println("Enter a number : ")
    val num = readLine()!!.toLong()

   println(recursionfact(num))

}


//tailrec fun recursionSum(number: Long, ans: Long = 0): Long {
//    if(number <= 0){
//        return ans
//    }else{
//       return recursionSum((number -1),number+ans)
//    }
//}

 tailrec fun recursionfact(number: Long,ans : Long = 0 ):Long {

     if(number <=1)
         return ans
     else
         return recursionfact(number-1,ans * number)



}