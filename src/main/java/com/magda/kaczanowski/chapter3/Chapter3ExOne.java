package com.magda.kaczanowski.chapter3;

class Chapter3ExOne {
    static String reverse(String s) {

        if(s == null) {
            throw new IllegalArgumentException("string to reverse can not be null!");
        }

        return s.chars().mapToObj(c -> (char)c).map(c -> Character.toString(c)).reduce("", (s1,s2) -> s2+s1);

        //StringBuilder reversedString = new StringBuilder(s);
        //return reversedString.reverse().toString();
    }
}
