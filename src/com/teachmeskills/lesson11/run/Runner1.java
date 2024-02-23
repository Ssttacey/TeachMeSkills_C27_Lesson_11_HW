package com.teachmeskills.lesson11.run;

import com.teachmeskills.lesson11.task1.Task_1;

/**
 * the runner class contains a string and calls methods to display information on the screen
 */
public class Runner1 {

    public static void main(String[] args) {
        String doc = "1234-abc-5678-efg-9a6g7 ";

        Task_1.showTheNumbers(doc);
        Task_1.showWithSecret(doc);
        Task_1.showSmallLetters(doc);
        Task_1.showUpLetters(doc);
        Task_1.checkSymbols(doc);
        Task_1.checkNumbersStart(doc);
        Task_1.checkNumbersEnd(doc);

    }

}
