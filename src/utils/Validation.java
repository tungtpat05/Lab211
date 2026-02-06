/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public Validation() {
    }

    public static double getDouble(String input, double min, double max) {
        while (true) {
            try {
                //thong bao yeu cau nhap dau vao
                System.out.print(input);
                double number = Double.parseDouble(sc.nextLine());

                //kiem tra so co nam trong khoang gia tri hay khong
                if (number >= min && number <= max) {
                    return number;
                } else {
                    //In ra thong bao loi
                    System.err.println("Please input number more than 0");
                }
            } catch (NumberFormatException e) {
                //Hien thi thong bao loi
                System.err.println("Please input double number");
            }
        }
    }

    //Ham kiem tra dau vao string
    public static String getString(String input) {
        while (true) {
            System.out.print(input);
            String s = sc.nextLine();
            if (!s.isEmpty()) {
                return s;
            } else {
                System.err.println("Please input string");
            }
        }
    }

    //Kiem tra dau vao nhap yes no
    public static String checkYN(String input) {
        System.out.print(input);
        while (true) {
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
                return s;
            } else {
                System.err.println("Please input Y/N: ");
            }
        }
    }
}