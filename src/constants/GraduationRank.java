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
public enum GraduationRank {
    EXCELLENCE("Excellence"),
    GOOD("Good"),
    FAIR("Fair"),
    POOR("Poor");

    private String stringRank;

    GraduationRank(String stringRank) {
        this.stringRank = stringRank;
    }

    @Override
    public String toString() {
        return stringRank;
    }

    public static String intToStringRank(int input) {
        switch (input) {
            case 1:
                return EXCELLENCE.toString();
            case 2:
                return GOOD.toString();
            case 3:
                return FAIR.toString();
            case 4:
                return POOR.toString();
            default:
                throw new CandidateException(constants.Message.ERR_RANK_TYPE);
        }
    }

}
