package com.bhavdip.assignment

/**
 * Asked by accionlabs Company(accionlabs.com)
 * Problem : Single Digit Sum Of integer
 *
 * Sum of the given digits in single answer
 *      input = 945
 *      result = 9
 *
 *  explanation = 945
 *         9+4+5=18;
 *         1+8=9
 *         Note: sum in single answer
 */
object SingleDigitSumOfInteger {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Result = " + sumOfDigit_(777))
    }

    /**
     * This is efficient way to solve this problem
     */
    fun sumOfDigit(n: Int): Int {
        if (n == 0) return 0
        return if (n % 9 == 0) 9 else n % 9
    }

    // I solved this problem
    fun sumOfDigit_(no: Int): Int {
        var no = no
        var sum = 0
        while (no > 0) {
            sum += no % 10
            no = no / 10
        }
        //        System.out.println("Sum inside-"+sum);
        if (sum / 10 > 0) {
            sum = sumOfDigit_(sum)
        }
        return sum
    }
}