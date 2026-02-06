/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import static constants.Message.MSG_CONFIRMATION_MESSAGE;
import static constants.Message.MSG_NAME_MESSAGE;
import controller.StudentController;
import dto.StudentDTO;

/**
 *
 * @author nguye
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        StudentDTO inputForm = new StudentDTO();
        while (true) {
            inputForm = new StudentDTO();
            // Nhap tu ban phim
            String name = utils.Validation.getString(MSG_NAME_MESSAGE);
            String classes = utils.Validation.getString("Classes: ");
            double math = utils.Validation.getDouble("Math: ", 0, 10);
            double chemistry = utils.Validation.getDouble("Chemistry: ", 0, 10);
            double physic = utils.Validation.getDouble("Physic: ", 0, 10);
            // Gan cac gia tri da nhap vào input form
            inputForm.setName(name);
            inputForm.setClassName(classes);
            inputForm.setMath(math);
            inputForm.setChemistry(chemistry);
            inputForm.setPhysic(physic);
            // Truyen data vao controller qua DTO
            studentController.setInputData(inputForm);
            // Them sinh vien vao lop
            studentController.addStudent();
            // TODO
            if (utils.Validation.checkYN(MSG_CONFIRMATION_MESSAGE).equalsIgnoreCase("n")) {
                break;
            }
        }
        // Hien thi thong tin
        studentController.displayStudent();
    }
}