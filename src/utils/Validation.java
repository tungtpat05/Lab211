/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import constants.RankGraduation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nguye
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    //Check string input
    public static String getString(String input) {
        while (true) {
            System.out.print(input);
            String s = sc.nextLine();
            if (!s.isEmpty()) {
                return s.trim();
            } else {
                System.out.println("Please input a string!");
            }
        }
    }
    
    //Check valid birthDate(1900 to 2025) and expInYear(0 to 100)
    public static int getInt(String input, int min, int max) {
        while (true) {
            try {
                System.out.print(input);

                //Take user input
                int number = Integer.parseInt(sc.nextLine());

                //Check number in range
                if (min <= number && number <= max) {
                    return number;
                } else {
                    System.err.printf("Please input a number between %d and %d\n", min, max);
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input an integer!");
            }
        }
    }
    
    //Special check for candidateType
    public static int getCandidateType(String input) {
        while (true) {
            try {
                System.out.print(input);

                //Take user input
                int number = Integer.parseInt(sc.nextLine());

                //Check number in range
                if (number == 0 || number == 1 || number == 2) {
                    return number;
                } else {
                    System.out.println("There are only 3 types of candidate: Experience(0) | Fresher(1) | Internship(2)!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input an integer!");
            }
        }
    }

    //Check valid phone. Required: is number with minimum 10 characters
    public static String getPhone(String input) {
        while (true) {
            System.out.print(input);

            //Take user input
            String phone = sc.nextLine();

            //Check format
            Pattern phonePattern = Pattern.compile("\\d{10,}");
            Matcher phoneMatcher = phonePattern.matcher(phone);

            if (phoneMatcher.matches()) {
                return phone;
            } else {
                System.out.println("Please input a number with minimum 10 characters!");
            }
        }
    }

    //Check email format: abc@def.ghk(.lmn)(.xyz)
    public static String getEmail(String input) {
        while (true) {
            System.out.print(input);

            //Take user input
            String email = sc.nextLine();

            //Check format
            Pattern emailPattern = Pattern.compile("\\w+@\\w+(\\.\\w+)+");
            Matcher emailMatcher = emailPattern.matcher(email);

            if (emailMatcher.matches()) {
                return email;
            } else {
                System.out.println("Please input a email with format like ex: annguyen@fpt.edu.vn");
            }
        }
    }
    
    //Check rank of graduation
    public static String getRankGraduation(String input) {
        while (true) {
            System.out.print(input);

            //Take user input
            String rank = sc.nextLine();
            
            try {
                RankGraduation rankGraduation = RankGraduation.valueOf(rank.toUpperCase());
                return rankGraduation + "";
            } catch (Exception e) {
                System.err.println("Invalid rank. Please enter a valid rank (Excellence, Good, Fair, Poor)!");
            }
        }
    }

}
