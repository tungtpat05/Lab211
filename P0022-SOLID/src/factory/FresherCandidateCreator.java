/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import dto.CandidateDTO;
import model.Candidate;
import model.FresherCandidate;

/**
 * Created by Tungtpat05 on Jun 8, 2025.
 */
public class FresherCandidateCreator implements CandidateCreator {

    public FresherCandidateCreator() {
    }

    @Override
    public Candidate createCandidate(CandidateDTO candidateDTO) {
        return new FresherCandidate(candidateDTO.getCandidateID(), candidateDTO.getFirstName(), candidateDTO.getLastName(), candidateDTO.getBirthDate(), candidateDTO.getAddress(),
                candidateDTO.getPhone(), candidateDTO.getEmail(), candidateDTO.getCandidateType(), candidateDTO.getGraduationDate(), candidateDTO.getGraduationRank(), candidateDTO.getGraduationUniversity());
    }

}
