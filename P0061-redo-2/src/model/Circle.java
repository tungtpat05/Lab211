/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter and Getter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //Calculate Area
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    
    //Calculate Perimeter
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return String.format("-----Circle-----\nRadius: %f \nPerimeter: %f \nArea: %f",  radius, getPerimeter(), getArea());
    }
    
    
}
