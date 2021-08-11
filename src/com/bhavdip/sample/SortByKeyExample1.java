package com.bhavdip.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyExample1 {
    public static void main(String[] args) {

        Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        unsortMap.put("Z", 10);
        unsortMap.put("B", 1);
        unsortMap.put("A", 4);
        unsortMap.put("C", 54);
        unsortMap.put("D", 2);
        unsortMap.put("E", 35);
        unsortMap.put("Y", 10);
        unsortMap.put("N", 10);
        unsortMap.put("J", 15);
        unsortMap.put("M", 14);
        unsortMap.put("F", 11);

        System.out.println("Unsort Map......");
        printMap(unsortMap);

        System.out.println("\nSorted Map......By Key");
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(unsortMap);
        printMap(treeMap);

    }

    //pretty print a map
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.print(""+entry.getKey()+entry.getValue());
        }
    }
}
