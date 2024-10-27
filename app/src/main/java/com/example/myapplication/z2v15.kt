package com.example.myapplication

fun z2v15() {
    val a = 3
    val b = 6
    val c = 4


    val count = listOf(a, b, c).count { it < 5 }


    if (count == 2) {
        println("yes")
    } else {
        println("no")
    }
}