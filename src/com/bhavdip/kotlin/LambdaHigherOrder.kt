package com.bhavdip.kotlin

fun main() {
    val program = LambdaHigherOrder()
    program.addTwoNumbers(2, 7)  // Using Simple way

    program.addTwoNumbers(2, 7, object : MyAddInterface { // Using interface/callback Object oriented way
        override fun add(sum: Int) {
            println(sum)
        }
    })

    val myLambda = { s: Int -> println("Sum: $s") } // Lambada Expression [Function]
    program.addTwoNumbers(2, 7, myLambda)
}

class LambdaHigherOrder {
    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) { // High level function with lambda
        val sum = a + b
        action(sum) //println("Sum: $s")
//        println("Sum:= $sum")
    }

    fun addTwoNumbers(a: Int, b: Int) { // Using interface/callback Object oriented way
        val sum = a + b
        println("Sum:= $sum")
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyAddInterface) { // Using Simple way
        val sum = a + b
        action.add(sum)
        println("Sum:= $sum")
    }


}

interface MyAddInterface {
    fun add(sum: Int)
}
