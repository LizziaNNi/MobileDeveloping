package com.example.myapplication

    fun example1(a: Int, b: Int, c: String): Unit {
        println("Пример 1: a = $a, b = $b, c = $c")
    }


    fun example2(): String {
        return "Пример 2: Возвращаемая строка"
    }


    fun example3(func: () -> Unit): Unit {
        println("Пример 3: Вызываем переданную функцию")
        func()
    }

