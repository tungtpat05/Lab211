/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import model.SalaryHistory;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class WorkerDTO {
//id, name,age, salary, work location

    private String id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private double adjustedMoney;
    private SalaryHistory salaryHistory;

    //Default constructor
    public WorkerDTO() {
    }

    //Parameter constructor
    public WorkerDTO(String id, String name, int age, double salary, String workLocation, SalaryHistory salaryHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.salaryHistory = salaryHistory;
    }

    //Custom Parameter constructor
    public WorkerDTO(String id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
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

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public double getAdjustedMoney() {
        return adjustedMoney;
    }

    public void setAdjustedMoney(double adjustedMoney) {
        this.adjustedMoney = adjustedMoney;
    }

    public SalaryHistory getSalaryHistory() {
        return salaryHistory;
    }

    public void setSalaryHistory(SalaryHistory salaryHistory) {
        this.salaryHistory = salaryHistory;
    }

}
