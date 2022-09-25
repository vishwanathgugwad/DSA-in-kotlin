package com.example.dsa.sorting

import kotlin.math.ceil
import kotlin.math.sqrt

class BucketSort {

    val arr : Array<Int>

    constructor(arr : Array<Int>){
        this.arr = arr
    }


    fun sort(){
        val numberOfBuckets = (sqrt(arr.size.toDouble())).toInt()
        var maxValue = Int.MIN_VALUE
        for (i in arr){
            if (i>maxValue){
                maxValue = i
            }
        }
        var buckets = Array<ArrayList<Int>>(numberOfBuckets){ _ -> ArrayList() }
        for (i in buckets.indices){
            buckets[i] = ArrayList()
        }

        for(i in  arr){
           var bucketNumber = ceil((((i * numberOfBuckets).toDouble()/maxValue)))
            buckets[(bucketNumber -1).toInt()].add(i)
        }
        println("Printing buckets before sorting ")
        for (bucket in buckets){
            println("Bucket no ${buckets.indexOf(bucket)+1}")
            for (item in bucket){
                print("$item ")
            }
            println()
        }

        for (i in buckets){
           i.sort()
        }
        println("Printing buckets after sorting ")
        for (bucket in buckets){
            println("Bucket no ${buckets.indexOf(bucket)+1}")
            for (item in bucket){
                print("$item ")
            }
            println()
        }
        var i = 0
        for (bucket in buckets){
            for (item in bucket){
                arr[i] = item
                i++
            }

        }


    }

    fun printBuckets() {
        for (i in arr){
            print("$i ")
        }
        println()
    }
}

fun main(){

    val arr = arrayOf(7,9,5,4,2,1,3,6,8)
    val bucket = BucketSort(arr)
    bucket.printBuckets()
    bucket.sort()
    bucket.printBuckets()
}