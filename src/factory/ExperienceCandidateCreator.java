/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import dto.CandidateDTO;
import model.Candidate;
import model.ExperienceCandidate;

/**
 * Created by Tungtpat05 on Jun 8, 2025.
 */
public class ExperienceCandidateCreator implements CandidateCreator {

    @Override
    public Candidate createCandidate(CandidateDTO candidateDTO) {
        return new ExperienceCandidate(candidateDTO.getCandidateID(), candidateDTO.getFirstName(), candidateDTO.getLastName(), candidateDTO.getBirthDate(),
                candidateDTO.getAddress(), candidateDTO.getPhone(), candidateDTO.getEmail(), candidateDTO.getExpInYear(), candidateDTO.getProSkill());
    }

}
