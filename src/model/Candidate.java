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
//All Candidates have common attributes: Candidate Id, First Name, 
//Last Name, Birth Date, Address, Phone, Email and Candidate type. 
public class Candidate {
    private String candidateID;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private CandidateType candidateType;

    //Default constructor
    public Candidate() {
        
    }

    //Parameter constructor
    public Candidate(String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, CandidateType candidateType) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    //Setter & Getter
    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CandidateType getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(CandidateType candidateType) {
        this.candidateType = candidateType;
    }

    //Get full name
    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
    
    @Override
    public String toString() {
        return String.format("%s | %d | %s | %s | %s | %s", getFullName(), birthDate, address, phone, email, candidateType.toString()); 
    }
       
}
