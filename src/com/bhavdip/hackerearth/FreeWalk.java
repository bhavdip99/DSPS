package com.bhavdip.hackerearth;

import java.io.IOException;
import java.util.Scanner;

/*
Input:
1
AAAA?C

Output : 5
*/
public class FreeWalk {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int ccount = 0;
        int both = 0;
        try {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while (t > 0) {
//            sc = new Scanner(System.in);
                String str = sc.nextLine();
                for (char ch : str.toCharArray()) {
                    switch (ch) {
                        case 'A': {
                            count += 1;
//                            ccount -= 1;
                            break;
                        }
                        case 'C': {
                            count -= 1;
//                            ccount += 1;
                            break;
                        }
                        default:
                            both += 1;
                    }
                }
//                int dist = Math.abs(Math.max(count, ccount)) + both;
                int dist = Math.abs(count) + both;
                System.out.println(dist);
                t--;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
