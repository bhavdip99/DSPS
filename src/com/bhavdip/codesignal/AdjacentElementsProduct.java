package com.bhavdip.codesignal;

public class AdjacentElementsProduct {
    public static void main(String[] args) {
//        int[] array = new int[]{3, 6, -2, -5, 7, 3};
        int[] array = new int[]{-23, 4, -3, 8, -12};
        System.out.println(adjacentElementsProduct(array));
    }
    static int adjacentElementsProduct(int[] inputArray) {
        int result=-1000;
        for (int i = 1; i < inputArray.length; i++) {
            if (result < (inputArray[i]*inputArray[i-1])){
                result = inputArray[i]*inputArray[i-1];
            }
        }

        return result;
    }

}
