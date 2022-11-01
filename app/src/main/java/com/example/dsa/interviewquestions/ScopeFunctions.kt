package com.example.dsa.interviewquestions



fun main(){
    val obj = Emp("vizz" , 50)
    val num :Int? = null

    val arr : Array<Emp> = arrayOf(Emp("gg",10), Emp("bb" ,20))

    //apply scope returns the object itself
    val applyF = obj.apply {
        println(name)
        "apply function"
    }
    println(applyF)


    num?.let {
        println(it)
    }
//let returns the last expression
    val letF = obj.let {
        println((it.name))

        "let function"
    }
    println(letF)

}

data class Emp(var name :String ="" , var age : Int = 0)