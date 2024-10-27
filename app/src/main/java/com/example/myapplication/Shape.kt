package com.example.myapplication

abstract class Shape(
    protected val color: String,
    protected val filled: Boolean
) {

    abstract fun getArea(): Double


    open fun printInfo() {
        println("Color: $color, Filled: $filled")
    }
}