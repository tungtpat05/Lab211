/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguye
 */
public class ExperienceCandidate extends Candidate {
    private int expInYear;
    private String proSkill;

    //Default constructor
    public ExperienceCandidate() {
        setCandidateType(0);
    }

    //Parameter constructor
    public ExperienceCandidate(String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int expInYear, String proSkill) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    //Setter & Getter
    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
     
}
