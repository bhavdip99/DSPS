package com.bhavdip.assignment;


import java.math.BigInteger;

/**
 * Given an integer array and an integer K, print all the possible sub arrays in which all elements are lesser than K.
 * sample input
 * a = [1,2,3,4,5]
 * k=4
 * sample output
 * 1
 * 2
 * 3
 * 1,2
 * 1,3
 * 2,3
 * 1,2,3
 */
public class PrintSubArraysElementsLesserThanK {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 9, 8, 5};
        int k = 6;
        printSubArraysElementsLesserThanK(array, k);

    }

    private static void printSubArraysElementsLesserThanK(int[] array, int k) {
        int newLen = 0;
        for (int item : array) {
            if (item < k) newLen++;
        }

        int[] subArr = new int[newLen];
        int count = 0;
        for (int value : array) {
            if (value < k) {
                subArr[count] = value;
                count++;
            }
        }
        System.out.println("============== MY SOLUTION ==================");

        for (int i = 0; i < newLen; i++) {
            for (int j = i; j <= newLen; j++) {
                for (int m = i; m < j; m++) {
                    System.out.print(subArr[m] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("============== Optimum SOLUTION ==================");
        int opSize = (int) Math.pow(2, newLen); // Find from Google :) I was missing this only
        for (int i = 1; i < opSize; i++) {
            for (int j = 0; j < newLen; j++) {
                if (BigInteger.valueOf(i).testBit(j)) // Find from Google :)
                    System.out.print(subArr[j] + " ");
            }
            System.out.println();
        }

    }
}
