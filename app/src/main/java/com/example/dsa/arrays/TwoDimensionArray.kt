package com.example.dsa



fun main(){

    findElement(142)
}

fun findElement(element: Int){

    val row = arrayOf(1,2,3,4,5)
    val col = arrayOf(6,12,33,54,35)
    val arr = arrayOf(row,col)

    for (x in row.indices){
        for( y in col.indices){
            return if (arr[x][y] == element){
                println("found at position row $x and col $y")
            }else
             println("element not found")

        }
    }

}