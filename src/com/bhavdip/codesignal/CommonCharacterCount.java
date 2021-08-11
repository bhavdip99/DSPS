package com.bhavdip.codesignal;

import java.util.*;

public class CommonCharacterCount {
    private static final int MAX = 26;

    public static void main(String[] args) {
        String s1 = "aabcc";
//        String s1 = "thin sticks";
        String s2 = "adcaa";
//        String s2 = "thick bricks";

        System.out.println(commonCharacterCount1(s1, s2));
    }

    static int commonCharacterCount(String s1, String s2) {
        char[] firstStringToCharArray = s1.replaceAll("\\s+", "").toCharArray();
        char[] secondStringToCharArray = s2.replaceAll("\\s+", "").toCharArray();
        Set<Character> firstStringSet = new TreeSet<>();
        Set<Character> secondStringSet = new TreeSet<>();

        for (char c : firstStringToCharArray) {
            firstStringSet.add(c);
        }

        for (char c : secondStringToCharArray) {
            secondStringSet.add(c);
        }

        firstStringSet.retainAll(secondStringSet);
        System.out.println("Common characters in alphabetical order : " + firstStringSet);

        return firstStringSet.size();
    }

    static int commonCharacterCount1(String s1, String s2) {
        int[] freq1 = new int[MAX];
        int[] freq2 = new int[MAX];
        Arrays.fill(freq1, 0);
        Arrays.fill(freq2, 0);

        int i, count = 0;
//        s1 = s1.replace(" ","");
//        s2 = s2.replace(" ","");
        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            freq2[ch - 'a']++;
        }
        for (i = 0; i < MAX; i++)
            count += (Math.min(freq1[i], freq2[i]));

        return count;
    }

}
