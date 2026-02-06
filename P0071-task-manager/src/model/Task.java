/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.TaskType;

/**
 * Created by Tungtpat05 on Jun 21, 2025.
 */
public class Task {
// Task (TaskTypeID, Requirement Name, Date, From, Plan To Plan, Assignee, Expert)

    private static int baseID = 1;

    private int id; //Auto ++1
    private String name;
    private TaskType taskTypeID;
    private String date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    //Default constructor
    public Task() {
    }

    //Parameter constructor
    public Task(String name, TaskType taskTypeID, String date, double planFrom, double planTo, String assignee, String reviewer) {
        this.id = baseID++;
        this.taskTypeID = taskTypeID;
        this.name = name;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    //Setter & Getter
    public int getId() {
        return id;
    }

    public TaskType getTaskTypeID() {
        return taskTypeID;
    }

    public void setTaskTypeID(TaskType taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return String.format("%-25d%-25s%-25s%-25s%-25.2f%-25s%-25s", id, name, taskTypeID.toString(), date, planTo - planFrom, assignee, reviewer);
    }

}
