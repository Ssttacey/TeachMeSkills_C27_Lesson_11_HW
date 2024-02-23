package com.teachmeskills.lesson11.task1;

import java.util.Arrays;

/**
 * The first method displays the first two blocks of 4 digits on the screen on one line.
 * The second method displays the document number, but replaces blocks of three letters with ***.
 * The third method displays only one letter of the document number in lowercase.
 * The fourth method displays the letters from the document number in uppercase (using the StringBuilder class).
 * The fifth method checks whether the document number contains the sequence "abc" .
 * The sixth method checks whether the document number begins with the sequence 555.
 * The seventh method checks whether the document number ends with the sequence 1a2b.
 */

public class Task_1 {
    public static void showTheNumbers(String doc) {
        String[] docArray = doc.split("-");
        System.out.println(docArray[0] + " " + docArray[2]);
    }

    public static void showWithSecret(String doc) {
        String[] docArray = doc.split("-");
        docArray[1] = "***";
        docArray[3] = "***";
        System.out.println(Arrays.toString(docArray));
    }

    public static void showSmallLetters(String doc) {
        String[] docArray = doc.split("-");
        char[] letters4 = docArray[4].toLowerCase().toCharArray();
        System.out.println(docArray[1].toLowerCase() + "/" + docArray[3].toLowerCase() + "/" + letters4[1] + "/" + letters4[3]);
    }

    public static void showUpLetters(String doc) {
        StringBuilder stringBuilder = new StringBuilder("Letters: ");
        String[] docArray = doc.split("-");
        char[] letters4 = docArray[4].toUpperCase().toCharArray();
        System.out.println(stringBuilder + docArray[1].toUpperCase() + "/" + docArray[3].toUpperCase() + "/" + letters4[1] + "/" + letters4[3]);
    }

    public static void checkSymbols(String doc) {
        if (doc.toLowerCase().contains("abc")) {
            System.out.println(" it's ok, we find letters ");
        } else {
            System.out.println(" There no letters ");
        }
    }

    public static void checkNumbersStart(String doc) {
        if (doc.startsWith("555")) {
            System.out.println("Great! ");
        } else {
            System.out.println(" there is no number we are looking for ");
        }
    }

    public static void checkNumbersEnd(String doc) {
        if (doc.endsWith("1a2b")) {
            System.out.println("Great! ");
        } else {
            System.out.println(" Sad! We didn't find what we were looking for ");
        }
    }

}






