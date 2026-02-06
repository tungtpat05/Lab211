/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dto;

import constants.Specialization;

/**
 *Created by Tungtpat05 on Jun 14, 2025.
 */
public class DoctorDTO {

    private String code;
    private String name;
    private Specialization specialization;
    private int availability;

    //Default construcor
    public DoctorDTO() {
    }

    //Parameter constructor
    public DoctorDTO(String code, String name, Specialization specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    //Setter & Getter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    } 

}
