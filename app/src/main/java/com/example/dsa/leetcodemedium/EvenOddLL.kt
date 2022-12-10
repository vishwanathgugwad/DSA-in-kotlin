package com.example.dsa.leetcodemedium





fun main(){
val sol = Solution()
    var arr = intArrayOf(3,3)
    var result = sol.twoSum(arr,6)
    for (i in result){
        println(i)
    }

}
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for(i in nums.indices){
            for(j in i+1 .. nums.size-1){
                if(nums[i]+nums[j] == target){
                    result[0] = i
                    result[1] = j
                }
            }
        }
        return result
    }
}


/*
class EvenOddLL {
    inner class NodeList{
        var value : Int? = null
        var next : NodeList? = null
    }
    companion object{
       fun solution(head :NodeList?) :NodeList{
            var headd = head
           var evenH :NodeList? = null
            var evenT :NodeList? = null
            var oddH :NodeList? = null
            var oddT :NodeList? = null
            var count  = 1

            while (head!=null){
                if (count%2 == 0){
                    if (evenH == null){
                        evenH = head
                        evenT = head
                        headd = head.next
                    }
                }
            }

        }
    }
}*/
