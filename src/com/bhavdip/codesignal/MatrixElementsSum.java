package com.bhavdip.codesignal;

public class MatrixElementsSum {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 1, 2},
                {1, 5, 0, 0},
                {2, 0, 3, 3}};
        System.out.println(matrixElementsSum(matrix));
    }

    static int matrixElementsSum(int[][] matrix) {
        int result = 0;
        int lengthRows = matrix.length;
        int lengthCols = matrix[0].length;
        for (int i = 0; i < lengthCols; i++) {
            for (int j = 0; j < lengthRows; j++) {
                if (matrix[j][i] == 0) break;
                result += matrix[j][i];
            }
            System.out.println();
        }
        return result;
    }
}
