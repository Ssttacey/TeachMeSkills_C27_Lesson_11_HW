package com.teachmeskills.lesson11.task2;

/**
 * the class contains a method that, using a loop, allows you to display the shortest and longest word in a string
 */
public class Task_2 {
    public static void theWords(String str) {
        String[] find = str.split(" ");
        String min = find[0];
        String max = find[0];

        for (int i = 0; i < find.length; i++) {
            if (min.length() >= find[i].length()) {
                min = find[i];
            }
        }

        for (int i = 0; i < find.length; i++){
            if (max.length() <= find[i].length()) {
                max = find[i];
            }
        }
        System.out.println(" min = " + min + "; max = " + max);
    }
}