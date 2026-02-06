/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;


/**
 *Created by Tungtpat05 on Jun 11, 2025.
 */
public class Validator {

    //Private constructor
    private Validator() {

    }

    //Check string input
    public static void validateNonEmpty(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new WorkerException(constants.Message.MSG_INPUT_STRING);
        }
    }

    //Check valid money
    public static void validateDoubleInRange(double inputNumber, double min, double max) {
        //Check number in range
        if (inputNumber < min || max < inputNumber) {
            throw new WorkerException(String.format(constants.Message.MSG_DOUBLE_IN_RANGE, min, max));
        }
    }
    
    //Check valid age 
    public static void validateIntInRange(int inputNumber, int min, int max) {
        //Check number in range
        if (inputNumber < min || max < inputNumber) {
            throw new WorkerException(String.format(constants.Message.MSG_INT_IN_RANGE, min, max));
        }
    }

}
