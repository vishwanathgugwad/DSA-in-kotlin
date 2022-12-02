package com.example.dsa.interviewquestions.sorting

import kotlin.math.abs
import kotlin.math.log2
import kotlin.math.max


fun main() {
    print(DiscIntersection.solution(arrayOf(1, 2147483647, 0)))
}


class DiscIntersection {

    companion object {

        fun solution(arr: Array<Int>): Int {
            var starts = Array(arr.size) { 0 }
            for (i in arr.withIndex()) {
                var startpoint = i.index.minus(i.value)
                if (startpoint < 0) {
                    startpoint = 0
                }
                starts[startpoint]++
            }

            //total starts at each point
            var total = 0
            for (i in starts.withIndex()) {
                total += i.value
                starts[i.index] = total
            }

            var totalIntersections = 0
            for (i in 0 until arr.size) {
                val radius = arr[i]
                var endPoint = i.toLong() + radius
                if (endPoint > arr.size - 1) {
                    endPoint = arr.size.toLong() - 1
                }
                var intersections = max(starts[i], starts[endPoint.toInt()]) - (i + 1)
                totalIntersections += intersections
            }
            if (totalIntersections > 10000000) {
                return -1
            }

            return totalIntersections
        }
    }
}

