/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Validator {
    private static Scanner sc = new Scanner(System.in);
    
    public static double getDouble(String message, int min, int max) {
        while(true) {
            try {
                System.out.print(message);
                double number = Double.parseDouble(sc.nextLine());
                
                if(number > min && number <= max) return number;
                else System.err.println("Please input number > 0");
                
            } catch (NumberFormatException e) {
                System.err.println("Please input double number!");
            }
        }
    }
    
    public static boolean isValidTriangle(double a, double b, double c) {
        return a+b>c && a+c>b && b+c>a;
    }
}
