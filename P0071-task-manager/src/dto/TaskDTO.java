/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import constants.TaskType;

/**
 * Created by Tungtpat05 on Jun 21, 2025.
 */
public class TaskDTO {

    private int idInput;
    private String name;
    private TaskType taskTypeID;
    private String date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    //Default constructor
    public TaskDTO() {
    }

    //Parameter constructor
    public TaskDTO( String name, TaskType taskTypeID, String date, double planFrom, double planTo, String assignee, String reviewer) {
        this.name = name;
        this.taskTypeID = taskTypeID;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    //Setter & Getter
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

    public int getIdInput() {
        return idInput;
    }

    public void setIdInput(int idInput) {
        this.idInput = idInput;
    }

}
