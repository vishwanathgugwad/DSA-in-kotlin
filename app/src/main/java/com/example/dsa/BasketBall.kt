package com.example.dsa

class BasketBall {

    fun calculate(case : Array<String>) : Int{
        var result = 0;
        var  arr : ArrayList<Int> = arrayListOf()
        var arrAt = 0
        for (i in case){
            when (i) {
                "C" -> {
                    arr.removeAt(arrAt-1)
                    arrAt--
                }
                "D" -> {
                    arr.add(arr[arrAt-1] * 2)
                    arrAt ++
                }
                "+" -> {
                    arr.add(arr[arrAt-1] + arr[arrAt-2]) 
                    arrAt++
                }
                else -> {
                    arr.add(i.toInt())
                    arrAt++
                }
            }
        }
        for (j in arr){
            result += j
        }

        return result

    }

}

fun main(){

    var sol = BasketBall()
    var result = sol.calculate(arrayOf("5","-2","4","C","D","9","+","+"))
    print(result)
}