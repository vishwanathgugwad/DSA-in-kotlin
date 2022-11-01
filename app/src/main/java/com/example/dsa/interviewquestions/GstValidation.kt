package com.example.dsa

import java.util.regex.Pattern


fun main(){
    val str1 = "06BZAHM6385P6Z2"
    println(isValidGSTNo(str1))
    val str2 = "hasd"
    println(isValidGSTNo(str2))

}

fun isValidGSTNo(gstNumber : String) : Boolean{
    //val regex = ("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}\$")
    val regex = ("^[0-9]{2}[A-Z]{5}[0-9]{4}"
            + "[A-Z]{1}[1-9A-Z]{1}"
            + "Z[0-9A-Z]{1}$")
    val p = Pattern.compile(regex)

    if (gstNumber.isEmpty()){
        return false
    }
    val m = p.matcher(gstNumber)

    return (!m.matches())
}
