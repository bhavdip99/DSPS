package com.bhavdip.codesignal;

import java.util.HashMap;
import java.util.Map;

/**
 * https://app.codesignal.com/interview-practice/question/pMvymcahZ8dY4g75q/description
 */
public class FirstDuplicate {
    public static void main(String[] args) {
        FirstDuplicate firstDuplicate  = new FirstDuplicate();
//        System.out.println(firstDuplicate.solution(new int[]{2, 1, 3, 5, 3, 2}));
        System.out.println(firstDuplicate.solution(new int[]{2, 4, 3, 5, 1}));
    }
    public int solution(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (map.containsKey(a[i])){
                return a[i];
            } else
                map.put(a[i],1);
        }

        return -1;
    }

}


