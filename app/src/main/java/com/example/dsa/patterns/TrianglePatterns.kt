package com.example.dsa.patterns

import kotlin.math.round


fun main(){

    val n = 5
    for(i in 0 .. n*2){
        val col = if (i > n) 2*n - i else i
        val space  = n - col
        for (j in 0 .. space){
            print(" ")
        }
        for (k in 0 .. col){
            print("* ")
        }
        print("\n")
    }

   }