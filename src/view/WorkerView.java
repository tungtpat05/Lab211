/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class WorkerView {
    private String header;
    private String body;
    private List<String> list = new ArrayList<>();

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

    
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    
    //Print header
    public void printHeader() {
        System.out.println(header);
    }
    
    //Print body
    public void printBody() {
        System.out.println(body);
    }
    
    //Print list
    public void printList() {
        for (String string : list) {
            System.out.println(string);
        }
    }
    
    
    //Print main menu
    public void printMainMenu() {
        System.out.println("======== Worker Management =========\n"
                + "1. Add Worker\n"
                + "2. Up salary\n"
                + "3. Down salary\n"
                + "4. Display Information salary\n"
                + "5. Exit");
    }
}
