/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import constants.TaskType;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tungtpat05 on Jun 20, 2025.
 */
public class Validator {

    //Private constructor
    private Validator() {

    }
    
    //Check string emtpy
    public static void validateEmptyString(String input) {
        if(input == null || input.isEmpty()) {
            throw new TaskException(constants.Message.ERR_STRING_EMPTY);
        }
    }

    //Check valid int in range
    public static void validateIntInRange(int input, int min, int max) {
        if (input < min || input > max) {
            throw new TaskException(String.format(constants.Message.ERR_INT_IN_RANGE, min, max));
        }
    }

    //Check valid double in range
    public static void validateDoubleInRange(double input, double min, double max) {
        if (input < min || input > max) {
            throw new TaskException(String.format(constants.Message.ERR_DOUBLE_IN_RANGE, min, max));
        }
    }
    
    //Check Time plan format (8.0, 8.5, 9.0, 9.5, ..., 17.5)
    public static void validateTimeFormat(double input) {
        if((input*10)%5 !=0 ) {
            throw new TaskException(constants.Message.ERR_TIME_FORMAT);
        }
    }

    //Check valid date format: dd-MM-yyyy
    public static void validateDateFormat(String input) {
        Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        Matcher dateMatcher = datePattern.matcher(input);
        
        //Check matching pattern
        if (!dateMatcher.matches()) {
            throw new TaskException(constants.Message.ERR_DATE_FORMAT);
        }

        //Check valid real date (valid day, month, year)
        //If not a real date, throw a Exception (DateTimeParseException)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate.parse(input, formatter);
    }
    
    //Check valid task type (1-4)
    public static TaskType validateTaskType(int input) {
        return TaskType.numberToEnumTask(input);
    }
    
    
    //Check plane time range (plan from < plan to)
    public static void validatePlanTime(double from, double to) {
        if(from >= to) {
            throw new TaskException(constants.Message.ERR_PLAN_TIME);
        }
    }
}
