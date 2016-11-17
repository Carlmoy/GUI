/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

/*
 * @author Vladislavs Vasiljevs
 * @author Carl Moylan
 * @author Rafal Konarzewski
 */
public class LottoNums {

    private int[] lottoNums = new int[5];//R.K 1D array with 5 indexs for lottoNums
    private int[] lottoPlusOneNums = new int[5];//V.V 
    private int[] lottoPlusTwoNums = new int[5];


    //Overloaded Constructor
    public LottoNums() {
        lottoNums = new int[5];
        lottoPlusOneNums = new int[5];
        lottoPlusOneNums = new int[5];
    }

    //R.K Method to generate numbers for lottoNums
    public void lottoNums() {
        for (int i = 0; i < lottoNums.length; i++) {//R.K Generating 1 to 40  numbers
            lottoNums[i] = (int) Math.floor(1 + Math.random() * 40);//R.K Using Math.random
            for (int j = 0; j < i; j++) {
                //R.K Values with indexes i and j are compared. In case when they are the same, one is rejected
                if (lottoNums[i] == lottoNums[j]) {
                    i--;
                }
            }
        }
    }

    //V.V Method to generate numbers for lotto Plus One
    public void lottoPlusOneNums() {
        for (int i = 0; i < lottoPlusOneNums.length; i++) {//R.K Generating 1 to 40  numbers
            lottoPlusOneNums[i] = (int) Math.floor(1 + Math.random() * 40);//R.K Using Math.random
            for (int j = 0; j < i; j++) {
                //R.K Values with indexes i and j are compared. In case when they are the same, one is rejected
                if (lottoPlusOneNums[i] == lottoPlusOneNums[j]) {
                    i--;
                }
            }
        }
    }

    //V.V Method to generate numbers for lotto Plus Two
    public void lottoPlusTwoNums() {
        for (int i = 0; i < lottoPlusTwoNums.length; i++) {//R.K Generating 1 to 40  numbers
            lottoPlusTwoNums[i] = (int) Math.floor(1 + Math.random() * 40);//R.K Using Math.random
            for (int j = 0; j < i; j++) {
                //R.K Values with indexes i and j are compared. In case when they are the same, one is rejected
                if (lottoPlusTwoNums[i] == lottoPlusTwoNums[j]) {
                    i--;
                }
            }
        }
    }

    //V.V Get method to display numbers random numbers to main class, will display numbers from lottoNums
    public int[] getLottoNums() {
        return lottoNums;
    }

    //V.V Get method to display numbers random numbers to main class, will display numbers from lottoPlusOneNums
    public int[] getLottoPlusOneNums() {
        return lottoPlusOneNums;
    }

    //V.V Get method to display numbers random numbers to main class, will display numbers from lottoPlusTwoNums
    public int[] getLottoPlusTwoNums() {
        return lottoPlusTwoNums;
    }

}
