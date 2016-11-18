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
public class Lottery {
    //private String gameType;
    private int userNum1;
    private int userNum2;
    private int userNum3;
    private int userNum4;
    private int userNum5;
    
    public Lottery(){
        //gameType = new String();
        userNum1 = 0;
        userNum2 = 0;
        userNum3 = 0;
        userNum4 = 0;
        userNum5 = 0;        
    }

    /*public String getGameType() {
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
