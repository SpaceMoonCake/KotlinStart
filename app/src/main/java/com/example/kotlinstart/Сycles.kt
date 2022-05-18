package com.example.kotlinstart

class Cycles() {
    init {
        for(i in 1..10) {
            print("Hello Kotlin!")
        }

        for(i in 10 downTo 1 step 2) {
            print("Hello Kotlin!")
        }

    }
}