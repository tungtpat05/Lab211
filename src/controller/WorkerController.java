/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Worker;
import service.WorkerService;
import view.WorkerView;
import dto.WorkerDTO;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class WorkerController {

    private List<Worker> workerList = new ArrayList<>();
    private WorkerDTO workerDTO = new WorkerDTO();
    private WorkerService workerService = new WorkerService();
    private WorkerView workerView = new WorkerView();

    //Take input info from DTO
    public void setInputInfo(WorkerDTO workerDTO) {
        this.workerDTO = workerDTO;
    }

    //Check existed ID
    private boolean isExistedID() {
        for (Worker worker : workerList) {
            if (worker.getId().equalsIgnoreCase(workerDTO.getId())) {
                //Found ID
                return true;
            }
        }
        //Not found ID
        return false;
    }

    //Add a new worker
    public boolean addWorker() {
        if (!isExistedID()) {
            //Add a new worker
            workerList.add(new Worker(workerDTO.getId(), workerDTO.getName(), workerDTO.getAge(), workerDTO.getSalary(), workerDTO.getWorkLocation()));
            return true;
        }

        return false;
    }

    //Up salary
    public boolean upSalary() {
        if (isExistedID()) {
            workerService.setWorkerList(workerList);
            workerService.upSalary(workerDTO.getId(), workerDTO.getAdjustedMoney());
            return true;
        }

        return false;
    }

    //Down salary
    public boolean downSalary() {
        if (isExistedID()) {
            workerService.setWorkerList(workerList);
            workerService.downSalary(workerDTO.getId(), workerDTO.getAdjustedMoney());
            return true;
        }

        return false;
    }

    //List salary info
    public void displaySalaryInfo() {

        //Create new list for storing result
        List<String> result = new ArrayList<>();

        //Iterate through list
        for (Worker worker : workerList) {
            result.add(worker.toString());
        }

        //Set info to Wiew and print
        workerView.setBody(String.format("%-25s%-25s%-25s%-25s%-25s%-25s",
                "Code", "Name", "Age", "Salary", "Status", "Date"));
        workerView.printBody();
        workerView.setList(result);
        workerView.printList();
    }

    //Display main menu
    public void displayMainMenu() {
        workerView.printMainMenu();
    }
}
