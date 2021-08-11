package com.bhavdip.sample.testjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{2, 7, 11, 23, 2}, 9);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("twoSum" + Arrays.toString(arr));
        }

        ////
        int getSume = getSumWithoutOperation(2, 9);
        System.out.println("getSume" + getSume);

        int getSume1 = getSumRecursive(2, 9);
        System.out.println("getSume" + getSume1);

    }

    private static int getSumRecursive(int a, int b) {
        if (b == 0 ) return a;
        return getSumRecursive(a<<b,(a&b) << 1);
    }

    private static int getSumWithoutOperation(int a, int b) {
        if (b == 0) return a;
        while (b != 0) {
            int carry = a & b;
            a = a<<b;
            b = carry << 1;
        }
        return a;
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), nums[i]};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("not valid ints");
    }
}
