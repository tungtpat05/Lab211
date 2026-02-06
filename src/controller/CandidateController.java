package controller;

import dto.CandidateDTO;
import factory.CandidateFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Candidate;
import utils.CandidateTypeHelper;
import view.CandidateView;

/**
 *
 * @author nguye
 */
public class CandidateController {

    private CandidateView candidateView = new CandidateView();
    private CandidateDTO candidateDTO = new CandidateDTO();
    private ArrayList<Candidate> candidateList = new ArrayList<>();

    //Take user input info from DTO
    public void setInputInfo(CandidateDTO candidateDTO) {
        this.candidateDTO = candidateDTO;
    }

    //Check existedID
    private boolean isExistedID() {
        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateID().equalsIgnoreCase(candidateDTO.getCandidateID())) {
                return true; //Existed
            }
        }
        return false; //Not existed
    }

    //Create new Candidate
    public boolean createCandidate() {

        //Check ID existed or not. If not, add new candidate
        if (!isExistedID()) {
            
            //Create new candidate and add to list
            Candidate candidate  = CandidateFactory.create(candidateDTO);
            candidateList.add(candidate);
            return true;
        }
        //If ID is existed, return false
        return false;
    }

    //Check a part of name && type of candidate existed
    private boolean isCandidateExistByNamePartAndType() {
        //Iterate throught candidate's list
        for (Candidate candidate : candidateList) {

            //Check a part of name && type of candidate existed
            if (candidate.getCandidateType() == candidateDTO.getCandidateType()
                    && candidate.getFullName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    //Search candidate based on a part of name and type
    public void searchCandidate() {
        ArrayList<String> result = new ArrayList<>();

        //Iterate throught candidate's list
        for (Candidate candidate : candidateList) {

            //Check a part of name && type of candidate existed
            if (isCandidateExistByNamePartAndType()) {
                result.add(candidate.toString());
            }
        }

        //Set list info for view and display
        candidateView.setArrayList(result);
        candidateView.printArrayList();
    }
    
    //List all candidate in group with full name
    public void listAllCandidate() {
        Map<Integer, ArrayList<String>> candidateFullnameMap = new HashMap<>();
        
        for (Candidate candidate : candidateList) {
            int type = candidate.getCandidateType();
            candidateFullnameMap.putIfAbsent(type, new ArrayList<>());
            candidateFullnameMap.get(type).add(candidate.getFullName());
        }
        
        System.out.println("Map size: " + candidateFullnameMap.size());
        
        for(Map.Entry<Integer, ArrayList<String>> entry : candidateFullnameMap.entrySet()) {
            int type = entry.getKey();
            String header = CandidateTypeHelper.getTypeName(type);
            candidateView.setHeader(header);
            candidateView.setArrayList(candidateFullnameMap.get(type));
            
            //Print header and list
            candidateView.printGroupHeader();
            candidateView.printArrayList();
            System.out.println("1 lần lặp");
        }
    }
    

    //DisplayMainMenu
    public void displayMainMenu() {
        candidateView.printMainMenu();
    }
}
