package com.example.myapplication

class Rectangle(
    color: String,
    filled: Boolean,
    private val width: Double,
    private val height: Double
) : Shape(color, filled) {


    override fun getArea(): Double {
        return width * height
    }


    override fun printInfo() {
        super.printInfo()
        println("Width: $width, Height: $height, Area: ${getArea()}")
    }
}