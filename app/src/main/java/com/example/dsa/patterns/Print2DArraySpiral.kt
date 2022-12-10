package com.example.dsa.patterns


fun main() {

    val arr = arrayOf(
        arrayOf(5, 6, 7, 8, 9, 10),
        arrayOf(12, 13, 14, 15, 16, 17),
        arrayOf(19, 20, 21, 22, 23, 24)
    )
    Print2DArraySpiral.spiral(arr)
}

class Print2DArraySpiral {

    companion object {

        fun spiral(arr: Array<Array<Int>>) {
            var minR = 0
            var minC = 0
            var maxR = 2
            var maxC = 5
            val n = (arr.size) *( arr[0].size)
            var count = 0

            while (count <= n) {
                //left wall
                var iL = minR
                val jL = minC
                while (iL <= maxR && count < n) {
                    print("${arr[iL][jL]} ")
                    iL++
                    count++
                }
                minC++
                //bottom wall
                var iB = maxR
                var jB = minC
                while (jB <= maxC && count < n) {
                    print("${arr[iB][jB]} ")
                    jB++
                    count++
                }
                maxR--
                //right wall
                var iR = maxR
                var jR = maxC
                while (iR >= minR && count < n) {
                    print("${arr[iR][jR]} ")
                    iR--
                    count++
                }
                maxC--
                //top wall
                var iT = minR
                var jT = maxC
                while (jT >= minC && count < n) {
                    print("${arr[iT][jT]} ")
                    jT--
                    count++
                }
                minR++

            }
        }

    }
}