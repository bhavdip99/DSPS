package com.bhavdip.codesignal

fun main(){
    val arr = intArrayOf(1, 3, 4, 3, 1)

    println(solution(arr))
}

fun solution(A: IntArray): Int {
    val N: Int = A.size
    val set: MutableSet<Int> = HashSet()
    for (a in A) {
        if (a > 0) {
            set.add(a)
        }
    }
    for (i in 1..N + 1) {
        if (!set.contains(i)) {
            return i
        }
    }
    return -1
}

