package com.example.myapplication

fun z3v5() {

    val originalArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val task2: (Int) -> Boolean = { number ->
        number in 100..999
    }


    val filteredArray = originalArray.filter { task2(it) }


    val transformedArray = filteredArray.map { z1v3(it) }


    println("Исходный массив: ${originalArray.joinToString()}")
    println("Отфильтрованный и преобразованный массив: ${transformedArray.joinToString()}")
}