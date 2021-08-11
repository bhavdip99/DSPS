package com.bhavdip.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheatreSquare_1A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());

            if (m % a == 0 && n % a == 0) {
                System.out.println((m / a) * (n / a));
            } else if (m % a > 0 && n % a == 0) {
                System.out.println((m / a + 1) * (n / a));
            } else if (m % a == 0 && n % a > 0) {
                System.out.println((m / a) * (n / a + 1));
            } else if (m % a > 0 && n % a > 0) {
                System.out.println((m / a + 1) * (n / a + 1));
            }
        }
    }
}
