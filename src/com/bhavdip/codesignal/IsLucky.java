package com.bhavdip.codesignal;

public class IsLucky {
    public static void main(String[] args) {
        System.out.println(isLucky(12396351));
    }

    static boolean isLucky(int n) {
        char[] chInt = String.valueOf(n).toCharArray();
        int l = chInt.length;
        if (l % 2 != 0) return false;
        int start = l / 2;
        int diff = 0;
        for (int i = 0, j = chInt.length - 1; i < start; i++, j--) {
            diff += (chInt[i]-chInt[j]);
        }

        return diff == 0;
    }
}
