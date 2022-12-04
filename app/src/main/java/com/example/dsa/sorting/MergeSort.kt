package com.example.dsa.sorting

class MergeSort {
    companion object{
            fun divide(arr : Array<Int> , si : Int , ei : Int){
                if (si >= ei){
                    return
                }
                var mid  = si+ (ei - si)/2
                divide(arr,si,mid)
                divide(arr,mid+1,ei)
                conquer(arr,si,mid,ei)

            }

        private fun conquer(arr: Array<Int>, si: Int, mid: Int, ei: Int) {
            var mergeArr = Array((ei-si+1)) { 0 }
            var index1 = si
            var index2 = mid+1
            var x = 0

            while (index1 <= mid && index2 <= ei){
                if (arr[index1] <= arr[index2]){
                    mergeArr[x++] = arr[index1++]
                }else{
                    mergeArr[x++] = arr[index2++]
                }
            }
            while (index1 <= mid){
                mergeArr[x++] = arr[index1++]
            }
            while (index2 <= ei){
                mergeArr[x++] = arr[index2++]
            }
            var y = si
          for (i in mergeArr.indices){
              arr[y] = mergeArr[i]
              y++
          }
        }
    }
}


fun main(){
val arr = arrayOf(5,2,9,1,3,6)
    MergeSort.divide(arr,0,arr.size-1)
    for (i in arr){
        println(i)
    }

}