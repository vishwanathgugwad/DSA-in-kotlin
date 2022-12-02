package com.example.dsa.interviewquestions.sorting

import java.util.*


fun main() {
    val arr = arrayOf(10, 50, 5, 1)
    println(Triangle.solution(arr))
}

class Triangle {

    companion object {
        fun solution(arr: Array<Int>): Int {
            if (arr.size < 3) {
                return 0
            }
            arr.sort()
            for (i in 0..arr.size - 3) {
                if (arr[i].toLong() + arr[i + 1] > arr[i + 2]) {
                    return 1
                }
            }
            return 0
        }
    }
}