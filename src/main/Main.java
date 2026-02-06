/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import constants.CandidateType;
import constants.GraduationRank;
import controller.CandidateController;
import java.util.Scanner;
import utils.CandidateException;
import utils.Validation;
import dto.CandidateDTO;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandidateController candidateController = new CandidateController();

        while (true) {
            //Display main menu
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n"
                    + "1. Experience\n"
                    + "2. Fresher\n"
                    + "3. Internship\n"
                    + "4. Searching\n"
                    + "5. Exit");

            //Ask user choice
            int choice;
            while (true) {
                try {
                    System.out.print("Choice: ");
                    choice = Integer.parseInt(sc.nextLine());

                    //Check number in range
                    Validation.validateIntInRange(choice, 1, 5);

                    //Out loop
                    break;

                } catch (CandidateException | NumberFormatException e) {
                    System.out.println(e.getMessage());
                    //Continue loop
                }
            }

            // Process choice
            switch (choice) {
                case 1: // Add Experience Candidate

                    while (true) {
                        //Input basic info
                        CandidateDTO candidateDTO1 = inputBasicInfo();

                        //Input special info of Experience candidate
                        //Input EXP 
                        int expInYear;
                        while (true) {
                            try {
                                System.out.print("EXP (nums of year): ");
                                expInYear = Integer.parseInt(sc.nextLine());

                                //Check number in range
                                Validation.validateIntInRange(expInYear, 0, 100);

                                //Out loop
                                break;

                            } catch (CandidateException | NumberFormatException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }

                        //Input Proskill
                        String proSkill;
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print("Pro skills: ");
                                proSkill = sc.nextLine();

                                //Check string empty
                                Validation.validateString(proSkill);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }

                        //Set info to DTO
                        candidateDTO1.setCandidateType(CandidateType.EXPERIENCE);
                        candidateDTO1.setExpInYear(expInYear);
                        candidateDTO1.setProSkill(proSkill);

                        //Pass info of DTO to Controller
                        candidateController.setInputInfo(candidateDTO1);

                        //Call Add function from controller
                        if (candidateController.createCandidate()) {
                            System.out.println(constants.Message.MSG_SUCCESS);
                        } else {
                            System.out.println(constants.Message.MSG_FAIL + constants.Message.ERR_ID_EXISTED);
                        }

                        //Ask user for continue or not
                        String yesno;
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print(constants.Message.MSG_YNOPTION);
                                yesno = sc.nextLine();

                                //Check string empty
                                Validation.validateString(yesno);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }
                        if (yesno.equalsIgnoreCase("N")) {

                            //Call list candidate function
                            candidateController.listAllCandidate();
                            break;
                        }
                    }
                    break;

                case 2: // Add Fresher Candidate

                    while (true) {
                        //Input basic info
                        CandidateDTO candidateDTO = inputBasicInfo();

                        //Input special info of Fresher candidate
                        //Input graduation date 
                        int graduationDate;
                        while (true) {
                            try {
                                System.out.print("Graduation date (year): ");
                                graduationDate = Integer.parseInt(sc.nextLine());

                                //Check number in range
                                Validation.validateIntInRange(graduationDate, 1900, 2025);

                                //Out loop
                                break;

                            } catch (CandidateException | NumberFormatException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }

                        //Input graduation rank
                        GraduationRank graduationRank;
                        while (true) {
                            try {
                                System.out.print("Graduation rank (1-Excellence, 2-Good, 3-Fair, 4-Poor): ");
                                int numberOfRank = Integer.parseInt(sc.nextLine());

                                //Check valid rank
                                graduationRank = Validation.validateRankGraduation(numberOfRank);

                                //Out loop
                                break;

                            } catch (CandidateException | NumberFormatException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }
                        //Input graduation University
                        String graduationUniversity;
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print("Graduation University: ");
                                graduationUniversity = sc.nextLine();

                                //Check string empty
                                Validation.validateString(graduationUniversity);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }

                        //Set info to DTO
                        candidateDTO.setCandidateType(CandidateType.FRESHER);
                        candidateDTO.setGraduationDate(graduationDate);
                        candidateDTO.setGraduationRank(graduationRank);
                        candidateDTO.setGraduationUniversity(graduationUniversity);

                        //Pass info of DTO to Controller
                        candidateController.setInputInfo(candidateDTO);

                        //Call Add function from controller
                        if (candidateController.createCandidate()) {
                            System.out.println(constants.Message.MSG_SUCCESS);
                        } else {
                            System.out.println(constants.Message.MSG_FAIL + constants.Message.ERR_ID_EXISTED);
                        }

                        //Ask user for continue or not
                        String yesno;
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print(constants.Message.MSG_YNOPTION);
                                yesno = sc.nextLine();

                                //Check string empty
                                Validation.validateString(yesno);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }
                        if (yesno.equalsIgnoreCase("N")) {

                            //Call list candidate function
                            candidateController.listAllCandidate();
                            break;
                        }
                    }
                    break;
                case 3: // Add Internship Candidate

                    while (true) {
                        //Input basic info
                        CandidateDTO candidateDTO = inputBasicInfo();

                        //Input special info of Internship candidate
                        //Input major
                        String major;
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print("Major: ");
                                major = sc.nextLine();

                                //Check string empty
                                Validation.validateString(major);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }
                        //Input semester
                        String semester;
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print("Semester: ");
                                semester = sc.nextLine();

                                //Check string empty
                                Validation.validateString(semester);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }
                        //Input university
                        String universityName;
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print("University: ");
                                universityName = sc.nextLine();

                                //Check string empty
                                Validation.validateString(universityName);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }

                        //Set info to DTO
                        candidateDTO.setCandidateType(CandidateType.INTERNSHIP);
                        candidateDTO.setMajor(major);
                        candidateDTO.setSemester(semester);
                        candidateDTO.setUniversityName(universityName);

                        //Pass info of DTO to Controller
                        candidateController.setInputInfo(candidateDTO);

                        //Call Add function from controller
                        if (candidateController.createCandidate()) {
                            System.out.println(constants.Message.MSG_SUCCESS);
                        } else {
                            System.out.println(constants.Message.MSG_FAIL + constants.Message.ERR_ID_EXISTED);
                        }
                        
                        String yesno;
                        //Ask user for continue or not
                        while (true) {
                            //Ask user input
                            try {
                                System.out.print(constants.Message.MSG_YNOPTION);
                                yesno = sc.nextLine();

                                //Check string empty
                                Validation.validateString(yesno);

                                //Out loop
                                break;

                            } catch (CandidateException e) {
                                System.out.println(e.getMessage());
                                //Continue loop
                            }
                        }
                        if (yesno.equalsIgnoreCase("N")) {

                            //Call list candidate function
                            candidateController.listAllCandidate();
                            break;
                        }
                    }
                    break;

                case 4: //Search based on part of name and Type of candidate
                    //Ask for input a part of name + type of candidate

                    //Input a part of name
                    String partOfName;
                    while (true) {
                        //Ask user input
                        try {
                            System.out.print("Input Candidate name (First name or Last name): ");
                            partOfName = sc.nextLine();

                            //Check string empty
                            Validation.validateString(partOfName);

                            //Out loop
                            break;

                        } catch (CandidateException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        }
                    }

                    //Input candidate type
                    CandidateType candidateType;
                    while (true) {
                        try {
                            System.out.print("Candidate type (0-Experience, 1-Fresher, 2-Internship): ");
                            int numberOfType = Integer.parseInt(sc.nextLine());

                            //Check number in range
                            candidateType = Validation.validateCandidateType(numberOfType);

                            //Out loop
                            break;

                        } catch (CandidateException | NumberFormatException e) {
                            System.out.println(e.getMessage());
                            //Continue loop
                        }
                    }

                    CandidateDTO candidateDTO = new CandidateDTO();

                    candidateDTO.setFirstName(partOfName);
                    candidateDTO.setCandidateType(candidateType);

                    //Pass info to controller through DTO
                    candidateController.setInputInfo(candidateDTO);

                    //Call search function
                    candidateController.searchCandidate();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return; // END PROGRAM
            }
        }
    }

    //Input basic info
    public static CandidateDTO inputBasicInfo() {
        Scanner sc = new Scanner(System.in);

        //Input ID
        String id;
        while (true) {
            //Ask user input
            try {
                System.out.print("ID: ");
                id = sc.nextLine();

                //Check string empty
                Validation.validateString(id);

                //Out loop
                break;

            } catch (CandidateException e) {
                System.out.println(e.getMessage());
                //Continue loop
            }
        }
        //Input first name
        String firstName;
        while (true) {
            //Ask user input
            try {
                System.out.print("First name: ");
                firstName = sc.nextLine();

                //Check string empty
                Validation.validateString(firstName);

                //Out loop
                break;

            } catch (CandidateException e) {
                System.out.println(e.getMessage());
                //Continue loop
            }
        }

        //Input last name
        String lastName;
        while (true) {
            //Ask user input
            try {
                System.out.print("Last name: ");
                lastName = sc.nextLine();

                //Check string empty
                Validation.validateString(lastName);

                //Out loop
                break;

            } catch (CandidateException e) {
                System.out.println(e.getMessage());
                //Continue loop
            }
        }

        //Input birth date
        int birthDate;
        while (true) {
            //Ask user input
            try {
                System.out.print("Birth date (year): ");
                birthDate = Integer.parseInt(sc.nextLine());

                //Check number in range
                Validation.validateIntInRange(birthDate, 1900, 2025);

                //Out loop
                break;

            } catch (CandidateException | NumberFormatException e) {
                System.out.println(e.getMessage());
                //Continue loop
            }
        }
        //Input Address
        String address;
        while (true) {
            //Ask user input
            try {
                System.out.print("Address: ");
                address = sc.nextLine();

                //Check string empty
                Validation.validateString(address);
                //Out loop
                break;

            } catch (CandidateException e) {
                System.out.println(e.getMessage());
                //Continue loop
            }
        }
        //Input phone number
        String phoneNumber;
        while (true) {
            //Ask user input
            try {
                System.out.print("Phone: ");
                phoneNumber = sc.nextLine();

                //Check string empty
                Validation.validateString(phoneNumber);
                //Check phone format
                Validation.validatePhoneNumber(phoneNumber);

                //Out loop
                break;

            } catch (CandidateException e) {
                System.out.println(e.getMessage());
                //Continue loop
            }
        }
        //Input email
        String email;
        while (true) {
            //Ask user input
            try {
                System.out.print("Email: ");
                email = sc.nextLine();

                //Check string empty
                Validation.validateString(email);
                //Check email format
                Validation.validateEmail(email);

                //Out loop
                break;

            } catch (CandidateException e) {
                System.out.println(e.getMessage());
                //Continue loop
            }
        }

        //Create new DTO 
        return new CandidateDTO(id, firstName, lastName, birthDate, address, phoneNumber, email);
    }
}
