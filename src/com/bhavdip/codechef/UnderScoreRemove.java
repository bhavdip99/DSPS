package com.bhavdip.codechef;


import java.util.*;

public class UnderScoreRemove {
    public static void main(String[] args) {
        System.out.println("InPUT- BhavdipBhalodia");
        System.out.println(test("abbaaaac"));
    }
    public static String test(String s) {
        Map<Character, Integer> d = new HashMap<>();

        /*for (char ch : s.toCharArray()) {
            if (d.containsKey(ch)) {
                d.put(ch, d.get(ch) + 1);
            } else {
                d.put(ch, 1);
            }
        }*/
        for (int i = 0; i < s.length(); i++) {
            if (d.containsKey(s.charAt(i))) {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            } else {
                d.put(s.charAt(i), 1);
            }
        }
//        Map<Character, Integer> map = new TreeMap<>(d);
        return printMap(d);
    }
    public static <K, V> String printMap(Map<K, V> map) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.append(entry.getValue()).append(entry.getKey());
        }
        return result.toString();
    }
}
