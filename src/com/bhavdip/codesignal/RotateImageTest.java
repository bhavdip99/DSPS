package com.bhavdip.codesignal;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

    @Test
    public void solution_3x32DArray_printArray() {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] aExpected = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        RotateImage.solution(a);

        Assert.assertArrayEquals(aExpected, a);
    }
}