package com.bhavdip.assignment;

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
 *
 *
 */
public class SingleDigitSumOfInteger {
    public static void main(String[] args) {
        System.out.println("Result = " + sumOfDigit(777));
    }

    /**
     * This is efficient way to solve this problem
     */
    static int sumOfDigit(int n) {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }

    // I solved this problem
    static int sumOfDigit_(int no) {
        int sum = 0;

        while (no > 0) {
            sum += no % 10;
            no = no / 10;
        }
//        System.out.println("Sum inside-"+sum);
        if (sum / 10 > 0) {
            sum = sumOfDigit(sum);
        }
        return sum;
    }
}
