package com.example.dsa

import java.nio.charset.Charset
import kotlin.random.Random

class RandomPasswordGenarator {



   fun generatePassword(charset : String) : String{
       var password = ""
        for (i in 0 ..6){
            password += charset[Random.nextInt(1,charset.length)].toString()
        }

       return password
   }


}
fun main(){

    var charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    var ran = RandomPasswordGenarator()
    var password = ran.generatePassword(charset)
    print(password)
}