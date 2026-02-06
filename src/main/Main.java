/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import constants.TaskType;
import controller.TaskController;
import dto.TaskDTO;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import utils.TaskException;
import utils.Validator;

/**
 * Created by Tungtpat05 on Jun 21, 2025.
 */
public class Main {

    public static void main(String[] args) {
        TaskController taskController = new TaskController();
        TaskDTO taskDTO = new TaskDTO();

        Scanner sc = new Scanner(System.in);

        while (true) {
            //Print main menu
            System.out.println("======== Task Management =========\n"
                + "1. Add Task\n"
                + "2. Delete Task\n"
                + "3. Display Task\n"
                + "4. Exit\n");

            //Ask user choice
            int choice;
            while (true) {
                try {
                    System.out.print("Choice: ");
                    choice = Integer.parseInt(sc.nextLine());

                    Validator.validateIntInRange(choice, 1, 4);

                    break;
                } catch (TaskException | NumberFormatException e) {
                    System.out.println(e);
                }
            }

            //Switch case
            switch (choice) {
                case 1: //Add task
                    //Input info
                    //Input Name
                    String name;
                    while (true) {
                        try {
                            System.out.print("Requiredment Name: ");
                            name = sc.nextLine();

                            Validator.validateEmptyString(name);

                            break;
                        } catch (TaskException e) {
                            System.out.println(e);
                        }
                    }

                    //Input Task type
                    TaskType taskType;
                    while (true) {
                        try {
                            //Display all type of tasks
                            taskController.displayAllTaskType();
                            
                            //Ask input task
                            System.out.print("Task Type: ");
                            int input = Integer.parseInt(sc.nextLine());

                            taskType = Validator.validateTaskType(input);

                            break;
                        } catch (TaskException | NumberFormatException e) {
                            System.out.println(e);
                        }
                    }

                    //Input Date
                    String date;
                    while (true) {
                        try {
                            System.out.print("Date (dd-MM-yyyy): ");
                            date = sc.nextLine();

                            Validator.validateDateFormat(date);

                            break;
                        } catch (TaskException | DateTimeParseException e) {
                            System.out.println(e);
                        }
                    }

                    //Out the loop when from (time) < to (time)
                    double planFrom;
                    double planTo;
                    while (true) {
                        try {
                            //Input Plan From 
                            while (true) {
                                try {
                                    System.out.print("From (8.0, 8.5, 9.0, 9.5, ..., 17.5): ");
                                    planFrom = Double.parseDouble(sc.nextLine());

                                    Validator.validateDoubleInRange(planFrom, 8, 17.5);
                                    Validator.validateTimeFormat(planFrom);

                                    break;
                                } catch (TaskException | NumberFormatException e) {
                                    System.out.println(e);
                                }
                            }

                            //Input Plan To
                            while (true) {
                                try {
                                    System.out.print("To (8.0, 8.5, 9.0, 9.5, ..., 17.5): ");
                                    planTo = Double.parseDouble(sc.nextLine());

                                    Validator.validateDoubleInRange(planTo, 8, 17.5);
                                    Validator.validateTimeFormat(planTo);

                                    break;
                                } catch (TaskException | NumberFormatException e) {
                                    System.out.println(e);
                                }
                            }

                            //Check plan time
                            Validator.validatePlanTime(planFrom, planTo);

                            break;
                        } catch (TaskException e) {
                            System.out.println(e);
                        }
                    }

                    //Input Assignee
                    String assignee;
                    while (true) {
                        try {
                            System.out.print("Assignee: ");
                            assignee = sc.nextLine();

                            Validator.validateEmptyString(assignee);

                            break;
                        } catch (TaskException e) {
                            System.out.println(e);
                        }
                    }
                    //Input Reviewer
                    String reviewer;
                    while (true) {
                        try {
                            System.out.print("Reviewer: ");
                            reviewer = sc.nextLine();

                            Validator.validateEmptyString(reviewer);

                            break;
                        } catch (TaskException e) {
                            System.out.println(e);
                        }
                    }

                    //Set info for DTO
                    taskDTO.setName(name);
                    taskDTO.setTaskTypeID(taskType);
                    taskDTO.setDate(date);
                    taskDTO.setPlanFrom(planFrom);
                    taskDTO.setPlanTo(planTo);
                    taskDTO.setAssignee(assignee);
                    taskDTO.setReviewer(reviewer);

                    //Pass info to controller
                    taskController.setInputInfo(taskDTO);

                    //Call add funtion
                    taskController.addTask();
                    System.out.println(constants.Message.MSG_SUCCESS);

                    break;
                case 2: //Delete task

                    //Ask input ID
                    int id;
                    while (true) {
                        try {
                            System.out.print("ID: ");
                            id = Integer.parseInt(sc.nextLine());

                            Validator.validateIntInRange(id, 1, 1000);

                            break;
                        } catch (TaskException | NumberFormatException e) {
                            System.out.println(e);
                        }
                    }
                    
                    //Set info for DTO
                    taskDTO.setIdInput(id);
                    
                    //Pass info to controller
                    taskController.setInputInfo(taskDTO);
                    
                    
                    //Call delete function
                    if(taskController.deleteTask()) {
                        System.out.println(constants.Message.MSG_SUCCESS);
                    } else {
                        System.out.println(constants.Message.MSG_FAIL + constants.Message.ERR_ID_NOT_EXISTED);
                    }
                    
                    break;
                case 3: //Display task
                    
                    taskController.displayAllTask();
                    break;
                case 4: //Exit
                    return;
            }
        }
    }
}
