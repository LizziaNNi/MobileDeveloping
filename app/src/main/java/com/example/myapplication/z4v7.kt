package com.example.myapplication

fun z4v7() {
    fun filterArray(array: IntArray, predicate: (Int) -> Boolean): IntArray {
        return array.filter(predicate).toIntArray()
    }
    val task2: (Int) -> Boolean = { number ->
        number in 100..999
    }


    val numbers = intArrayOf(50, 150, 200, 300, 500, 1000, 1200)


    val result = filterArray(numbers, task2)
    println("Результат фильтрации с использованием task2: ${result.joinToString()}")
}