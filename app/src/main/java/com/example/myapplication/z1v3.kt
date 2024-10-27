package com.example.myapplication

fun z1v3(number: Int): Int {
    return if (number % 2 != 0) {
        0
    } else {
        number * number
    }
}