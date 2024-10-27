package com.example.myapplication

fun z3v15() {

    var number = 1000

    while (number <= 9999) {

        val thousands = number / 1000
        val hundreds = (number / 100) % 10
        val tens = (number / 10) % 10
        val units = number % 10


        val sumOfDigits = thousands + hundreds + tens + units


        if (sumOfDigits == 15) {
            println(number)
        }


        number++
    }
}