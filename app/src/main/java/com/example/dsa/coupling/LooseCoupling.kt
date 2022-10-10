package com.example.dsa.coupling


interface Motors{
    fun run()
}

class Tata : Motors{
    override fun run() {
       println("Tata cars")
    }
}
class Suzuki : Motors{
    override fun run() {
        println("Suzuki cars")
    }
}
class Cars(val motr : Motors){
    fun run(){
        motr.run()
    }
}

fun main(){
    val car = Cars(Suzuki())
    val car2 = Cars(Tata())
    car.run()
    car2.run()
}
