/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.CandidateDTO;
import java.util.ArrayList;
import view.CandidateView;
import model.*;

/**
 *
 * @author nguye
 */
public class CandidateController {

    private CandidateView candidateView = new CandidateView();
    private CandidateDTO candidateDTO = new CandidateDTO();
    private ArrayList<ExperienceCandidate> experienceList = new ArrayList<>();
    private ArrayList<FresherCandidate> fresherList = new ArrayList<>();
    private ArrayList<InternshipCandidate> internshipList = new ArrayList<>();

    //Take user input info from DTO
    public void setInputInfo(CandidateDTO candidateDTO) {
        this.candidateDTO = candidateDTO;
    }

    //Create Experience Candidate
    public boolean creatExperienceCandidate() {
        for (ExperienceCandidate experienceCandidate : experienceList) {
            //Check id existed or not
            if (experienceCandidate.getCandidateID().equalsIgnoreCase(candidateDTO.getCandidateID())) {
                return false;
            }
        }
        //Add new candidate
        experienceList.add(new ExperienceCandidate(candidateDTO.getCandidateID(), candidateDTO.getFirstName(), candidateDTO.getLastName(), candidateDTO.getBirthDate(),
                candidateDTO.getAddress(), candidateDTO.getPhone(), candidateDTO.getEmail(), candidateDTO.getExpInYear(), candidateDTO.getProSkill()));
        return true;
    }

    //Create Fresher Candidate
    public boolean creatFresherCandidate() {
        for (FresherCandidate fresherCandidate : fresherList) {
            //Check id existed or not
            if (fresherCandidate.getCandidateID().equalsIgnoreCase(candidateDTO.getCandidateID())) {
                return false;
            }
        }
        //Add new candidate
        fresherList.add(new FresherCandidate(candidateDTO.getCandidateID(), candidateDTO.getFirstName(), candidateDTO.getLastName(), candidateDTO.getBirthDate(), candidateDTO.getAddress(),
                candidateDTO.getPhone(), candidateDTO.getEmail(), candidateDTO.getGraduationDate(), candidateDTO.getGraduationRank(), candidateDTO.getGraduationUniversity()));

        return true;
    }

    //Create Internship Candidate
    public boolean creatInternshipCandidate() {
        for (InternshipCandidate internshipCandidate : internshipList) {
            //Check id existed or not
            if (internshipCandidate.getCandidateID().equalsIgnoreCase(candidateDTO.getCandidateID())) {
                return false;
            }
        }
        //Add new candidate
        internshipList.add(new InternshipCandidate(candidateDTO.getCandidateID(), candidateDTO.getFirstName(), candidateDTO.getLastName(), candidateDTO.getBirthDate(),
                candidateDTO.getAddress(), candidateDTO.getPhone(), candidateDTO.getEmail(), candidateDTO.getMajor(), candidateDTO.getSemester(), candidateDTO.getUniversityName()));
        return true;
    }

    //Search candidate based on a part of name and type
    public void searchCandidate() {
        ArrayList<String> result = new ArrayList<>();
        //Type 0 : Experience Candidate
        if (candidateDTO.getCandidateType() == 0) {
            result.clear();
            for (ExperienceCandidate experienceCandidate : experienceList) {
                if (experienceCandidate.getFirstName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())
                        || experienceCandidate.getLastName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())) {
                    result.add(experienceCandidate.toString());
                }
            }
        }

        //Type 1 : Fresher Candidate
        if (candidateDTO.getCandidateType() == 1) {
            result.clear();
            for (FresherCandidate fresherCandidate : fresherList) {
                if (fresherCandidate.getFirstName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())
                        || fresherCandidate.getLastName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())) {
                    result.add(fresherCandidate.toString());
                }
            }
        }

        //Type 2 : Internship Candidate
        if (candidateDTO.getCandidateType() == 2) {
            result.clear();
            for (InternshipCandidate internshipCandidate : internshipList) {
                if (internshipCandidate.getFirstName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())
                        || internshipCandidate.getLastName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())) {
                    result.add(internshipCandidate.toString());
                }
            }
        }

        //Set list info for view and display
        candidateView.setArrayList(result);
        candidateView.printArrayList();
    }

    //Using generic type 
    private <T extends Candidate> void printCandidateList(String header, ArrayList<T> list) {
        candidateView.setHeader(header);
        candidateView.printGroupHeader();

        if (!list.isEmpty()) {
            for (T candidate : list) {
                candidateView.setBody(candidate.getFullName());
                candidateView.printBody();
            }
        } else {
            candidateView.setBody("No candidate!");
            candidateView.printBody();
        }
    }
    
    //listAllCandidate
    public void listAllCandidate() {
    printCandidateList("EXPERIENCE", experienceList);
    printCandidateList("FRESHER", fresherList);
    printCandidateList("INTERNSHIP", internshipList);
}

    //DisplayMainMenu
    public void displayMainMenu() {
        candidateView.printMainMenu();
    }
}
