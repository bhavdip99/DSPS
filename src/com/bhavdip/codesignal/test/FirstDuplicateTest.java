package com.bhavdip.codesignal.test;


import com.bhavdip.codesignal.FirstDuplicate;
import org.junit.Assert;
import org.junit.Test;

public class FirstDuplicateTest {

    @Test
    public void solution_testReturnFromArray_returnPositive() {

        FirstDuplicate firstDuplicate = new FirstDuplicate();
        int[] arr = new int[]{2, 1, 3, 5, 3, 2};

        Assert.assertEquals(3, firstDuplicate.solution(arr));
    }

    @Test
    public void solution_testReturnFromArray_returnNegative() {

        FirstDuplicate firstDuplicate = new FirstDuplicate();
        int[] arr = new int[]{2, 4, 3, 5, 1};

        Assert.assertEquals(-1, firstDuplicate.solution(arr));
    }
}