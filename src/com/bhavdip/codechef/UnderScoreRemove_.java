package com.bhavdip.codechef;


import java.util.HashMap;
import java.util.Map;

public class UnderScoreRemove_ {
    public static void main(String[] args) {
        System.out.println("InPUT- BhavdipBhalodia");
        System.out.println(test("abbaaac"));//1a2b3a1c- 4a2b1c
//        test("abbaaac");

    }

    public static String test(String inputString) {
        Map<Character, Integer> map = new HashMap<>();
        map.put(inputString.charAt(0), 1);
        for (int i = 1; i <= inputString.length()-1; i++) {
//            if (map.containsKey(inputString.charAt(i))) {
            if (map.containsKey(inputString.charAt(i)) && inputString.charAt(i) == inputString.charAt(i - 1)) {
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            } else {
                map.put(inputString.charAt(i), 1);
            }
        }
        return printMap(map);
    }

    public static void test3(String inputString) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length() - 1; i++) {
            if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
            }

            if (count >= 1) {
                sb.append(count).append(inputString.charAt(i));
            } else {
                sb.append(1).append(inputString.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void test2(String inputString) {
        char[] chars = inputString.toCharArray();
        int count = 1;
        for (int i = 0; i <= chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                System.out.print(count + "" + chars[i]);
            }
        }
    }

    public static String test1(String inputString) {
        char[] chars = inputString.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        return printMap(map);
    }

    public static <K, V> String printMap(Map<K, V> map) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.append(entry.getValue()).append(entry.getKey());
        }
        return result.toString();
    }
}
