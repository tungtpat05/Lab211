/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.StudentDTO;
import java.util.ArrayList;
import java.util.HashMap;
import model.Student;
import service.ClassificationServices;
import view.StudentView;

/**
 *
 * @author nguye
 */
public class StudentController {

    private StudentDTO inputData = new StudentDTO();
    private ArrayList<Student> listStudent = new ArrayList<>();
    private ClassificationServices classificationServices = new ClassificationServices();
    private StudentView studentView = new StudentView();

    //Add hoc sinh vao lop
    public void addStudent() {
        // Kiem tra sinh vien da ton tai trong lop chua?
        //TODO
        // Neu chua ton tai thi them vao danh sach lop
        listStudent.add(new Student(
                inputData.getName(),
                inputData.getClassName(),
                inputData.getMath(),
                inputData.getPhysic(),
                inputData.getChemistry()));
    }

    //Hien thi hoc sinh
    public void displayStudent() {
        // Hien thi thong tin danh sach lop
        String strHeader = String.format("%20s%20s%20s\n", "Name", "Class Name", "Average");
        studentView.setHeader(strHeader);
        for (int i = 0; i < listStudent.size(); i++) {
            studentView.setBody(listStudent.get(i).toString());
            studentView.displayStudent();
        }
        // Hien thi thong tin thong ke phan loai sinh vien
        // Truyen danh sach sinh vien sang service
        classificationServices.setListStudent(listStudent);
        // Goi function tinh toan phan loai va nhan ket qua tra ve
        HashMap<String, Double> classificationResult = classificationServices.calculateClassification();
        // Truyen ket qua vao view va hien thi thong tin
        studentView.setMap(classificationResult);
        studentView.displayClassification();
    }

    // TODO
    public void setInputData(StudentDTO inputData) {
        this.inputData = inputData;
    }

}