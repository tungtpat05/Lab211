/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tungtpat05 on Jun 8, 2025.
 */
public class CandidateTypeHelper {

    private static final Map<Integer, String> typeNameMap;

    //Private constructor
    private CandidateTypeHelper() {

    }

    static {
        typeNameMap = new HashMap<>();
        typeNameMap.put(0, "EXPERIENCE");
        typeNameMap.put(1, "FRESHER");
        typeNameMap.put(2, "INTERNSHIP");
    }

    public static String getTypeName(int type) {
        return typeNameMap.getOrDefault(type, "UNKNOWN");
    }
}
