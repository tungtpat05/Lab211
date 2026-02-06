/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.CandidateType;

/**
 *
 * @author nguye
 */
public class InternshipCandidate extends Candidate{
    private String major;
    private String semester;
    private String universityName;

    ////Default constructor
    public InternshipCandidate() {

    }

    ////Parameter constructor
    public InternshipCandidate(String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, CandidateType candidateType, String major, String semester, String universityName) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }
    
    ////Setter & Getter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    
}
