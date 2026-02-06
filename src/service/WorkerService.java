/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.SalaryHistory;
import model.Worker;
import utils.GetLocalDate;
import utils.WorkerException;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class WorkerService {

    private List<Worker> workerList = new ArrayList<>();

    //Setter & Getter
    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    //Up Salary
    public void upSalary(String id, double adjustedMoney) {
        for (Worker worker : workerList) {
            if (worker.getId().equalsIgnoreCase(id)) {

                //Up salary
                worker.setSalary(worker.getSalary() + adjustedMoney);

                //Initial new salary history
                SalaryHistory salaryHistory = new SalaryHistory(worker.getSalary(), constants.SalaryStatus.UP, GetLocalDate.getDate());

                //Add to history list
                worker.getSalaryHistoryList().add(salaryHistory);

            }
        }
    }

    //Down Salary
    public void downSalary(String id, double adjustedMoney) {
        for (Worker worker : workerList) {
            if (worker.getId().equalsIgnoreCase(id)) {

                //Down salary
                double amount = worker.getSalary() - adjustedMoney;
                if (amount >= 0) {
                    worker.setSalary(amount);
                    //Initial new salary history
                    SalaryHistory salaryHistory = new SalaryHistory(worker.getSalary(), constants.SalaryStatus.UP, GetLocalDate.getDate());

                    //Add to history list
                    worker.getSalaryHistoryList().add(salaryHistory);

                    break;

                }

                throw new WorkerException(constants.Message.MSG_INVALID_AMOUNT);

            }
        }
    }
}
