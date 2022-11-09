package com.example.dsa.interviewquestions

import java.util.*

fun main(){
    val str = "(1+((2+3)*(4*5)))"
    println(str.reader().read())
}



/*
class TwoStack {
    val str = "(1+((2+3)*(4*5)))"
    var values = Stack<Int>()
    var operands = Stack<String>()

    fun evaluate() {

        while (str.isNotEmpty()) {
            var s = str.reader()
            if (s.readText() == "(") {
                operands.push("(")
            }
            if (s.readText() ==)

        }
    }
}*/
