/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import utils.CandidateException;

/**
 *
 * @author nguye
 */
public class CandidateFactory {

    public static CandidateCreator factoryCandidate(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            CandidateCreator creator = (CandidateCreator) clazz.getDeclaredConstructor().newInstance();
            return creator;
        } catch (Exception e) {
            throw new CandidateException(constants.Message.ERR_CANDIDATE_TYPE);
        }
    }
}
