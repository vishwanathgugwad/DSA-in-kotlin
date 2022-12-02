package com.example.dsa.interviewquestions.sorting

import kotlin.math.max

fun main() {
    val arr = arrayOf(10, 10, 2)
    println(MaxTriplets.solution(arr))
}


class MaxTriplets {

    companion object {
        fun solution(arr: Array<Int>): Int {
            arr.sort()
            val n = arr.size
            return max(arr[n - 1] * arr[n - 2] * arr[n - 3], arr[0] * arr[1] * arr[n - 1])
        }
    }
}