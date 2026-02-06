/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package constants;

import utils.CandidateException;

/**
 *
 * @author nguye
 */
public enum CandidateType {
    EXPERIENCE("Experience"),
    FRESHER("Fresher"),
    INTERNSHIP("Internship");
    
    private String stringType;
    
    CandidateType(String stringType) {
        this.stringType = stringType;
    }

    @Override
    public String toString() {
        return stringType;
    }
    
    public static String intToStringType(int input) {
        switch(input) {
            case 0:
                return EXPERIENCE.toString();
            case 1:
                return FRESHER.toString();
            case 2:
                return INTERNSHIP.toString();
            default:
                throw new CandidateException(constants.Message.ERR_CANDIDATE_TYPE);
        }
    }
    
}
