/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.*;
import dto.*;
import model.*;
import view.ShapeView;

/**
 *
 * @author nguye
 */
public class ShapeController {
    private ShapeView view = new ShapeView();
    private RectangleService rectangleService = new RectangleService();
    private TriangleService triangleService = new TriangleService();
    private CircleService circleService = new CircleService();
    
    public void handleRectangle(RectangleDTO dto) {
        Rectangle rectangle = rectangleService.createRectangle(dto);
        view.print("-----Rectangle-----");
        view.print("Width: " + rectangle.getWidth());
        view.print("Length: " +  rectangle.getLength());
        view.print("Area: " + rectangle.getArea());
        view.print("Perimeter: " + rectangle.getPerimeter());
    }
    
    public void handleCircle(CircleDTO dto) {
        Circle circle = circleService.createCircle(dto);
        view.print("-----Circle-----");
        view.print("Radius: " + circle.getRadius());
        view.print("Area: " + circle.getArea());
        view.print("Perimeter: " + circle.getPerimeter());
    }
    
    public void handleTriangle(TriangleDTO dto) {
        Triangle triangle = triangleService.createTriangle(dto);
        view.print("-----Triangle-----");
        view.print("Side A: " +  triangle.getSideA());
        view.print("Side B: " +  triangle.getSideB());
        view.print("Side C: " +  triangle.getSideC());
        view.print("Area: " + triangle.getArea());
        view.print("Perimeter: " + triangle.getPerimeter());
    }
}
