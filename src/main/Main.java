/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.CandidateController;
import dto.CandidateDTO;
import utils.Validation;

/**
 *
 * @author nguye
 */
public class Main {

    public static void main(String[] args) {
        CandidateController candidateController = new CandidateController();
        CandidateDTO candidateDTO = new CandidateDTO();

        int choice = 1;
        while (1 <= choice && choice <= 4) {
            //Display main menu
            candidateController.displayMainMenu();

            //Ask user choice
            choice = Validation.getInt("Choice: ", 1, 5);
            switch (choice) {
                case 1:
                    while (true) {
                        //Input basic info of candidate
                        candidateDTO = inputBasicCandidateInfo();

                        //Input special info of Experience candidate
                        int expInYear = Validation.getInt("EXP (nums of year): ", 0, 100);
                        String proSkill = Validation.getString("Pro skills: ");

                        candidateDTO.setExpInYear(expInYear);
                        candidateDTO.setProSkill(proSkill);

                        //Pass info to controller through DTO
                        candidateController.setInputInfo(candidateDTO);

                        //Call create Experience cnadidate function
                        if(candidateController.creatExperienceCandidate()) {
                            System.out.println("Created successfully!");
                        } else {
                            System.err.println("ID existed!");
                        }

                        //Ask user for continue or not
                        String yesno = Validation.getString(constants.Message.MSG_YNOPTION);
                        if (yesno.equalsIgnoreCase("N")) {

                            //Call list candidate function
                            candidateController.listAllCandidate();
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        //Input basic info of candidate
                        candidateDTO = inputBasicCandidateInfo();

                        //Input special info of Fresher candidate
                        int graduationDate = Validation.getInt("Graduation date (year): ", 1900, 2025);
                        String graduationRank = Validation.getRankGraduation("Graduation rank (Excellence, Good, Fair, Poor):");
                        String graduationUniversity = Validation.getString("University: ");

                        candidateDTO.setGraduationDate(graduationDate);
                        candidateDTO.setGraduationRank(graduationRank);
                        candidateDTO.setGraduationUniversity(graduationUniversity);

                        //Pass info to controller through DTO
                        candidateController.setInputInfo(candidateDTO);

                        //Call create Experience cnadidate function
                        if(candidateController.creatFresherCandidate()) {
                            System.out.println("Created successfully!");
                        } else {
                            System.err.println("ID existed!");
                        }

                        //Ask user for continue or not
                        String yesno = Validation.getString(constants.Message.MSG_YNOPTION);
                        if (yesno.equalsIgnoreCase("N")) {

                            //Call list candidate function
                            candidateController.listAllCandidate();
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        //Input basic info of candidate
                        candidateDTO = inputBasicCandidateInfo();

                        //Input special info of Internship candidate
                        String major = Validation.getString("Major: ");
                        String semester = Validation.getString("Semester: ");
                        String universityName = Validation.getString("University: ");

                        candidateDTO.setMajor(major);
                        candidateDTO.setSemester(semester);
                        candidateDTO.setUniversityName(universityName);

                        //Pass info to controller through DTO
                        candidateController.setInputInfo(candidateDTO);

                        //Call create Experience cnadidate function
                        if(candidateController.creatInternshipCandidate()) {
                            System.out.println("Created successfully!");
                        } else {
                            System.err.println("ID existed!");
                        }

                        //Ask user for continue or not
                        String yesno = Validation.getString(constants.Message.MSG_YNOPTION);
                        if (yesno.equalsIgnoreCase("N")) {

                            //Call list candidate function
                            candidateController.listAllCandidate();
                            break;
                        }
                    }
                    break;
                case 4:
                    //Ask for input a part of name + type of candidate
                    String name = Validation.getString("Input Candidate name (First name or Last name): ");
                    int type = Validation.getCandidateType("Input type of candidate (0,1,2): ");
                    
                    candidateDTO.setFirstName(name);
                    candidateDTO.setCandidateType(type);

                    //Pass info to controller through DTO
                    candidateController.setInputInfo(candidateDTO);

                    //Call search function
                    candidateController.searchCandidate();
                    break;
            }
        }
    }

    public static CandidateDTO inputBasicCandidateInfo() {
        String candidateID = Validation.getString("ID: ");
        String firstName = Validation.getString("First name: ");
        String lastName = Validation.getString("Last name: ");
        int birthDate = Validation.getInt("Birth date (year): ", 1900, 2025);
        String address = Validation.getString("Address: ");
        String phone = Validation.getPhone("Phone: ");
        String email = Validation.getEmail("Email: ");

        return new CandidateDTO(candidateID, firstName, lastName, birthDate, address, phone, email);
    }
}
