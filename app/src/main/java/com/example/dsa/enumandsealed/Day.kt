package com.example.dsa.enumandsealed

enum class Day(val num : Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)
}


fun main(){
    val day : Day = Day.FRIDAY
    println(day.num)
}