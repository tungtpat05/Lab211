/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import constants.TaskType;
import dto.TaskDTO;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import view.TaskView;

/**
 * Created by Tungtpat05 on Jun 21, 2025.
 */
public class TaskController {

    private TaskDTO taskDTO = new TaskDTO();
    private TaskView taskView = new TaskView();
    private List<Task> taskList = new ArrayList<>();

    //Get input info
    public void setInputInfo(TaskDTO taskDTO) {
        this.taskDTO = taskDTO;
    }

    //Add a task
    public void addTask() {
        taskList.add(new Task(taskDTO.getName(), taskDTO.getTaskTypeID(), taskDTO.getDate(), taskDTO.getPlanFrom(), taskDTO.getPlanTo(), taskDTO.getAssignee(), taskDTO.getReviewer()));
    }

    //Find Task with ID
    private Task findTaskWithID() {
        for (Task task : taskList) {
            if (task.getId() == taskDTO.getIdInput()) {
                return task;
            }
        }
        return null;
    }

    //Delete a task
    public boolean deleteTask() {
        Task task = findTaskWithID();
        if (task != null) {
            taskList.remove(task);
            return true;
        }
        return false;
    }
    //Display all tasks
    public void displayAllTask() {
        
        //Create a list to store info of each tasks
        List<String> result  = new ArrayList<>();
        
        //Iterate through list of tasks
        for (Task task : taskList) {
            //Add info of each to result list
            result.add(task.toString());
        }
        //Set and print header of each column of report table
        taskView.setBody(String.format("%-25s%-25s%-25s%-25s%-25s%-25s%-25s", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer"));
        taskView.printBody();
        
        //Set and print result list with view
        taskView.setList(result);
        taskView.printList();
    }
    
    //Display type of Task to help user
    public void displayAllTaskType() {
        
        //Create a list to store string name of each task
        List<String> result  = new ArrayList<>();
        
        int count = 1;
        for (TaskType taskType : TaskType.values()) {
            result.add(String.format("%d - %s", count++, taskType.toString()));
        }
        
        //Set and print result list with view
        taskView.setList(result);
        taskView.printList();
    }

}
