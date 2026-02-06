/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class Triangle {

    private double sideA, sideB, sideC;
    
    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //Setter and Getter
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //Calculate Area
    public double getArea() {
        double s = getPerimeter();
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    //Calculate Perimeter
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return String.format("-----Triangle-----\nSide A: %f \nSide B: %f \nSide C: %f \nPerimeter: %f \nArea: %f", sideA, sideB, sideC, getPerimeter(), getArea());
    }
}
