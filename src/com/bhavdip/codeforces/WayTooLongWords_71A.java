package com.bhavdip.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WayTooLongWords_71A {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        while (t-- > 0) {
            StringTokenizer inputTokenizer = new StringTokenizer(r.readLine());
            String str = inputTokenizer.nextToken();
            int len = str.length();
            if (len > 10) {
                char[] ch = str.toCharArray();
                StringBuilder builder = new StringBuilder();
                builder.append(ch[0]).append(ch.length - 2).append(ch[ch.length - 1]);
                System.out.println(builder);
            }else{
                System.out.println(str);
            }
        }
    }
}
