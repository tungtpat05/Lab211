/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class FresherCandidate extends Candidate{
    private int graduationDate;
    private String graduationRank;
    private String graduationUniversity;

    ////Default constructor
    public FresherCandidate() {
        setCandidateType(1);
    }

    ////Parameter constructor
    public FresherCandidate(String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int graduationDate, String graduationRank, String graduationUniversity) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.graduationUniversity = graduationUniversity;
    }

    ////Setter & Getter
    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getGraduationUniversity() {
        return graduationUniversity;
    }

    public void setGraduationUniversity(String graduationUniversity) {
        this.graduationUniversity = graduationUniversity;
    }
    
    
    
}
