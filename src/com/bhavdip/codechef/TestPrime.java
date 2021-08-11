package com.bhavdip.codechef;

public class TestPrime {
    public static void main(String[] args) {
        int input = 29;// we can give number here
        checkPrime(input);
        if (checkPrime(input)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    private static boolean checkPrime(int input) {
        if (input == 0 || input == 1) return false;
        int m = input / 2;
        for (int i = 2; i <= m; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
