package com.example.dsa.interviewquestions.stacksQueues

import java.util.*


fun main() {

    val str = ")("
    println(Brackets.solution(str))

}


class Brackets {
    companion object {
        fun solution(str: String): Int {
            val stack = Stack<Any>()
            for (i in str.toCharArray()) {
                when (i) {
                    '{' -> {
                        stack.push('{')
                    }
                    '[' -> {
                        stack.push('[')
                    }
                    '(' -> {
                        stack.push('(')
                    }
                    '}' -> {
                        if (stack.isNotEmpty() && stack.peek() == '{') {
                            stack.pop()
                        } else {
                            stack.push('}')
                        }
                    }
                    ']' -> {
                        if (stack.isNotEmpty() && stack.peek() == '[') {
                            stack.pop()
                        } else {
                            stack.push(']')
                        }
                    }
                    ')' -> {
                        if (stack.isNotEmpty() && stack.peek() == '(') {
                            stack.pop()
                        } else {
                            stack.push(')')
                        }
                    }
                }
            }
            return if (stack.isEmpty()) 1 else 0
        }
    }
}