package com.bhavdip.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BitwiseTuples {
    public static final int NO_OF_ARGS = 4;

    public static void main(String[] args) throws java.lang.Exception {
        int no = getInt();
        while (no-- > 0 && no <= 100000) {
            int[] t = getInts(NO_OF_ARGS);
            int D = t[0], d = t[1], p = t[2], q = t[3];
            int ans = 0;
            int x = D / d;
            if (x % 2 == 0) {
                ans = d * (x / 2 * 2 * p + (x - 1) * q);
            } else {
                ans = d * (x * (p + ((x - 1) / 2) * q));
            }
            ans += (D % d) * (p + (x) * q);
            System.out.println(ans);
        }

    }

    private static int[] getInts(int noOfInt) {
        int[] inputs = new int[noOfInt];
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < noOfInt; i++) {
                inputs[i] = Integer.parseInt(br.readLine());
            }
        } catch (Exception e) {
            return new int[0];
        }
        return inputs;
    }

    private static int getInt() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(br.readLine());
        } catch (Exception e) {
            return 0;
        }
    }
}
