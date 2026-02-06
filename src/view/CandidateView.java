/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class CandidateView {

    private List<String> list = new ArrayList<>();

    //Setter & Getter
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    //Print ArrayList
    public void printList() {
        for (String string : list) {
            System.out.println(string);
        }
    }

}
