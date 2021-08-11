package com.bhavdip.codesignal;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
    public static void main(String[] args) {
        String[] arr = new String[]{"an","aba", "aa","aaaa", "ad", "vcd", "aba"};
        arr = allLongestStrings(arr);
        for (String str : arr) {
            System.out.println(str);
        }
    }

    static String[] allLongestStrings(String[] inputArray) {
        int max = inputArray[0].length();
        for (String str : inputArray) {
            if (max <= str.length()) {
                max = str.length();
            }
        }
        List<String> result = new ArrayList<>();

        for (String str : inputArray) {
            if ( max == str.length()) {
                result.add(str);
            }
        }
        return result.toArray(new String[0]);
    }
}
