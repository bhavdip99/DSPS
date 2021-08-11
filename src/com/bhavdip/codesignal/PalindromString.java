package com.bhavdip.codesignal;

public class
PalindromString {
    public static void main(String[] args) {
        System.out.println(checkPalindrom(""));
    }

    private static boolean checkPalindrom(String inputString) {
        boolean result = true;
        for (int start = 0, end = inputString.length() - 1; start < end; start++, end--) {
            if (inputString.charAt(start) != inputString.charAt(end)){
                result = false;
            }
        }
        return result;
    }
}
