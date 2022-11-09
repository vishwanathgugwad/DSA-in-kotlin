package com.example.dsa.interviewquestions

import java.util.*
import kotlin.collections.ArrayList


fun main(){
val n = 5
    val binary = ToBinary().toBinary(n)
   println(binary.reversed())
}

class ToBinary{

    fun toBinary(value : Int) : ArrayList<Int>{
        val arr = arrayListOf<Int>()
        val stack = Stack<Int>()
        var n = value
        while (n > 0){
            stack.push(n%2)
            n /= 2
        }
        for (i in stack){
            arr.add(i)
        }
        return arr
    }
}