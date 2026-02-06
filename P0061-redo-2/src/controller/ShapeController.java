/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.*;
import model.*;
import view.ShapeView;

/**
 *
 * @author nguye
 */
public class ShapeController {
    private ShapeView view = new ShapeView();
    private ShapeDTO shapeDTO = new ShapeDTO();
    
    //Take input from DTO
    public void setShapeInfo(ShapeDTO shapeDTO) {
        this.shapeDTO = shapeDTO;
    }
    
    //Display Rectangle Info
    public void displayRectangle() {
        Rectangle rectangle = new Rectangle(shapeDTO.getLength(), shapeDTO.getWidth());
        view.setMessage(rectangle.toString());
        view.print();
    }
    
    //Display Circle Info
    public void displayCircle() {
        Circle circle = new Circle(shapeDTO.getRadius());
        view.setMessage(circle.toString());
        view.print();
    }
    
    //Display Triangle Info
    public void displayTriangle() {
        Triangle triangle = new Triangle(shapeDTO.getSideA(), shapeDTO.getSideB(), shapeDTO.getSideC());
        view.setMessage(triangle.toString());
        view.print();
    }
    
}
