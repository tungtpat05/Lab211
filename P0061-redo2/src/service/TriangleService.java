/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dto.TriangleDTO;
import model.Triangle;

/**
 *
 * @author nguye
 */
public class TriangleService {
    public Triangle createTriangle(TriangleDTO triangleDTO) {
        return new Triangle(triangleDTO.getSideA(), triangleDTO.getSideB(), triangleDTO.getSideC());
    }
}
