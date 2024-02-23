package com.teachmeskills.lesson11.task3;

/**
 * contains a method that allows you to duplicate characters from a string
 */
public class Task3 {
    public static void write(String word) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            str.append(word.charAt(i)).append(word.charAt(i));
        }
        System.out.println(str);
    }


}

