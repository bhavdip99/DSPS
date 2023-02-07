package com.bhavdip.sample;

public class StringTest {
    public static void main(String[] args) {

        System.out.println("13"+5+3);
        String s1 = " yes";
        String s2 = "_yes_";
        String s3 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1 = s2);
        System.out.println(s3 == s1);
        System.out.println(s3 = s1);
        System.out.println(s1 != s2);
    }
}
