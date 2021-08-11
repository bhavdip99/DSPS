package com.bhavdip.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bittup {


    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        StringBuilder output = new StringBuilder();
        while (t > 0) {
            StringTokenizer inputTokenizer = new StringTokenizer(r.readLine());
            long N = Long.parseLong(inputTokenizer.nextToken());
            long M = Long.parseLong(inputTokenizer.nextToken());
            long twoPowerN = calcLargePower(2l, N);
            long result = calcLargePower(twoPowerN - 1l, M);
            result %= 1000000007;
            output.append(result);
            output.append("\n");
            t--;
        }
        System.out.println(output);
    }

// 	public static long calcLargePower(long b, long e)
// 	{
// 	          long result = b;
// 	          for(long i = 1; i<e; i++)
// 	          {
// 	                    result = (result * b)  % 1000000007;
// 	          }
// 	          return result;
// 	}

    // referred StackOverflow
    public static long calcLargePower(long x, long y) {
        long result = 1;
        while (y > 0) {
            if ((y & 1) == 0) {
                x *= x;
                x %= 1000000007;
                y >>>= 1;
            } else {
                result *= x;
                result %= 1000000007;
                y--;
            }
        }
        return result;
    }
}


