/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tungtpat05 on Jun 14, 2025.
 */
public class DoctorView {

    private List<String> list = new ArrayList<>();
    private String body;

    //Setter & Getter
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    //Print list
    public void printList() {
        for (String string : list) {
            System.out.println(string);
        }
    }
    
    //Print body
    public void printBody() {
        System.out.println(body);
    }
    
    //Print main menu
    public void printMainMenu() {
        System.out.println("========= Doctor Management ==========\n"
                + "1. Add Doctor\n"
                + "2. Update Doctor\n"
                + "3. Delete Doctor\n"
                + "4. Search Doctor\n"
                + "5. Exit");
    }
}
