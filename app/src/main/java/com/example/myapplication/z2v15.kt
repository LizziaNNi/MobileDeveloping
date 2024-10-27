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


    val q = 3
    val w= 6
    val e = 4


    val result = when {
        (q < 5 && w < 5 && e >= 5) || (q < 5 && w >= 5 && e < 5) || (q >= 5 && w < 5 && e < 5) -> "yes"
        else -> "no"
    }


    println(result)
}