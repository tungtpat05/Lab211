/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 * Created by Tungtpat05 on Jun 13, 2025.
 */

//Extends RuntimeException để không cần throws như khi khi extends Exception
public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message); //lưu vào nội bộ của lớp RuntimeException.
    }
}
