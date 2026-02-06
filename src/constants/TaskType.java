/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

import utils.TaskException;

/**
 * Created by Tungtpat05 on Jun 21, 2025.
 */
public enum TaskType {
    CODE("Code"),
    TEST("Test"),
    DESIGN("Design"),
    REVIEW("Review");

    private String stringTaskType;

    private TaskType(String stringTaskType) {
        this.stringTaskType = stringTaskType;
    }

    //Convert input number (1-4) to enum
    public static TaskType numberToEnumTask(int number) {
        switch (number) {
            case 1:
                return CODE;
            case 2:
                return TEST;
            case 3:
                return DESIGN;
            case 4:
                return REVIEW;
            default:
                throw new TaskException(constants.Message.ERR_TASK_INVALID);
        }
    }

    @Override
    public String toString() {
        return stringTaskType;
    }

}
