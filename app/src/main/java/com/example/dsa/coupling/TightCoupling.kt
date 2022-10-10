package com.example.dsa.coupling

class Bmw{
    fun run(){
        println("BMW running")
    }
}

class Audi{
    fun run(){
        println("Audi running")
    }
}
class Car{
lateinit var  bmw : Bmw
lateinit var audi : Audi
constructor(bm : Bmw , au : Audi){
    this.bmw = bm
    this.audi = au
}
    fun run(){
        bmw.run()
        audi.run()
    }
}

fun main(){
    val car = Car(Bmw(), Audi())
    car.run()
}