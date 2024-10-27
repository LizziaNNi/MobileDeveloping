package com.example.myapplication

fun main () {
    val number1 = 7
    val number2 = 4

    println("Результат для числа $number1: ${z1v3(number1)}")
    println("Результат для числа $number2: ${z1v3(number2)}")

    z2v3()
    z3v5()
    z4v7()

    example1(1, 2, "Hello")


    val result2 = example2()
    println(result2)

    
    example3 {
        println("Это вызов лямбда-функции внутри example3")
    }

}