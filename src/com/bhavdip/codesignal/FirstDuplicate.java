package com.bhavdip.codesignal;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://app.codesignal.com/interview-practice/question/pMvymcahZ8dY4g75q/description">firstDuplicate</a>
 */
public class FirstDuplicate {
    public static void main(String[] args) {
        FirstDuplicate firstDuplicate = new FirstDuplicate();
//        int[] arr = new int[]{2, 1, 3, 5, 3, 2};
        int[] arr = new int[]{2, 4, 3, 5, 1};
        System.out.println(firstDuplicate.solution(arr));
    }

    public int solution(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int j : a) {
            if (set.contains(j)) {
                return j;
            } else set.add(j);
        }

        return -1;
    }

}


