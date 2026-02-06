/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import constants.Specialization;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class Validator {

    //Private constructor
    private Validator() {

    }

    //Check string input
    public static void validateNonEmpty(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new MyException("Input must not be empty.");
        }
    }

    //Check valid Availability 
    public static void validateIntInRange(int inputNumber, int min, int max) {
        //Check number in range
        if (inputNumber < min || max < inputNumber) {
            throw new MyException(String.format("Please input a number between %d and %d\n", min, max));
        }
    }

    //Check valid Specialization
    public static Specialization getValidSpecialization(String input) {

        //Iterate through Enum 
        for (Specialization specialization : Specialization.values()) {

            //Check input match type of Specializations
            if (specialization.toString().equalsIgnoreCase(input)) {
                return specialization;
            }
        }

        throw new MyException("Specialization not existed!");

    }
}

