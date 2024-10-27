package com.example.myapplication

class Circle(
    color: String,
    filled: Boolean,
    private val radius: Double
) : Shape(color, filled) {


    override fun getArea(): Double {
        return Math.PI * radius * radius
    }


    override fun printInfo() {
        super.printInfo()
        println("Radius: $radius, Area: ${getArea()}")
    }
}