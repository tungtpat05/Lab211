/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import constants.CandidateType;
import constants.GraduationRank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nguye
 */
public class Validation {

    //Check string input
    public static void validateString(String input) {
        if (input == null || input.isEmpty()) {
            throw new CandidateException(constants.Message.ERR_STRING_INPUT);
        }
    }

    //Check valid birthDate(1900 to 2025) and expInYear(0 to 100)
    public static void validateIntInRange(int inputNumber, int min, int max) {
        if (inputNumber < min || inputNumber > max) {
            throw new CandidateException(String.format(constants.Message.ERR_INT_IN_RANGE, min, max));
        }
    }

    //Special check for candidateType
    public static CandidateType validateCandidateType(int inputNumber) {
        String type = CandidateType.intToStringType(inputNumber);
        return CandidateType.valueOf(type.toUpperCase());
    }

    //Check rank of graduation
    public static GraduationRank validateRankGraduation(int inputNumber) {
        String rank = GraduationRank.intToStringRank(inputNumber);
        return GraduationRank.valueOf(rank.toUpperCase());
    }

    //Check valid phone. Required: is number with minimum 10 characters
    public static void validatePhoneNumber(String inputPhoneNum) {
        //Check format
        Pattern phonePattern = Pattern.compile("\\d{10,}");
        Matcher phoneMatcher = phonePattern.matcher(inputPhoneNum);

        if (!phoneMatcher.matches()) {
            throw new CandidateException(constants.Message.ERR_PHONE_FORMAT);
        }
    }

    //Check email format: abc@def.ghk(.lmn)(.xyz)
    public static void validateEmail(String inputEmail) {

        //Check format
        Pattern emailPattern = Pattern.compile("\\w+@\\w+(\\.\\w+)+");
        Matcher emailMatcher = emailPattern.matcher(inputEmail);

        if (!emailMatcher.matches()) {
            throw new CandidateException(constants.Message.ERR_EMAIL_FORMAT);
        }

    }

}
