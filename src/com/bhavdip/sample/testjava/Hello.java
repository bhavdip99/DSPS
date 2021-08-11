package com.bhavdip.sample.testjava;

import java.util.Arrays;

public class Hello {

    public static void main(String args[]){

        // original array has 10 elements
        int[] original = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] original1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("original array: " + Arrays.toString(original));

        // let's create an exact copy of the array
        int[] copy = Arrays.copyOf(original, 10);
        System.out.println("exact copy: " + Arrays.toString(copy));

        // let's copy only first 5 elements
        int[] firstFive = Arrays.copyOf(original, 5);
        System.out.println("exact copy: " + Arrays.toString(firstFive));

        int len = original1.length;
        // let's create a larger array by copying
        System.out.println("length-"+len++);
        original1 = Arrays.copyOf(original1, ++len);
        System.out.println("Len-"+len);
        original1[len-1]=121;
        System.out.println("bigger copy: " + Arrays.toString(original1));

        // Now, let's copy a range of values from one array to another
        // copying subarray from 2nd element to 5th element
        int[] range = Arrays.copyOfRange(original, 2, 5);
        System.out.println("copying range of values 2 to 5: "
                + Arrays.toString(range));
    }

}