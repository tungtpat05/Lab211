/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class CandidateView {

    private String header;
    private String body;
    private ArrayList<String> arrayList = new ArrayList<>();

    //Setter & Getter
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
    
    //Print body
    public void printBody() {
        System.out.println(body);
    }

    //Print ArrayList
    public void printArrayList() {
        for (String string : arrayList) {
            System.out.println(string);
        }
    }

    //Print candidate group header
    public void printGroupHeader() {
        System.out.println(String.format("===========%s CANDIDATE============", header));
    }

    //Print main menu
    public void printMainMenu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
    }
}
