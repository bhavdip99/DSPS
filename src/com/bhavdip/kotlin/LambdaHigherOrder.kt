package com.bhavdip.kotlin

fun main() {
    val program = LambdaHigherOrder()
    program.addTwoNumbers(2, 7)  // Using Simple way

    program.addTwoNumbers(2, 7, object : MyAddInterface { // Using interface/callback Object oriented way
        override fun add(sum: Int) {
            println(sum)
        }
    })

    val myLambda: (Int) -> Unit = { s: Int -> println("Sum Lambda 1: $s") } // Lambada Expression [Function]
    program.addTwoNumbers(2, 7, myLambda)

//    val myLambda2: (Int, Int) -> Int = { x: Int, y: Int -> x + y } // Lambada Expression [Function]
//    program.addTwoNum(2, 7, myLambda2) // Type 1
//    program.addTwoNum(2, 7, { x, y -> x + y }) // Type 2
    program.addTwoNum(2, 7) { x, y -> x + y } // Type 3
}

class LambdaHigherOrder {
    fun addTwoNum(a: Int, b: Int, action: (Int, Int) -> Int) { // High level function with lambda
        val result = action(a, b) // x + y = a + b = 2 + 7 = 9
        println("Sum Lambda 2:= $result")
    }

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) { // High level function with lambda
        val sum = a + b
        action(sum) //println("Sum Lambda 1: $s")
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
