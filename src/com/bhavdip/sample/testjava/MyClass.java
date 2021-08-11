package com.bhavdip.sample.testjava;


public class MyClass {
    public static void main(String[] args) {

        System.out.println(isPalindrome("i he ram are, hi"));

    }
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;
        for (int i=0, j=s.length() - 1; i<=j;i++,j--) {
            while (i<=j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i<=j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(i > j) return true;
            if(!compareIgnoreCase(s.charAt(i), s.charAt(j))) return false;
        }
        return true;
    }
    private static boolean compareIgnoreCase(char c1, char c2) {
        return Character.toLowerCase(c1) == Character.toLowerCase(c2);
    }

}