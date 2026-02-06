package controller;

import dto.CandidateDTO;
import factory.CandidateCreator;
import factory.CandidateFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Candidate;
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
    
    //Create class name for CandidateFactory with type of DTO
    private String classNameCandidateCreator() {
        return String.format("factory.%sCandidateCreator", candidateDTO.getCandidateType().toString());
    }

    //Create new Candidate
    public boolean createCandidate() {

        //Check ID existed or not. If not, add new candidate
        if (!isExistedID()) {
            
            //Take Candidate Creator class name
            String className = classNameCandidateCreator();

            //Define type of Candidate Creator
            CandidateCreator creator = CandidateFactory.factoryCandidate(className);
            
            //Create new candidate
            Candidate candidate = creator.createCandidate(candidateDTO);
            
            candidateList.add(candidate);
            return true;
        }
        //If ID is existed, return false
        return false;
    }

    //Check candidate that matched input info (a part of name && type)
    private List<String> candidatesMatchInputInfo() {
        //Create list to store Info of Candidate satisfied the requirement
        List<String> result = new ArrayList<>();

        //Iterate throught candidate's list
        for (Candidate candidate : candidateList) {

            //Check a part of name && type of candidate existed
            if (candidate.getCandidateType() == candidateDTO.getCandidateType()
                    && candidate.getFullName().toLowerCase().contains(candidateDTO.getFirstName().toLowerCase())) {
                result.add(candidate.toString());
            }
        }
        return result;
    }

    //Search candidate based on a part of name and type
    public void searchCandidate() {

        //Set list info for view and display
        candidateView.setList(candidatesMatchInputInfo());
        candidateView.printList();
    }

    //List all candidate in group with full name
    public void listAllCandidate() {

        //Create a map for storing candidate in group
        Map<String, ArrayList<String>> candidateFullnameMap = new HashMap<>();

        //Create a new List for storing result (Group name + Name of all candidate within each group)
        List<String> result = new ArrayList<>();

        //Iterate through list of candidate
        for (Candidate candidate : candidateList) {
            String type = candidate.getCandidateType().toString();
            candidateFullnameMap.putIfAbsent(type, new ArrayList<>());
            candidateFullnameMap.get(type).add(candidate.getFullName());
        }

        System.out.println("Map size: " + candidateFullnameMap.size()); //Debug

        for (Map.Entry<String, ArrayList<String>> entry : candidateFullnameMap.entrySet()) {

            String type = entry.getKey();

            //Group Header
            String header = String.format("=======%s Candidate=======", type);

            //Add header to result list
            result.add(header);

            //Get list of FullName
            ArrayList<String> listFullName = candidateFullnameMap.get(type);

            //Iterate through each type
            for (String fullName : listFullName) {
                //Add all Candidate name
                result.add(fullName);
            }
        }

        //Set info of list to View and Print
        candidateView.setList(result);
        candidateView.printList();
    }

}
