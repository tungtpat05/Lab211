/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

/**
 * Created by Tungtpat05 on Jun 20, 2025.
 */
public class Message {

    //Private constructor
    private Message() {

    }
    
    public static String ERR_INT_IN_RANGE = "Please input an integer between [%d, %d]";
    public static String ERR_DOUBLE_IN_RANGE = "Please input a number between [%.2f, %.2f]";
    public static String ERR_DATE_FORMAT = "Please input a real date with format: dd-MM-yyyy";
    public static String MSG_SUCCESS = "Success! ";
    public static String MSG_FAIL = "Fail! ";
    public static String ERR_STRING_EMPTY = "Please input a string!";
    public static String ERR_TASK_INVALID = "Invalid tasks!";
    public static String ERR_ID_NOT_EXISTED = "ID not existed!";
    public static String ERR_PLAN_TIME = "Plan From must be less than Plan To!";
    public static String ERR_TIME_FORMAT = "Time format (8.0, 8.5, 9.0, 9.5, ..., 17.5)";
}
