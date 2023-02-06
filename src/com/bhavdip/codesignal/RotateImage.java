package com.bhavdip.codesignal;

/**
 * Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.
 * You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
 * Example
 * For
 * a = [[1, 2, 3],
 *      [4, 5, 6],
 *      [7, 8, 9]]
 * the output should be
 * rotateImage(a) =
 *     [[7, 4, 1],
 *      [8, 5, 2],
 *      [9, 6, 3]]
 */
public class RotateImage {

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = solution(a);
        print2DArray(result);
    }

    static void print2DArray(int[][] a) {
        for (int[] rows : a) {
            for (int item : rows) {
                System.out.print(item);
            }
            System.out.println("\n");
        }
    }

    static int[][] solution(int[][] a) {
        int n = a.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int tmp = a[i][j]; // saved in temp variable
                a[i][j] = a[n - j - 1][i]; // First column
                a[n - j - 1][i] = a[n - i - 1][n - j - 1]; // last row
                a[n - i - 1][n - j - 1] = a[j][n - i - 1]; // last column

                a[j][n - i - 1] = tmp;
            }
        }
        return a;
    }
}