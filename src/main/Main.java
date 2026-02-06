/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ShapeController;
import dto.ShapeDTO;
import static utils.Validator.*;

/**
 *
 * @author nguye
 */
public class Main {

    public static void main(String[] args) {
        ShapeController shapeController = new ShapeController();
        ShapeDTO shapeDTO = new ShapeDTO();
        
        //Take input from user
        double width = getDouble("Please input side width of Rectangle: ", 0, Integer.MAX_VALUE);
        double length = getDouble("Please input length of Rectangle: ", 0, Integer.MAX_VALUE);

        double radius = getDouble("Please input radius of Triangle: ", 0, Integer.MAX_VALUE);

        double sideA = getDouble("Please input side A of Rectangle: ", 0, Integer.MAX_VALUE);
        double sideB = getDouble("Please input side B of Rectangle: ", 0, Integer.MAX_VALUE);
        double sideC = getDouble("Please input side C of Rectangle: ", 0, Integer.MAX_VALUE);
        
        //Check valid sides of Triangle
        while (!isValidTriangle(sideA, sideB, sideC)) {
            System.err.println("Invalid sides of a Triangle! Pls input again!");
            sideA = getDouble("Please input side A of Triangle: ", 0, Integer.MAX_VALUE);
            sideB = getDouble("Please input side B of Triangle: ", 0, Integer.MAX_VALUE);
            sideC = getDouble("Please input side C of Triangle: ", 0, Integer.MAX_VALUE);
        }
        
        //Set input for DTO
        shapeDTO.setWidth(width);
        shapeDTO.setLength(length);
        shapeDTO.setRadius(radius);
        shapeDTO.setSideA(sideA);
        shapeDTO.setSideB(sideB);
        shapeDTO.setSideC(sideC);

        //Transmit DTO to Controller
        shapeController.setShapeInfo(shapeDTO);
        
        //Display
        shapeController.displayRectangle();
        shapeController.displayCircle();
        shapeController.displayTriangle();
    }
}
