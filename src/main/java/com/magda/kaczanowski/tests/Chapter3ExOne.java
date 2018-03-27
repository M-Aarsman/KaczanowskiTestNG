package com.magda.kaczanowski.tests;

import java.util.ArrayList;
import java.util.List;

public class Chapter3ExOne {
    public static String reverse(String s) {

        if(s == null) {
            throw new IllegalArgumentException("string to reverse can not be null!");
        }

        List<String> tempArray = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i+1));
        }

        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }

        return reversedString.toString();
    }
}
