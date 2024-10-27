package com.example.myapplication

fun z2v3() {
    val task2: (Int) -> Boolean = { number ->
        number in 100..999
    }
    val number1 = 123
    val number2 = 99
    val number3 = 1000

    println("Число $number1 трехзначное: ${task2(number1)}")
    println("Число $number2 трехзначное: ${task2(number2)}")
    println("Число $number3 трехзначное: ${task2(number3)}")
}