package com.example.dsa




fun first(str : String) :Any{

   for (i in str){
        if (Character.isUpperCase(i)){
             return i
        }
    }
    return 0

}
fun main(){
    val str = "bcDe"
    println(first(str))

}
