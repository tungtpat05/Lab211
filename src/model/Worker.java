/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import utils.GetLocalDate;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class Worker {
//id, name,age, salary, work location

    private String id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private double adjustedMoney;
    private List<SalaryHistory> salaryHistoryList;

    //Default constructor
    public Worker() {
    }

    //Parameter constructor
    public Worker(String id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        salaryHistoryList = new ArrayList<>();
        this.salaryHistoryList.add(new SalaryHistory(salary, constants.SalaryStatus.DEFAULT, GetLocalDate.getDate()));

    }

    //Setter & Getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public double getAdjustedMoney() {
        return adjustedMoney;
    }

    public void setAdjustedMoney(double adjustedMoney) {
        this.adjustedMoney = adjustedMoney;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public List<SalaryHistory> getSalaryHistoryList() {
        return salaryHistoryList;
    }

    public void setSalaryHistoryList(List<SalaryHistory> salaryHistoryList) {
        this.salaryHistoryList = salaryHistoryList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (SalaryHistory salaryHistory : salaryHistoryList) {
            result.append(String.format("%-25s%-25s%-25d", id, name, age)).append(salaryHistory.toString()).append("\n");
        }
        return result.toString();
    }

}
