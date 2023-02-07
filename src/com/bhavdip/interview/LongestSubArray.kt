package com.bhavdip.interview

import kotlin.math.max


object LongestSubArray {
    /*
    Given an array of elements, return the length of the longest subarray where all its elements are distinct.
    For example, given the array [5, 1, 3, 5, 2, 3, 4, 1], return 5 as the longest subarray of distinct elements is [5, 2, 3, 4, 1].
*/
    /**
     * i - 5
     * j - 5,1,3,5i break loop and increase i
     *
     * i-1
     * j-3,5,2,3j break loop and increase i
     *
     * [
     * [5,1,3],
     * [1,3,5,2],
     * [3, 5, 2]
     * ]
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val array = intArrayOf(5, 1, 3, 5, 2, 3, 4, 1)
        val result: Int = longestSubArray(array, array.size)
        println("Result - $result")
    }
    private fun longestSubArray(a: IntArray, n: Int): Int {
        val index: HashMap<Int, Int> = HashMap()
        var ans = 0
        var i = 0
        var j = 0
        while (i < n) {
            j = (if (index.containsKey(a[i])) index[a[i]] else 0)?.let { max(it, j) }!!
            ans = max(ans, i - j + 1)
            index[a[i]] = i + 1
            i++
        }

        return ans
    }
}