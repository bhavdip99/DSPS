package com.bhavdip.codesignal;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 2, 3, 8};
        System.out.println(makeArrayConsecutive2(array));
    }

    private static int makeArrayConsecutive2(int[] statues) {
        int min = statues[0], max = statues[0];
        for (int statue : statues) {
            if (min > statue) {
                min = statue;
            } else if (max < statue) {
                max = statue;
            }
        }
        return max - min + 1 - statues.length;
    }
}
