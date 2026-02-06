/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import dto.CandidateDTO;
import model.Candidate;
import model.InternshipCandidate;

/**
 * Created by Tungtpat05 on Jun 8, 2025.
 */
public class InternshipCandidateCreator implements CandidateCreator {

    public InternshipCandidateCreator() {
    }

    @Override
    public Candidate createCandidate(CandidateDTO candidateDTO) {
        return new InternshipCandidate(candidateDTO.getCandidateID(), candidateDTO.getFirstName(), candidateDTO.getLastName(), candidateDTO.getBirthDate(),
                candidateDTO.getAddress(), candidateDTO.getPhone(), candidateDTO.getEmail(), candidateDTO.getCandidateType(), candidateDTO.getMajor(), candidateDTO.getSemester(), candidateDTO.getUniversityName());
    }

}
