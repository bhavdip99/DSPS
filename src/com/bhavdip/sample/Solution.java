package com.bhavdip.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        boolean result = solution.isAnagram("bhavdip", "bhadipvs");
//        System.out.println("Rsult is Anagram-" + result);
        List<String> names = new LinkedList<String>();
        names.add("steve");
        names.add("steves");
        names.add("steven");
        names.add("alex");
        names.add("alexander");
        names.add("hello");
        names.add("help");
        names.add("handle");

        List<String> queries = new LinkedList<String>();
        queries.add("steve");
        queries.add("hel");
        queries.add("alex");
        queries.add("ha");
        List<Integer> integers = prefixs(names, queries);

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = map.get(A[i]);
        }
        return ans;
    }


    public static List<Integer> prefixs(List<String> names, List<String> queries) {
        List<Integer> result = new LinkedList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String query : queries) {
            map.put(query, 0);
        }
        for (String query : queries) {
            for (String name : names) {
                if (name.startsWith(query)) {
                    map.put(query, map.get(query) + 1);
                }
            }
        }

        for (Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        for (String query : queries) {
            if (map.containsKey(query))
                result.add(map.get(query));
        }
        return result;
    }

    /*

     */
    public static List<String> funWithAnagrams(List<String> text) {
        List<String> resultWithFun = new LinkedList<String>();
        Set<String> alreadyExists = new HashSet<String>();

        for (String string : text) {
            String sortedCharsString = sortedCharString(string);
            if (!alreadyExists.contains(sortedCharsString)) {
                resultWithFun.add(string);
                alreadyExists.add(sortedCharsString);
            }
        }
        Collections.sort(resultWithFun);
        return resultWithFun;
    }

    public static String sortedCharString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /*

     */
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] ascii = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ascii[(int) s.charAt(i) - 97]++;
        }

        for (int i = 0; i < t.length(); i++) {
            ascii[(int) t.charAt(i) - 97]--;
        }

        for (int i = 0; i < 26; i++) {
            if (ascii[i] != 0) return false;
        }

        return true;
    }

}
