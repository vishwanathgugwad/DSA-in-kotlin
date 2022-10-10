package com.example.dsa.enumandsealed

import androidx.lifecycle.MutableLiveData
import java.util.*


sealed class Response<T> {

    class Loading<T> : Response<T>()
    class Success<T>(val data : String) : Response<T>(){}
    class Failed<T>(val message : String) : Response<T>()
}

