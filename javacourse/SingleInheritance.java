package com.javacourse;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter (circumference)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Example radius
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
