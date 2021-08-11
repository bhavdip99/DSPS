package com.bhavdip.codechef;

import java.util.HashMap;
import java.util.Map;

public class TestOccurenceArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 4, 2, 5};
        getOccurence(arr);
        //print this map here
    }

    private static void getOccurence(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item: arr){
            if (map.containsKey(item)) {
                int flag = map.get(item);
                map.put(map.get(item),map.get(item) + 1);
            }else {
                map.put(item,1);
            }
        }
    }
}
