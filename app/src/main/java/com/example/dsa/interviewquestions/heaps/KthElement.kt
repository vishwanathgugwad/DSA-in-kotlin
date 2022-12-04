package com.example.dsa.interviewquestions.heaps

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*


@RequiresApi(Build.VERSION_CODES.N)
fun main(){
    val arr = arrayOf(6,9,1,2,3,5,4)
   println(KthElement.kthLargest(arr,1))
    println(KthElement.kthSmallest(arr,1))
}



class  KthElement{
    companion object{
        @RequiresApi(Build.VERSION_CODES.N)
        fun kthSmallest(arr : Array<Int> , k : Int) : Int? {
            val pq = PriorityQueue<Int>(Collections.reverseOrder())
            for (i in arr.indices){
                pq.add(arr[i])
                if (pq.size > k){
                    pq.poll()
                }
            }
            return pq.peek()
        }

        fun kthLargest(arr : Array<Int> , k : Int) : Int? {
            val pq = PriorityQueue<Int>()
            for (i in arr.indices){
                pq.add(arr[i])
                if (pq.size > k){
                    pq.poll()
                }
            }
            return pq.peek()
        }
    }
}