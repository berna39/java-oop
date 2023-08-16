package com.terminator.intermediate;

/*
 * Data Abstraction may also be defined as the process of identifying only
 * the required characteristics of an object ignoring the irrelevant details.
 */

abstract class Shape {

    // abstract method
    abstract double area();
}

class Circle extends Shape {

    double radius;

    @Override
    double area() {
        return Math.PI + Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {

    double width;
    double height;

    @Override
    double area() {
       return width * height;
    }
}
