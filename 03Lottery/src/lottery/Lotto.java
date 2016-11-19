/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

/**
 *
 * @author Carl
 */
public class Lotto {
    
    
    /*
    private int[][] userNums = new int[3][5];//C.M 2D array with 3 rows and 5 cols for user input
    private int[] lottoNums = new int[5];//V.V 1D array with 5 indexs
    private int countLine1;//V.V Variable used as a counter to count how many numbers have been guessed in each line. //Line1
    private int countLine2;//V.V Variable used as a counter to count how many numbers have been guessed in each line. //Line2
    private int countLine3;//V.V Variable used as a counter to count how many numbers have been guessed in each line. //Line3

    //C.M set the user input... recieving the 2D array called userNums from the App class. The array contains all the lotto numbers input by the user
    public void setUserNums(int[][] userNums) {
        this.userNums = userNums;
    }

    //V.V Sends the values from LottoApp to Lotto and stores them
    public void setLottoNums(int[] lottoNums) {
        this.lottoNums = lottoNums;
    }

    //V.V This method compares the lottoNums to userNums
    public void compareNums() {
        //V.V Loops to go and compare each index in the 2d array
        int i;
        for (int j = 0; j < 5; j++) {//V.V For loop used to go through the 5 index's
            i = 0;// i = 0 Means we are on line1 out of line3
            if (lottoNums[j] == userNums[i][0] || lottoNums[j] == userNums[i][1] || lottoNums[j] == userNums[i][2] || lottoNums[j] == userNums[i][3] || lottoNums[j] == userNums[i][4]) {
                countLine1++;

            }
        }
        for (int j = 0; j < 5; j++) {//V.V For loop used to go through the 5 index's
            i = 1;//i = 1 Means we are on line2 out of line3
            if (lottoNums[j] == userNums[i][0] || lottoNums[j] == userNums[i][1] || lottoNums[j] == userNums[i][2] || lottoNums[j] == userNums[1][3] || lottoNums[j] == userNums[i][4]) {
                countLine2++;

            }
        }

        for (int j = 0; j < 5; j++) {//V.V For loop used to go through the 5 index's
            i = 2;//i = 2 Means we are on line3 out of line3
            if (lottoNums[j] == userNums[i][0] || lottoNums[j] == userNums[i][1] || lottoNums[j] == userNums[i][2] || lottoNums[j] == userNums[1][3] || lottoNums[j] == userNums[i][4]) {
                countLine3++;

            }

        }
    }

    //V.V Method compute used to generate random numbers
    public void compute() {
        for (int i = 0; i < lottoNums.length; i++) {//R.K Generating 1 to 40  numbers
            lottoNums[i] = (int) Math.floor(1 + Math.random() * 40);//V.V Using Math.random
            for (int j = 0; j < i; j++) {
                //R.K Values with indexes i and j are compared. In case when they are the same, one is rejected
                if (lottoNums[i] == lottoNums[j]) {
                    i--;
                }
            }
        }
    }

    //V.V this get method is used to get the lotto numbers and be able to display them in the main class
    public int[] getLottoNums() {
        return lottoNums;
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
    */
    
    
    //private String gameType;
    private int userNum1;
    private int userNum2;
    private int userNum3;
    private int userNum4;
    private int userNum5;
    
    public Lotto(){
        //gameType = new String();
        userNum1 = 0;
        userNum2 = 0;
        userNum3 = 0;
        userNum4 = 0;
        userNum5 = 0;        
    }
/*
    public String getGameType() {
        return gameType;
    }
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
*/
    public int getUserNum1() {
        return userNum1;
    }
    public void setUserNum1(int userNum1) {
        this.userNum1 = userNum1;
    }
    public int getUserNum2() {
        return userNum2;
    }
    public void setUserNum2(int userNum2) {
        this.userNum2 = userNum2;
    }
    public int getUserNum3() {
        return userNum3;
    }
    public void setUserNum3(int userNum3) {
        this.userNum3 = userNum3;
    }
    public int getUserNum4() {
        return userNum4;
    }
    public void setUserNum4(int userNum4) {
        this.userNum4 = userNum4;
    }
    public int getUserNum5() {
        return userNum5;
    }
    public void setUserNum5(int userNum5) {
        this.userNum5 = userNum5;
    }
    
}
