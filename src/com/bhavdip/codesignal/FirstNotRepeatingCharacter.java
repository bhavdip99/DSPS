package com.bhavdip.codesignal;

import java.util.*;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        FirstNotRepeatingCharacter firstNotRepeatingCharacter = new FirstNotRepeatingCharacter();
        System.out.println(firstNotRepeatingCharacter.solution("abacabad"));
    }

    public char solution(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '_';
    }

}
