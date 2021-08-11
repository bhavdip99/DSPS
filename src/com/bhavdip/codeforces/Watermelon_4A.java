package com.bhavdip.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon_4A {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        int ans = t-2;

        System.out.println((ans !=0 && ans % 2 == 0 )? "YES" : "NO");
    }
}
