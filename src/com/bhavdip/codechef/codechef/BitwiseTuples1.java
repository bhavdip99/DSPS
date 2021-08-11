package com.bhavdip.codechef.codechef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BitwiseTuples1 {

    public static void main(String[] args)  {

        FastReader s = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = s.nextInt();
        long l1 = System.currentTimeMillis();
        for(int i = 0; i < t; i++) {
            long D = s.nextLong();
            long d = s.nextLong();
            long P = s.nextLong();
            long Q = s.nextLong();
            long n = D / d;
            long last = P + (n - 1) * Q;
            long sum1 = ( (n) * (P * d + last * d)) / 2;
            long  sum2= (last + Q) * (D % d);
            System.out.println(sum2 + sum1);
        }
        System.out.println(System.currentTimeMillis() - l1);




    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
