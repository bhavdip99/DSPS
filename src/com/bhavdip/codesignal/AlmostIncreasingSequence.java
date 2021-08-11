package com.bhavdip.codesignal;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
//        int[] array = new int[]{1, 2, 1, 2};
//        int[] array = new int[]{1, 1, 2, 3, 4, 4};
//        int[] array = new int[]{1, 2, 3, 4, 99, 5, 6};
        int[] array = new int[]{123, -17, -5, 1, 2, 3, 12, 43, 45};
        System.out.println("Result-" + almostIncreasingSequence(array));
    }

    static boolean almostIncreasingSequence1(int[] sequence) {
        int count1 = 0, count2 = 0, cnt = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            cnt++;
            if (sequence[i] >= sequence[i + 1]) count1++;
            if (count1 == 2) break;
        }

        for (int i = 0; i < sequence.length - 2; i++) {
            cnt++;
            if (sequence[i] >= sequence[i + 2]) count2++;
            if (count2 == 2) break;
        }
        System.out.println("Count-" + cnt);
        return (count1 <= 1) && (count2 <= 1);
    }

    private static boolean almostIncreasingSequence(int[] sequence) {
        int count = 0, count1 = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) count++;
        }

        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] >= sequence[i + 2]) count1++;
        }

        return count <= 1 && count1 <= 1;
    }
}
