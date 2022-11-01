package com.example.dsa




fun isPalindrome(str :String) : Boolean {
    if (str == null){
        return false
    }
    if (str.length<=1){
        return true
    }
    val first = str[0]
    val last = str[str.length-1]
    if (first != last){
        return false
    }else{
        return isPalindrome(str.substring(1,str.length-1))
    }
}
fun main(){
    val str = "nitin"

   println(isPalindrome(str))
}