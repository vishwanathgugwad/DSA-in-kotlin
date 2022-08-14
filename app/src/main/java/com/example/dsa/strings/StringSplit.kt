package com.example.dsa.strings



fun main(){
    var str = "abc,def,ghi"
    var str2 = "avv"
   var split = str.split(",")
    println(split[0] +",$str2," + split[1].let { it }+","+split[2])
}