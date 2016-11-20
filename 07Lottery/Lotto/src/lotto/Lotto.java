/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

/**
 *
 * @author Carl
 */
public class Lotto {

    private int userNums1, userNums2, userNums3, userNums4, userNums5;

    public Lotto(int userNums1, int userNums2, int userNums3, int userNums4, int userNums5) {
        this.userNums1 = userNums1;
        this.userNums2 = userNums2;
        this.userNums3 = userNums3;
        this.userNums4 = userNums4;
        this.userNums5 = userNums5;
    }

    public int getUserNums1() {
        return userNums1;
    }

    public void setUserNums1(int userNums1) {
        this.userNums1 = userNums1;
    }

    public int getUserNums2() {
        return userNums2;
    }

    public void setUserNums2(int userNums2) {
        this.userNums2 = userNums2;
    }

    public int getUserNums3() {
        return userNums3;
    }

    public void setUserNums3(int userNums3) {
        this.userNums3 = userNums3;
    }

    public int getUserNums4() {
        return userNums4;
    }

    public void setUserNums4(int userNums4) {
        this.userNums4 = userNums4;
    }

    public int getUserNums5() {
        return userNums5;
    }

    public void setUserNums5(int userNums5) {
        this.userNums5 = userNums5;
    }
}
