/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import static constants.StudentType.A;
import static constants.StudentType.B;
import static constants.StudentType.C;
import static constants.StudentType.D;
import java.util.ArrayList;
import java.util.HashMap;
import model.Student;

/**
 *
 * @author nguye
 */
public class ClassificationServices {

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }
    // Danh sach sinh vien trong lop
    private ArrayList<Student> listStudent = new ArrayList<>();

    // Thuc hien tinh toan va phan loai sinh vien

    public HashMap<String, Double> calculateClassification() {
        double countA = 0, countB = 0, countC = 0, countD = 0;
        // Duyet qua toan bo danh sach lop
        for (Student s : listStudent) {
            switch (s.getType()) {
                case A: // Neu sinh vien loai A thi tang bien dem loai A
                    countA++;
                    break;
                case B: // Neu sinh vien loai B thi tang bien dem loai B
                    countB++;
                    break;
                case C: // Neu sinh vien loai C thi tang bien dem loai C
                    countC++;
                    break;
                case D: // Neu sinh vien loai D thi tang bien dem loai D
                    countD++;
                    break;
            }
        }
        // Tao bien hashmap luu ket qua tra ve
        HashMap<String, Double> map = new HashMap<>();
        int size = listStudent.size();
        map.put("A", countA * 100 / size);
        map.put("B", countB * 100 / size);
        map.put("C", countC * 100 / size);
        map.put("D", countD * 100 / size);
        // Tra ve controller
        return map;
    }
}
