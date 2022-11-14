package com.example.dsa.strings


fun main(){
    val str = "ABC"
Permutation.solution(str,0,str.length-1)


}

class Permutation {

    companion object{

         fun solution(str : String, left :Int, right : Int){
            if (left == right){
                println(str)
            }else{
                for (i in left .. right){
                    val swapped = swap(str,left,i)
                    solution(swapped,left+1,right)
                }
            }

        }
        fun swap(str : String , i : Int , j : Int) : String{
            val strArray = str.toCharArray()
            val temp : Char = strArray[i]
            strArray[i] = strArray[j]
            strArray[j] = temp
            return String(strArray)
        }
    }
}