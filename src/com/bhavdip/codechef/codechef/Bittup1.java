package com.bhavdip.codechef.codechef;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bittup1 {

    static long power(int x, int y) {
        long a = (long) x;
        long p = 1000000007;
        long res = 1;

        while (y > 0) {
            if ((y & 1) != 0)
                res = ((res % p) * (a % p)) % p;

            y = y >> 1;
            a = ((a % p) * (a % p)) % p;
            res = res % p;
        }
        return res;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long res = power(2, n) - 1L;
            res = power((int) res, m);
            sb.append(res).append('\n');
        }
        System.out.println(sb);
    }

}
