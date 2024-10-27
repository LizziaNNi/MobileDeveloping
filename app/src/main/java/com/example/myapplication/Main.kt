package com.example.myapplication

fun main ()
{
    val a = 2


    val resultA = a * a
    println("a) x^2 = $resultA")


    val resultB = a * a * a
    println("б) x^3 = $resultB")


    val x2 = a * a
    val x4 = x2 * x2
    val resultC = x4 * a
    println("в) x^5 = $resultC")

    z2v15()

    z3v15()

    z4v2()

    val circle = Circle("Red", true, 5.0)
    val rectangle = Rectangle("Blue", false, 4.0, 6.0)

    circle.printInfo()
    rectangle.printInfo()
}