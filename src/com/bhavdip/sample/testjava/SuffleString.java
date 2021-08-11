package com.bhavdip.sample.testjava;

public class SuffleString {
    public static void main(String[] args) {
        String str = "BCADFE";
        int[] indices = {1, 2, 0, 4, 6, 5};
        int n =str.length();
        suffleString(str.toCharArray(), indices,n);
    }

    private static void suffleString(char[] s, int[] indices, int n) {

        char[] a = new char[s.length];
        char[] b = new char[s.length];

        for (int ii = 0; ii < s.length; ii++) {
            a[ii] = s[ii];
            b[ii] = s[ii];
        }

        int i = 0, j = 0;

        while (j < s.length && i < n) {
            int k = indices[i];
            int temp = a[j];
            b[k] = (char) temp;
            j += 1;
            i += 1;
        }
        String tmp = "";

        for ( i = 0; i < s.length; i++) {
            tmp += b[i];
        }
    }
}
