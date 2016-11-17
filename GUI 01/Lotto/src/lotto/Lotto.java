/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.util.ArrayList;


/*
 * @author Vladislavs Vasiljevs
 * @author Carl Moylan
 * @author Rafal Konarzewski
 */
public class Lotto {

    private int[] lottoNums;//V.V 1D array with 5 indexs
    private int[] lottoPlusOneNums;//V.V 1D array with 5 indexs
    private int[] lottoPlusTwoNums;//V.V 1D array with 5 indexs
    private int countLine1;//V.V Variable used as a counter to count how many numbers have been guessed in each line. //Line1
    private int countLine2;//V.V Variable used as a counter to count how many numbers have been guessed in each line. //Line2
    private int countLine3;//V.V Variable used as a counter to count how many numbers have been guessed in each line. //Line3
    private ArrayList<Line> objectLines = new ArrayList<>();//ArrayList called lines, which stores 5 numbers+ gameType in each index of the ArrayList

    //Default Constructor
    public Lotto() {
        lottoNums = new int[5];
        lottoPlusOneNums = new int[5];
        lottoPlusTwoNums = new int[5];
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;
    }

    //Overloaded Constructor
    public Lotto(int[] lottoNums, int[] lottoPlusOneNums, int[] lottoPlusTwoNums, ArrayList<Line> objectLines) {
        this.lottoNums = lottoNums;
        this.lottoPlusOneNums = lottoPlusOneNums;
        this.lottoPlusTwoNums = lottoPlusTwoNums;
        this.objectLines = objectLines;
    }

    //V.V This method compares, lottonums to userNums1/2
    public void compareNums() {
        for (int i = 0; i < 3; i++) {//V.V Loops 3 times
            for (int j = 0; j < 5; j++) {//V.V loops 5 times, as we need to go through 5 indexs in lottoNums/lottoPlusOneNums/lottoPlusTwoNums
                Line eachLine;
                eachLine = objectLines.get(i);
                //V.V nested if statements used to compare lottoNums/lottoPlusOneNums/lottoPlusTwoNums to userNums1/5 and also to see if any object in the ArrayList contains String value lotto/Plus1/Plus2
                if (eachLine.getGameType().equalsIgnoreCase("Lotto")) {
                    if (lottoNums[j] == eachLine.getUserNums1() || lottoNums[j] == eachLine.getUserNums2() || lottoNums[j] == eachLine.getUserNums3() || lottoNums[j] == eachLine.getUserNums4() || lottoNums[j] == eachLine.getUserNums5()) {
                        countLine1++;
                    }
                }
                if (eachLine.getGameType().equalsIgnoreCase("Plus1")) {
                    if (lottoPlusOneNums[j] == eachLine.getUserNums1() || lottoPlusOneNums[j] == eachLine.getUserNums2() || lottoPlusOneNums[j] == eachLine.getUserNums3() || lottoPlusOneNums[j] == eachLine.getUserNums4() || lottoPlusOneNums[j] == eachLine.getUserNums5()) {
                        countLine2++;
                    }

                }
                if (eachLine.getGameType().equalsIgnoreCase("Plus2")) {
                    if (lottoPlusTwoNums[j] == eachLine.getUserNums1() || lottoPlusTwoNums[j] == eachLine.getUserNums2() || lottoPlusTwoNums[j] == eachLine.getUserNums3() || lottoPlusTwoNums[j] == eachLine.getUserNums4() || lottoPlusTwoNums[j] == eachLine.getUserNums5()) {
                        countLine3++;
                    }
                }
            }
        }
    }

    //V.V Get method getCountLine1 is used to display amount guessed in each line
    public int getCountLine1() {
        return countLine1;
    }

    //V.V Get method getCountLine2 is used to display amount guessed in each line
    public int getCountLine2() {
        return countLine2;
    }

    //V.V Get method getCountLine3 is used to display amount guessed in each line
    public int getCountLine3() {
        return countLine3;
    }
}
