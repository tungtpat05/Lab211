/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.HashMap;

/**
 *
 * @author nguye
 */
public class StudentView {
    private String header;
    private String body;
    private HashMap<String, Double> classificationInformation;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setMap(HashMap<String, Double> map) {
        this.classificationInformation = map;
    }

    //Ham hien thi student
    public void displayStudent() {
        System.out.println(header);
        System.out.println(body);
    }

    //Ham hien thi Classification
    public void displayClassification() {
        System.out.println("\n-------Classification Info--------");
        for (String key : classificationInformation.keySet()) {
            System.out.printf("%s: %.2f\n", key, classificationInformation.get(key));
        }
    }
}
