/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *Created by Tungtpat05 on Jun 11, 2025.
 */
public class GetLocalDate {
    //Private constructor
    private GetLocalDate() {
        
    }
    
    public static String getDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Month: MM | minute:mm
        String formattedDate = now.format(formatter);
        return formattedDate;
    }
}
