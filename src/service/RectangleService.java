/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dto.RectangleDTO;
import model.Rectangle;

/**
 *
 * @author nguye
 */
public class RectangleService {
    public Rectangle createRectangle(RectangleDTO rectangleDTO) {
        return new Rectangle(rectangleDTO.getLength(), rectangleDTO.getWidth());
    }
}
