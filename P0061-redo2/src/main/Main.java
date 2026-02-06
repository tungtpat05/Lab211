/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ShapeController;
import dto.*;
import static utils.Validator.*;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        ShapeController shapeController  = new ShapeController();
        
        //Tạo DTO để lấy input
        RectangleDTO rectangleDTO = new RectangleDTO();
        TriangleDTO triangleDTO = new TriangleDTO();
        CircleDTO circleDTO = new CircleDTO();
        
        double width = getDouble("Please input side width of Rectangle: ", 0, Integer.MAX_VALUE);
        double length = getDouble("Please input length of Rectangle: ", 0, Integer.MAX_VALUE);
        
        double radius = getDouble("Please input radius of Circle: ", 0, Integer.MAX_VALUE);
        
        double sideA = getDouble("Please input side A of Triangle: ", 0, Integer.MAX_VALUE);
        double sideB = getDouble("Please input side B of Triangle: ", 0, Integer.MAX_VALUE);
        double sideC = getDouble("Please input side C of Triangle: ", 0, Integer.MAX_VALUE);
        
        while(!isValidTriangle(sideA, sideB, sideC)) {
            System.err.println("Invalid sides of a Triangle! Pls input again!");
            sideA = getDouble("Please input side A of Triangle: ", 0, Integer.MAX_VALUE);
            sideB = getDouble("Please input side B of Triangle: ", 0, Integer.MAX_VALUE);
            sideC = getDouble("Please input side C of Triangle: ", 0, Integer.MAX_VALUE);
        }
        
        rectangleDTO = new RectangleDTO(length, width);
        triangleDTO  = new TriangleDTO(sideA, sideB, sideC);
        circleDTO = new CircleDTO(radius);
        
        shapeController.handleRectangle(rectangleDTO);
        shapeController.handleCircle(circleDTO);
        shapeController.handleTriangle(triangleDTO);
    }
}
