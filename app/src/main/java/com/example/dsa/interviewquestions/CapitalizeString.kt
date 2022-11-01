package com.example.dsa

import java.lang.Character.toUpperCase


fun capitalize(str : String): String {
    if (str.isEmpty()){
        return str
    }
    var chr = str[str.length-1]
    if (str.length ==1 ){
        return toUpperCase(chr).toString()
    }
    if (str.substring(str.length-2,str.length-1) == " "){
        chr = toUpperCase(chr)
    }
    return capitalize(str.substring(0,str.length-1))+ chr.toString()

}


fun main(){

    val str = "g"
    println(capitalize(str))


}