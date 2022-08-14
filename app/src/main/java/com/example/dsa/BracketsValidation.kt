package com.example.dsa

import java.util.*

class BracketsValidation {

    fun validate(s : String) : Boolean{

        var brackets:Stack<Char> = Stack()
        for (i in s.toCharArray()){
          when(i){
              '(' -> brackets.push(i)
              '{' -> brackets.push(i)
              '['-> brackets.push(i)
              ')' -> if (brackets.isEmpty() || brackets.peek() != '(') { return false } else brackets.pop()
              '}' ->if (brackets.isEmpty() || brackets.peek() != '{') {return false} else brackets.pop()
              ']' -> if(brackets.isEmpty() || brackets.peek() != '[') {return false} else brackets.pop()
          }
        }


        return brackets.isEmpty();
    }

}
fun main(){

    var s :String = "(){}[]("
    var sol = BracketsValidation()
    var result = sol.validate(s)
    println(result)
}