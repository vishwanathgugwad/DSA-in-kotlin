package com.example.dsa.interviewQuestionsStacksandQueues.stackOfPlates

class StackNode {

     var value : Int
    var above : StackNode? = null
    var below : StackNode?= null

    constructor(nodeValue : Int){
        value = nodeValue
    }
}