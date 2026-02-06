/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.WorkerController;
import java.util.Scanner;
import utils.WorkerException;
import utils.Validator;
import dto.WorkerDTO;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WorkerController workerController = new WorkerController();
        WorkerDTO workerDTO = new WorkerDTO();

        while (true) {

            //Display main menu
            workerController.displayMainMenu();
            int choice;
            //Ask user choice
            while (true) {

                //Ask user input
                try {
                    System.out.print("Choice: ");
                    choice = Integer.parseInt(sc.nextLine());

                    //Check number in range
                    Validator.validateIntInRange(choice, 1, 5);

                    //Out loop
                    break;

                } catch (WorkerException e) {
                    System.out.println(e.getMessage());
                    //Continue loop
                } catch (NumberFormatException e) {
                    System.out.println(constants.Message.MSG_INPUT_INTEGER);
                }
            }

            // Process choice
            switch (choice) {
                case 1: // Add a worker

                    //Input worker info
                    //Input ID
                    String id;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Code: ");
                            id = sc.nextLine();

                            //Check number in range
                            Validator.validateNonEmpty(id);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        }
                    }

                    //Input Name
                    String name;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Name: ");
                            name = sc.nextLine();

                            //Check number in range
                            Validator.validateNonEmpty(name);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        }
                    }

                    //Input Age
                    int age;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Age: ");
                            age = Integer.parseInt(sc.nextLine());

                            //Check number in range
                            Validator.validateIntInRange(age, 18, 50);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        } catch (NumberFormatException e) {
                            System.out.println(constants.Message.MSG_INT_IN_RANGE);
                        }
                    }

                    //Input Salary
                    double salary;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Salary: ");
                            salary = Double.parseDouble(sc.nextLine());

                            //Check number in range
                            Validator.validateDoubleInRange(salary, 0, Integer.MAX_VALUE);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        } catch (NumberFormatException e) {
                            System.out.println(constants.Message.MSG_DOUBLE_IN_RANGE);
                        }
                    }

                    //Input Work Location
                    String workLocation;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Work Location: ");
                            workLocation = sc.nextLine();

                            //Check number in range
                            Validator.validateNonEmpty(workLocation);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        }
                    }

                    //Set info to DTO
                    workerDTO.setId(id);
                    workerDTO.setName(name);
                    workerDTO.setAge(age);
                    workerDTO.setSalary(salary);
                    workerDTO.setWorkLocation(workLocation);

                    //Pass info of DTO to Controller
                    workerController.setInputInfo(workerDTO);

                    //Call Add function from controller
                    if (workerController.addWorker()) {
                        System.out.println(constants.Message.MSG_SUCCESS);
                    } else {
                        System.out.println(constants.Message.MSG_FAIL + constants.Message.MSG_EXISTED_ID);
                    }

                    break;
                case 2: // Up Salary

                    //Input worker info
                    //Input ID
                    String idUpSalary;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Code: ");
                            idUpSalary = sc.nextLine();

                            //Check number in range
                            Validator.validateNonEmpty(idUpSalary);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        }
                    }

                    //Input Salary
                    double salaryAdjustUp;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Salary: ");
                            salaryAdjustUp = Double.parseDouble(sc.nextLine());

                            //Check number in range
                            Validator.validateDoubleInRange(salaryAdjustUp, 0, Integer.MAX_VALUE);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        } catch (NumberFormatException e) {
                            System.out.println(constants.Message.MSG_DOUBLE_IN_RANGE);
                        }
                    }

                    //Set info to DTO
                    workerDTO.setId(idUpSalary);
                    workerDTO.setAdjustedMoney(salaryAdjustUp);

                    //Pass info of DTO to Controller
                    workerController.setInputInfo(workerDTO);

                    //Call Add function from controller
                    if (workerController.upSalary()) {
                        System.out.println(constants.Message.MSG_SUCCESS);
                    } else {
                        System.out.println(constants.Message.MSG_FAIL + constants.Message.MSG_NOT_EXISTED_ID);
                    }

                    break;

                case 3: // Down Salary

                    //Input worker info
                    //Input ID
                    String idDownSalary;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Code: ");
                            idDownSalary = sc.nextLine();

                            //Check number in range
                            Validator.validateNonEmpty(idDownSalary);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        }
                    }

                    //Input Salary
                    double salaryAdjustDown;
                    while (true) {

                        //Ask user input
                        try {
                            System.out.print("Enter Salary: ");
                            salaryAdjustDown = Double.parseDouble(sc.nextLine());

                            //Check number in range
                            Validator.validateDoubleInRange(salaryAdjustDown, 0, Integer.MAX_VALUE);

                            //Out loop
                            break;

                        } catch (WorkerException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        } catch (NumberFormatException e) {
                            System.out.println(constants.Message.MSG_DOUBLE_IN_RANGE);
                        }
                    }

                    //Set info to DTO
                    workerDTO.setId(idDownSalary);
                    workerDTO.setAdjustedMoney(salaryAdjustDown);

                    //Pass info of DTO to Controller
                    workerController.setInputInfo(workerDTO);

                    //Call Add function from controller
                    try {
                        if (workerController.downSalary()) {
                            System.out.println(constants.Message.MSG_SUCCESS);
                        } else {
                            System.out.println(constants.Message.MSG_FAIL + constants.Message.MSG_NOT_EXISTED_ID);
                        }
                    } catch (WorkerException e) {
                        System.out.println(e);
                    }
                    break;

                case 4: //List salary adjustion info
                    workerController.displaySalaryInfo();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return; // END PROGRAM
            }
        }
    }
}
