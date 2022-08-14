package com.example.dsa.strings




fun main(){

    var str = "visshwannathh"
    println(removeDup(str))
    println(printDup(str))

}



fun removeDup(str : String) {

    var str = str.toCharArray()
    for (i in str.indices){
        for (j in i+1 until  str.size){
            if (str[i] == str[j]){
                println(str[j])
            }
        }
    }

}

//print occurance
fun printDup(str:String){
    var str = str.toCharArray()
    var map = mutableMapOf<Char,Int>()

    for (i in str){
        if (map.containsKey(i)){
            map[i] = map[i]!! + 1
        }else
        map[i] = 1
    }

    for (i in map){
        if(i.value > 1)
        println("${i.key} repeats ${i.value} times")
    }
}
