/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class Rectangle extends Shape{
    private double length, width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setter and Getter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    //Calculate Area
    public double getArea(){
        return width*length;
    }
    
    //Calculate Perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return String.format("-----Rectangle-----\nWidth: %f \nLength: %f \nPerimeter: %f \nArea: %f",  width, length, getPerimeter(), getArea());
    }
    
    
}
