/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import constants.Specialization;
import controller.DoctorController;
import dto.DoctorDTO;
import java.util.Scanner;
import utils.MyException;
import utils.Validator;

/**
 * Created by Tungtpat05 on Jun 14, 2025.
 */
public class Main {
    
    public static void main(String[] args) {
        
        DoctorController doctorController = new DoctorController();
        DoctorDTO doctorDTO = new DoctorDTO();
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            //Display main menu
            doctorController.displayMainMenu();

            //Ask user choice
            int choice;
            while (true) {
                try {
                    System.out.print("Choice: ");
                    choice = Integer.parseInt(sc.nextLine());

                    //Check valid
                    Validator.validateIntInRange(choice, 1, 5);

                    //No error
                    break;
                    
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    
                } catch (Exception e) {
                    System.out.println("Please input an integer!");
                }
            }
            
            switch (choice) {
                case 1: //Add
                    //Input info

                    //Input code
                    String code;
                    while (true) {
                        try {
                            System.out.print("Enter Code: ");
                            code = sc.nextLine();

                            //Check valid
                            Validator.validateNonEmpty(code);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }

                    //Input name
                    String name;
                    while (true) {
                        try {
                            System.out.print("Enter Name: ");
                            name = sc.nextLine();

                            //Check valid
                            Validator.validateNonEmpty(name);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }

                    //Input specialization
                    String input;
                    Specialization specialization;
                    while (true) {
                        try {
                            doctorController.displaySpecialization();
                            System.out.print("Enter Specialization: ");
                            input = sc.nextLine();

                            //Check String 
                            Validator.validateNonEmpty(input);
                            
                            //Get Type of specialization
                            specialization = Validator.getValidSpecialization(input);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }
                    //Input availability
                    int availability;
                    while (true) {
                        try {
                            System.out.print("Availability: ");
                            availability = Integer.parseInt(sc.nextLine());

                            //Check valid
                            Validator.validateIntInRange(availability, 1, 5);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        } catch (Exception e) {
                            System.out.println("Please input an integer!");
                        }
                    }

                    //Set info for DTO
                    doctorDTO.setCode(code);
                    doctorDTO.setName(name);
                    doctorDTO.setSpecialization(specialization);
                    doctorDTO.setAvailability(availability);
                    
                    //Pass info for controller
                    doctorController.setInputInfo(doctorDTO);
                    
                    //Call add funtion
                    if(doctorController.addDoctor()) {
                        System.out.println(constants.Message.MSG_SUCCESS);
                    } else {
                        System.out.println(constants.Message.MSG_FAIL + constants.Message.MSG_ID_EXISTED);
                    }
                    
                    break;
                case 2: //Update based on id

                    //Input code
                    while (true) {
                        try {
                            System.out.print("Enter Code: ");
                            code = sc.nextLine();

                            //Check valid
                            Validator.validateNonEmpty(code);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }
                    
                    //Input name
                    while (true) {
                        try {
                            System.out.print("Enter Name: ");
                            name = sc.nextLine();

                            //Check valid
                            Validator.validateNonEmpty(name);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }

                    //Input specialization
                    while (true) {
                        try {
                            doctorController.displaySpecialization();
                            System.out.print("Enter Specialization: ");
                            input = sc.nextLine();

                            //Check String 
                            Validator.validateNonEmpty(input);
                            
                            //Get Type of specialization
                            specialization = Validator.getValidSpecialization(input);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }
                    //Input availability
                    while (true) {
                        try {
                            System.out.print("Availability: ");
                            availability = Integer.parseInt(sc.nextLine());

                            //Check valid
                            Validator.validateIntInRange(availability, 1, 5);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        } catch (Exception e) {
                            System.out.println("Please input an integer!");
                        }
                    }
                    
                    //Set info for DTO
                    doctorDTO.setCode(code);
                    doctorDTO.setName(name);
                    doctorDTO.setSpecialization(specialization);
                    doctorDTO.setAvailability(availability);
                    
                    //Pass info for controller
                    doctorController.setInputInfo(doctorDTO);
                    
                    //Call add funtion
                    if(doctorController.updateDoctor()) {
                        System.out.println(constants.Message.MSG_SUCCESS);
                    } else {
                        System.out.println(constants.Message.MSG_FAIL + constants.Message.MSG_ID_NOT_EXISTED);
                    }
                    
                    break;
                case 3: //Delete based on id

                    //Input code
                    while (true) {
                        try {
                            System.out.print("Enter Code: ");
                            code = sc.nextLine();

                            //Check valid
                            Validator.validateNonEmpty(code);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }
                    
                    //Set info for DTO
                    doctorDTO.setCode(code);
                    
                    //Pass info for controller
                    doctorController.setInputInfo(doctorDTO);
                    
                    //Call add funtion
                    if(doctorController.deleteDoctor()) {
                        System.out.println(constants.Message.MSG_SUCCESS);
                    } else {
                        System.out.println(constants.Message.MSG_FAIL + constants.Message.MSG_ID_NOT_EXISTED);
                    }
                    
                    break;
                case 4: //Search based on specialization
                    
                    //Input specialization
                    while (true) {
                        try {
                            doctorController.displaySpecialization();
                            System.out.print("Enter Specialization: ");
                            input = sc.nextLine();

                            //Check String 
                            Validator.validateNonEmpty(input);
                            
                            //Get Type of specialization
                            specialization = Validator.getValidSpecialization(input);

                            //No error
                            break;
                            
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            
                        }
                    }
                    
                    //Set info for DTO
                    doctorDTO.setSpecialization(specialization);
                    
                    //Pass info for controller
                    doctorController.setInputInfo(doctorDTO);
                    
                    //Call search function
                    doctorController.searchDoctor();
                    break;
                case 5: //Exit
                    return;
                
            }
        }
    }
}
