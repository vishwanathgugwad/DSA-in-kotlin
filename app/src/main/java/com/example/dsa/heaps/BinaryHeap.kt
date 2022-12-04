package com.example.dsa.heaps

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import kotlin.properties.Delegates



fun main(){

    val pq = PriorityQueue<Int>()
    val arr = arrayOf(10,6,2,9,4)
    for (i in arr){
        pq.add(i)
    }
    for (i in pq){
        println(i)
    }
   /* val heap = BinaryHeap(5)
    heap.insert(10,"min")
    heap.insert(20,"min")
    heap.insert(30,"min")
    heap.insert(40,"min")
    heap.extractNode("min")
    heap.levelOrder()*/
}

class BinaryHeap {

     var arr : Array<Int>
     private var sizeOfTree : Int

    constructor(size : Int){
        this.arr = Array(size+1){0}
        sizeOfTree = 0
    }

    fun isEmpty() : Boolean{
        return sizeOfTree == 0
    }
    fun isFull() : Boolean{
        return sizeOfTree == arr.size
    }
    fun peek(): Int {
        return if (isEmpty()){
            println("Heap is empty")
            -1
        }else{
            arr[1]
        }
    }
    fun levelOrder(){
        for (i in  1 ..sizeOfTree){
            println(arr[i])
        }
    }

    fun insert(value : Int , heapType: String){
        arr[sizeOfTree+1] = value
        sizeOfTree++
        heapifyBottomToTop(sizeOfTree,heapType)
    }
    fun extractNode(heapType: String) : Int{
        if (isEmpty()){
            return -1
        }else{
            val extracted = arr[1]
            arr[1] = arr[sizeOfTree]
            sizeOfTree--
            heapifyTopToBottom(1,heapType)
            return extracted
        }

    }

    private fun heapifyBottomToTop(index : Int, heapType : String){
        val parent  = index/2
        if (parent < 1){
            return
        }
        if (heapType == "min"){
            if (arr[index] < arr[parent]){
                val temp = arr[parent]
                arr[parent] = arr[index]
                arr[index] = temp
            }
        }else if (heapType == "max"){
            if (arr[index] > arr[parent]){
                val temp = arr[parent]
                arr[parent] = arr[index]
                arr[index] = temp
            }
        }
        heapifyBottomToTop(parent,heapType)
    }

    private fun heapifyTopToBottom(index : Int , heapType : String){
        val left  = index * 2
        val right  = index * 2 + 1
        var swipeIndex : Int = left
        if (left > sizeOfTree){
            return
        }
        if (heapType == "max"){
         if (left == sizeOfTree){
             if (arr[left] > arr[index]){
                 val temp = arr[left]
                 arr[left] = arr[index]
                 arr[index] = temp
             }
             return
         }else{
             if (arr[left] > arr[right]){
                 swipeIndex = left
             }else{
                 swipeIndex = right
             }
             if (arr[swipeIndex] > arr[index]){
                 val temp = arr[swipeIndex]
                 arr[swipeIndex] = arr[index]
                 arr[index] = temp
             }
         }
        }else if (heapType == "min"){
            if (left == sizeOfTree){
                if (arr[left] < arr[index]){
                    val temp = arr[left]
                    arr[left] = arr[index]
                    arr[index] = temp
                }
                return
            }else{
                if (arr[left] < arr[right]){
                    swipeIndex = left
                }else{
                    swipeIndex = right
                }
                if (arr[swipeIndex] < arr[index]){
                    val temp = arr[swipeIndex]
                    arr[swipeIndex] = arr[index]
                    arr[index] = temp
                }
            }
        }
        heapifyTopToBottom(swipeIndex,heapType)
    }

}