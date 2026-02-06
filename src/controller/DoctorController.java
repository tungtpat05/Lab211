/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import constants.Specialization;
import dto.DoctorDTO;
import java.util.ArrayList;
import java.util.List;
import model.Doctor;
import view.DoctorView;

/**
 * Created by Tungtpat05 on Jun 14, 2025.
 */
public class DoctorController {

    private DoctorView doctorView = new DoctorView();
    private DoctorDTO doctorDTO = new DoctorDTO();
    private List<Doctor> doctorList = new ArrayList<>();

    //Take info from user input
    public void setInputInfo(DoctorDTO doctorDTO) {
        this.doctorDTO = doctorDTO;
    }

    //Check existed ID
    private boolean isExistedID() {
        for (Doctor doctor : doctorList) {
            if (doctor.getCode().equalsIgnoreCase(doctorDTO.getCode())) {
                return true;
            }
        }

        return false;
    }

    //Add a new Doctor
    public boolean addDoctor() {
        if (!isExistedID()) {
            //Add
            doctorList.add(new Doctor(doctorDTO.getCode(), doctorDTO.getName(), doctorDTO.getSpecialization(), doctorDTO.getAvailability()));
            return true;
        }

        //Existed ID
        return false;
    }

    //Update based on code
    public boolean updateDoctor() {
        if (isExistedID()) {
            for (Doctor doctor : doctorList) {
                if (doctor.getCode().equalsIgnoreCase(doctorDTO.getCode())) {

                    //Set new info
                    doctor.setName(doctorDTO.getName());
                    doctor.setSpecialization(doctorDTO.getSpecialization());
                    doctor.setAvailability(doctorDTO.getAvailability());

                }
            }

            return true;
        }

        return false;
    }

    //Delete based on code
    public boolean deleteDoctor() {
        if (isExistedID()) {

            return doctorList.removeIf(doctor
                    -> doctor.getCode().equalsIgnoreCase(doctorDTO.getCode())
            );
            
            
            /* CÁCH 2:
            Iterator<Doctor> it = doctorList.iterator();
            //it ở vị trí trước phần tử đầu tiên

            while (it.hasNext()) {
                Doctor doctor = it.next(); // lấy phần tử kế tiếp

                if (doctor.getCode().equalsIgnoreCase(doctorDTO.getCode())) {
                    it.remove(); // ✅ Xóa an toàn không lỗi
                    return true;
                }
            }

            */

        }

        return false;
    }

    //Search Doctor based on specialization 
    public void searchDoctor() {
        //Create a list to store result of searching
        List<String> result = new ArrayList<>();

        //Display header of column
        doctorView.setBody(String.format("%-25s%-25s%-25s%-25s", "Code", "Name", "Specialization", "Availability"));
        doctorView.printBody();

        for (Doctor doctor : doctorList) {
            if (doctor.getSpecialization().toString().equalsIgnoreCase(doctorDTO.getSpecialization().toString())) {
                //Add to list
                result.add(doctor.toString());
            }
        }

        //Set info of list for View and Print
        doctorView.setList(result);
        doctorView.printList();
    }

    //Display main menu
    public void displayMainMenu() {
        doctorView.printMainMenu();
    }

    //Display list of Specialization (help user choose easier)
    public void displaySpecialization() {
        //Create a list to store Specialization
        List<String> result = new ArrayList<>();

        for (Specialization specialization : Specialization.values()) {
            result.add(specialization.toString());
        }

        //Set info of list for View and Print
        doctorView.setList(result);
        doctorView.printList();
    }
}
