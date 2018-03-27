package com.magda.kaczanowski.tests;

class Chapter3ExOne {
    static String reverse(String s) {

        if(s == null) {
            throw new IllegalArgumentException("string to reverse can not be null!");
        }

        StringBuilder reversedString = new StringBuilder(s);
        return reversedString.reverse().toString();
    }
}
