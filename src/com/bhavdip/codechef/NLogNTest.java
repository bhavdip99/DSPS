package com.bhavdip.codechef;

public class NLogNTest {
    public static void main(String[] args) {
        int n = 10;
        int x = n;
        while (x > 0) {
            int y = x;
            System.out.println("x = " + x + "; n=" + n + "; y = " + y);
            while (y > 0) {
                y = y / 2;
            }
            x = x - 1;
        }
    }
}
