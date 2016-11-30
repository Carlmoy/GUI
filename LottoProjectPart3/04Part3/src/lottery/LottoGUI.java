/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Carl
 */
public class LottoGUI extends javax.swing.JFrame {

    private int[][] userNums;
    private int[] lottoNums;
    private int[] lottoPlusOneNums;
    private int[] lottoPlusTwoNums;
    private int countLine1;
    private int countLine2;
    private int countLine3;
    private int[] randomNumbers1;
    private int[] randomNumbers2;
    private int[] randomNumbers3;
    //private int[] savePlus1;
    private int userNum1;
    private int userNum2;
    private int userNum3;
    private int userNum4;
    private int userNum5;
    private int userNum6;
    private int userNum7;

    Save[] savePlus1;

    /**
     * Creates new form LotteryGUI, All setVisible are set to FALSE to not show
     * them on start up, lottoBtn and LottoPlusBtn are set to TRUE to show those
     * two buttons on start up of the application
     */
    public LottoGUI() {
        initComponents();
        lottoBtn.setVisible(true);
        lottoPlusBtn.setVisible(true);
        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);
        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);
        playBtn.setVisible(false);

        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(false);
        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

        autoGenLine1.setVisible(false);
        autoGenLine2.setVisible(false);
        autoGenLine3.setVisible(false);

        save1Btn.setVisible(false);
        view1Btn.setVisible(false);
        reuse1Btn.setVisible(false);
        save2Btn.setVisible(false);
        view2Btn.setVisible(false);
        reuse2Btn.setVisible(false);
        save3Btn.setVisible(false);
        view3Btn.setVisible(false);
        reuse3Btn.setVisible(false);

        savePlus1Btn.setVisible(false);
        viewPlus1Btn.setVisible(false);
        reusePlus1Btn.setVisible(false);
        savePlus2Btn.setVisible(false);
        viewPlus2Btn.setVisible(false);
        reusePlus2Btn.setVisible(false);
        savePlus3Btn.setVisible(false);
        viewPlus3Btn.setVisible(false);
        reusePlus3Btn.setVisible(false);

        saveMsgLbl.setVisible(false);

        lottoNums = new int[5];//1D array size 5;
        lottoPlusOneNums = new int[5];//1D array size 5;
        lottoPlusTwoNums = new int[5];//1D array size 5;
        countLine1 = 0;//Setting default value to countLine1
        countLine2 = 0;//Setting default value to countLine2 
        countLine3 = 0;//Setting default value to countLine3
        userNums = new int[3][5];//2D array size 3 Rows and 5 columns
        randomNumbers1 = new int[5];//Random Numbers used for auto gen
        randomNumbers2 = new int[5];//Random Numbers used for auto gen
        randomNumbers3 = new int[5];//Random Numbers used for auto gen
        //savePlus1 = new Save[5];

    }

    //Method used to generate random numbers, numbers that will be used for auto gen button.
    public void randomNumbers1() {
        for (int i = 0; i < randomNumbers1.length; i++) {//R.K Generating 1 to 40  numbers
            randomNumbers1[i] = (int) Math.floor(1 + Math.random() * 40);//R.K Using Math.random
            for (int j = 0; j < i; j++) {
                //R.K Values with indexes i and j are compared. In case when they are the same, one is rejected
                if (randomNumbers1[i] == randomNumbers1[j]) {
                    i--;
                }
            }
        }
    }
    //Method used to generate random numbers, numbers that will be used for auto gen button.

    public void randomNumbers2() {
        for (int i = 0; i < randomNumbers2.length; i++) {//R.K Generating 1 to 40  numbers
            randomNumbers2[i] = (int) Math.floor(1 + Math.random() * 40);//R.K Using Math.random
            for (int j = 0; j < i; j++) {
                //R.K Values with indexes i and j are compared. In case when they are the same, one is rejected
                if (randomNumbers2[i] == randomNumbers2[j]) {
                    i--;
                }
            }
        }
    }

    //Method used to generate random numbers, numbers that will be used for auto gen button.
    public void randomNumbers3() {
        for (int i = 0; i < randomNumbers3.length; i++) {//R.K Generating 1 to 40  numbers
            randomNumbers3[i] = (int) Math.floor(1 + Math.random() * 40);//R.K Using Math.random
            for (int j = 0; j < i; j++) {
                //R.K Values with indexes i and j are compared. In case when they are the same, one is rejected
                if (randomNumbers3[i] == randomNumbers3[j]) {
                    i--;
                }
            }
        }
    }

    //Random number generator for lottoNums
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

    //Random number generator method for lottoPlusOneNums
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

    //Random number generator method for lottoPlusTwoNums
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

    //Comparing numbers to lottoNums method, used in first phase only
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
            if (lottoNums[j] == userNums[i][0] || lottoNums[j] == userNums[i][1] || lottoNums[j] == userNums[i][2] || lottoNums[j] == userNums[i][3] || lottoNums[j] == userNums[i][4]) {
                countLine2++;

            }
        }
        for (int j = 0; j < 5; j++) {//V.V For loop used to go through the 5 index's
            i = 2;//i = 2 Means we are on line3 out of line3
            if (lottoNums[j] == userNums[i][0] || lottoNums[j] == userNums[i][1] || lottoNums[j] == userNums[i][2] || lottoNums[j] == userNums[i][3] || lottoNums[j] == userNums[i][4]) {
                countLine3++;
            }
        }
    }

    //Comparing numbers to lottoNums method, used for phase2 of the project
    public void compareNums1() {
        //V.V Loops to go and compare each index in the 2d array
        int i;
        for (int j = 0; j < 5; j++) {//V.V For loop used to go through the 5 index's
            i = 0;// i = 0 Means we are on line1 out of line3
            if (lottoNums[j] == userNums[i][0] || lottoNums[j] == userNums[i][1] || lottoNums[j] == userNums[i][2] || lottoNums[j] == userNums[i][3] || lottoNums[j] == userNums[i][4]) {
                countLine1++;

            }
        }
    }

    //Comparing numbers to lottoPlusOneNums method, used for phase2 of the project
    public void compareNumsPlus1() {
        //V.V Loops to go and compare each index in the 2d array
        int i;
        for (int j = 0; j < 5; j++) {//V.V For loop used to go through the 5 index's
            i = 1;// i = 0 Means we are on line1 out of line3
            if (lottoPlusOneNums[j] == userNums[i][0] || lottoPlusOneNums[j] == userNums[i][1] || lottoPlusOneNums[j] == userNums[i][2] || lottoPlusOneNums[j] == userNums[i][3] || lottoPlusOneNums[j] == userNums[i][4]) {
                countLine2++;
            }
        }
    }

    //Comparing numbers to lottoPlusTwoNums method, used for phase2 of the project
    public void compareNumsPlus2() {
        //V.V Loops to go and compare each index in the 2d array
        int i;
        for (int j = 0; j < 5; j++) {//V.V For loop used to go through the 5 index's
            i = 2;// i = 0 Means we are on line1 out of line3
            if (lottoPlusTwoNums[j] == userNums[i][0] || lottoPlusTwoNums[j] == userNums[i][1] || lottoPlusTwoNums[j] == userNums[i][2] || lottoPlusTwoNums[j] == userNums[i][3] || lottoPlusTwoNums[j] == userNums[i][4]) {
                countLine3++;
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrnd = new javax.swing.JPanel();
        playAgainBtn = new javax.swing.JButton();
        answer1JL = new javax.swing.JLabel();
        answer2JL = new javax.swing.JLabel();
        answer3JL = new javax.swing.JLabel();
        lottoBtn = new java.awt.Button();
        lottoPlusBtn = new java.awt.Button();
        instructions2JL = new java.awt.Label();
        instructions1JL = new java.awt.Label();
        userNum1Tf = new javax.swing.JTextField();
        userNum2Tf = new javax.swing.JTextField();
        userNum3Tf = new javax.swing.JTextField();
        userNum4Tf = new javax.swing.JTextField();
        userNum5Tf = new javax.swing.JTextField();
        userNum6Tf = new javax.swing.JTextField();
        userNum7Tf = new javax.swing.JTextField();
        userNum8Tf = new javax.swing.JTextField();
        userNum9Tf = new javax.swing.JTextField();
        userNum10Tf = new javax.swing.JTextField();
        userNum11Tf = new javax.swing.JTextField();
        userNum12Tf = new javax.swing.JTextField();
        userNum13Tf = new javax.swing.JTextField();
        userNum14Tf = new javax.swing.JTextField();
        userNum15Tf = new javax.swing.JTextField();
        playBtn = new java.awt.Button();
        playLottoABtn = new javax.swing.JButton();
        playPlus1ABtn = new javax.swing.JButton();
        playPlus2ABtn = new javax.swing.JButton();
        playLottoBBtn = new javax.swing.JButton();
        playPlus1BBtn = new javax.swing.JButton();
        playPlus2BBtn = new javax.swing.JButton();
        playLottoCBtn = new javax.swing.JButton();
        playPlus1CBtn = new javax.swing.JButton();
        playPlus2CBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        autoGenLine1 = new javax.swing.JButton();
        autoGenLine2 = new javax.swing.JButton();
        autoGenLine3 = new javax.swing.JButton();
        save1Btn = new javax.swing.JButton();
        view1Btn = new javax.swing.JButton();
        reuse1Btn = new javax.swing.JButton();
        save2Btn = new javax.swing.JButton();
        view2Btn = new javax.swing.JButton();
        reuse2Btn = new javax.swing.JButton();
        save3Btn = new javax.swing.JButton();
        view3Btn = new javax.swing.JButton();
        reuse3Btn = new javax.swing.JButton();
        savePlus1Btn = new javax.swing.JButton();
        viewPlus1Btn = new javax.swing.JButton();
        reusePlus1Btn = new javax.swing.JButton();
        savePlus2Btn = new javax.swing.JButton();
        viewPlus2Btn = new javax.swing.JButton();
        reusePlus2Btn = new javax.swing.JButton();
        savePlus3Btn = new javax.swing.JButton();
        viewPlus3Btn = new javax.swing.JButton();
        reusePlus3Btn = new javax.swing.JButton();
        saveMsgLbl = new javax.swing.JLabel();
        ballsPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        setResizable(false);

        backgrnd.setLayout(null);

        playAgainBtn.setBackground(new java.awt.Color(0, 0, 153));
        playAgainBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        playAgainBtn.setForeground(new java.awt.Color(255, 255, 204));
        playAgainBtn.setText("PLAY AGAIN?");
        playAgainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playAgainBtn);
        playAgainBtn.setBounds(210, 190, 370, 80);

        answer1JL.setBackground(new java.awt.Color(255, 255, 204));
        answer1JL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        answer1JL.setForeground(new java.awt.Color(255, 255, 204));
        answer1JL.setText("The total correct numbers on line 1:  ");
        backgrnd.add(answer1JL);
        answer1JL.setBounds(180, 380, 470, 29);

        answer2JL.setBackground(new java.awt.Color(255, 255, 204));
        answer2JL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        answer2JL.setForeground(new java.awt.Color(255, 255, 204));
        answer2JL.setText("The total correct numbers on line 2:  ");
        backgrnd.add(answer2JL);
        answer2JL.setBounds(180, 410, 470, 30);

        answer3JL.setBackground(new java.awt.Color(255, 255, 204));
        answer3JL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        answer3JL.setForeground(new java.awt.Color(255, 255, 204));
        answer3JL.setText("The total correct numbers on line 3:  ");
        backgrnd.add(answer3JL);
        answer3JL.setBounds(180, 440, 480, 30);

        lottoBtn.setBackground(new java.awt.Color(0, 0, 204));
        lottoBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lottoBtn.setForeground(new java.awt.Color(255, 255, 204));
        lottoBtn.setLabel("Click to play LOTTO");
        lottoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lottoBtnActionPerformed(evt);
            }
        });
        backgrnd.add(lottoBtn);
        lottoBtn.setBounds(250, 70, 290, 30);

        lottoPlusBtn.setBackground(new java.awt.Color(0, 0, 204));
        lottoPlusBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lottoPlusBtn.setForeground(new java.awt.Color(255, 255, 204));
        lottoPlusBtn.setLabel("Click to play LOTTO PLUS");
        lottoPlusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lottoPlusBtnActionPerformed(evt);
            }
        });
        backgrnd.add(lottoPlusBtn);
        lottoPlusBtn.setBounds(250, 100, 290, 30);

        instructions2JL.setBackground(new java.awt.Color(255, 255, 204));
        instructions2JL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        instructions2JL.setText("PLEASE ENTER 5 NUMBERS BETWEEN 1 AND 40 ON EACH LINE");
        backgrnd.add(instructions2JL);
        instructions2JL.setBounds(20, 20, 760, 40);

        instructions1JL.setBackground(new java.awt.Color(255, 255, 204));
        instructions1JL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        instructions1JL.setText("ENTER 5 NUMBERS BETWEEN 1 AND 40 AND CHOOSE A GAME");
        backgrnd.add(instructions1JL);
        instructions1JL.setBounds(20, 20, 760, 40);

        userNum1Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum1Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userNum1Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNum1TfActionPerformed(evt);
            }
        });
        backgrnd.add(userNum1Tf);
        userNum1Tf.setBounds(210, 140, 50, 50);

        userNum2Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum2Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum2Tf);
        userNum2Tf.setBounds(290, 140, 50, 50);

        userNum3Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum3Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum3Tf);
        userNum3Tf.setBounds(370, 140, 50, 50);

        userNum4Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum4Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum4Tf);
        userNum4Tf.setBounds(450, 140, 50, 50);

        userNum5Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum5Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum5Tf);
        userNum5Tf.setBounds(530, 140, 50, 50);

        userNum6Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum6Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum6Tf);
        userNum6Tf.setBounds(210, 200, 50, 50);

        userNum7Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum7Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum7Tf);
        userNum7Tf.setBounds(290, 200, 50, 50);

        userNum8Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum8Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum8Tf);
        userNum8Tf.setBounds(370, 200, 50, 50);

        userNum9Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum9Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum9Tf);
        userNum9Tf.setBounds(450, 200, 50, 50);

        userNum10Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum10Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum10Tf);
        userNum10Tf.setBounds(530, 200, 50, 50);

        userNum11Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum11Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum11Tf);
        userNum11Tf.setBounds(210, 260, 50, 50);

        userNum12Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum12Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum12Tf);
        userNum12Tf.setBounds(290, 260, 50, 50);

        userNum13Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum13Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum13Tf);
        userNum13Tf.setBounds(370, 260, 50, 50);

        userNum14Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum14Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum14Tf);
        userNum14Tf.setBounds(450, 260, 50, 50);

        userNum15Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum15Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum15Tf);
        userNum15Tf.setBounds(530, 260, 50, 50);

        playBtn.setActionCommand("Click to play these lines");
        playBtn.setBackground(new java.awt.Color(0, 0, 204));
        playBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playBtn.setForeground(new java.awt.Color(255, 255, 204));
        playBtn.setLabel("When ready... Click to play");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playBtn);
        playBtn.setBounds(260, 320, 290, 30);

        playLottoABtn.setBackground(new java.awt.Color(0, 0, 204));
        playLottoABtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playLottoABtn.setForeground(new java.awt.Color(255, 255, 204));
        playLottoABtn.setText("Play this line as LOTTO");
        playLottoABtn.setMaximumSize(new java.awt.Dimension(241, 25));
        playLottoABtn.setMinimumSize(new java.awt.Dimension(241, 25));
        playLottoABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playLottoABtnActionPerformed(evt);
            }
        });
        backgrnd.add(playLottoABtn);
        playLottoABtn.setBounds(10, 350, 240, 25);

        playPlus1ABtn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus1ABtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus1ABtn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus1ABtn.setText("Play this line as LOTTO PLUS 1");
        playPlus1ABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus1ABtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus1ABtn);
        playPlus1ABtn.setBounds(270, 350, 250, 25);

        playPlus2ABtn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus2ABtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus2ABtn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus2ABtn.setText("Play this line as LOTTO PLUS 2");
        playPlus2ABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus2ABtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus2ABtn);
        playPlus2ABtn.setBounds(540, 350, 250, 25);

        playLottoBBtn.setBackground(new java.awt.Color(0, 0, 204));
        playLottoBBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playLottoBBtn.setForeground(new java.awt.Color(255, 255, 204));
        playLottoBBtn.setText("Play this line as LOTTO");
        playLottoBBtn.setMaximumSize(new java.awt.Dimension(241, 25));
        playLottoBBtn.setMinimumSize(new java.awt.Dimension(241, 25));
        playLottoBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playLottoBBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playLottoBBtn);
        playLottoBBtn.setBounds(10, 350, 240, 25);

        playPlus1BBtn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus1BBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus1BBtn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus1BBtn.setText("Play this line as LOTTO PLUS 1");
        playPlus1BBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus1BBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus1BBtn);
        playPlus1BBtn.setBounds(270, 350, 250, 25);

        playPlus2BBtn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus2BBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus2BBtn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus2BBtn.setText("Play this line as LOTTO PLUS 2");
        playPlus2BBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus2BBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus2BBtn);
        playPlus2BBtn.setBounds(540, 350, 250, 25);

        playLottoCBtn.setBackground(new java.awt.Color(0, 0, 204));
        playLottoCBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playLottoCBtn.setForeground(new java.awt.Color(255, 255, 204));
        playLottoCBtn.setText("Play this line as LOTTO");
        playLottoCBtn.setMaximumSize(new java.awt.Dimension(241, 25));
        playLottoCBtn.setMinimumSize(new java.awt.Dimension(241, 25));
        playLottoCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playLottoCBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playLottoCBtn);
        playLottoCBtn.setBounds(10, 350, 240, 25);

        playPlus1CBtn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus1CBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus1CBtn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus1CBtn.setText("Play this line as LOTTO PLUS 1");
        playPlus1CBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus1CBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus1CBtn);
        playPlus1CBtn.setBounds(270, 350, 250, 25);

        playPlus2CBtn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus2CBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus2CBtn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus2CBtn.setText("Play this line as LOTTO PLUS 2");
        playPlus2CBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus2CBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus2CBtn);
        playPlus2CBtn.setBounds(540, 350, 250, 25);

        exitBtn.setBackground(new java.awt.Color(0, 0, 153));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("CLICK TO EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        backgrnd.add(exitBtn);
        exitBtn.setBounds(610, 410, 180, 50);

        autoGenLine1.setBackground(new java.awt.Color(0, 0, 153));
        autoGenLine1.setForeground(new java.awt.Color(255, 255, 204));
        autoGenLine1.setText("QuickPick");
        autoGenLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoGenLine1ActionPerformed(evt);
            }
        });
        backgrnd.add(autoGenLine1);
        autoGenLine1.setBounds(610, 150, 100, 23);

        autoGenLine2.setBackground(new java.awt.Color(0, 0, 153));
        autoGenLine2.setForeground(new java.awt.Color(255, 255, 255));
        autoGenLine2.setText("QuickPick");
        autoGenLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoGenLine2ActionPerformed(evt);
            }
        });
        backgrnd.add(autoGenLine2);
        autoGenLine2.setBounds(610, 210, 100, 23);

        autoGenLine3.setBackground(new java.awt.Color(0, 0, 153));
        autoGenLine3.setForeground(new java.awt.Color(255, 255, 255));
        autoGenLine3.setText("QuickPick");
        autoGenLine3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoGenLine3ActionPerformed(evt);
            }
        });
        backgrnd.add(autoGenLine3);
        autoGenLine3.setBounds(610, 270, 100, 23);

        save1Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        save1Btn.setText("SAVE");
        save1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1BtnActionPerformed(evt);
            }
        });
        backgrnd.add(save1Btn);
        save1Btn.setBounds(140, 150, 60, 21);

        view1Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        view1Btn.setText("VIEW");
        view1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1BtnActionPerformed(evt);
            }
        });
        backgrnd.add(view1Btn);
        view1Btn.setBounds(70, 150, 70, 21);

        reuse1Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        reuse1Btn.setText("REUSE");
        reuse1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reuse1BtnActionPerformed(evt);
            }
        });
        backgrnd.add(reuse1Btn);
        reuse1Btn.setBounds(0, 150, 70, 20);

        save2Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        save2Btn.setText("SAVE");
        save2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2BtnActionPerformed(evt);
            }
        });
        backgrnd.add(save2Btn);
        save2Btn.setBounds(140, 220, 60, 21);

        view2Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        view2Btn.setText("VIEW");
        view2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2BtnActionPerformed(evt);
            }
        });
        backgrnd.add(view2Btn);
        view2Btn.setBounds(70, 220, 70, 21);

        reuse2Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        reuse2Btn.setText("REUSE");
        reuse2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reuse2BtnActionPerformed(evt);
            }
        });
        backgrnd.add(reuse2Btn);
        reuse2Btn.setBounds(0, 220, 70, 20);

        save3Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        save3Btn.setText("SAVE");
        save3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3BtnActionPerformed(evt);
            }
        });
        backgrnd.add(save3Btn);
        save3Btn.setBounds(140, 280, 60, 21);

        view3Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        view3Btn.setText("VIEW");
        view3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view3BtnActionPerformed(evt);
            }
        });
        backgrnd.add(view3Btn);
        view3Btn.setBounds(70, 280, 70, 21);

        reuse3Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        reuse3Btn.setText("REUSE");
        reuse3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reuse3BtnActionPerformed(evt);
            }
        });
        backgrnd.add(reuse3Btn);
        reuse3Btn.setBounds(0, 280, 70, 20);

        savePlus1Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        savePlus1Btn.setText("SAVE");
        savePlus1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePlus1BtnActionPerformed(evt);
            }
        });
        backgrnd.add(savePlus1Btn);
        savePlus1Btn.setBounds(140, 150, 60, 21);

        viewPlus1Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        viewPlus1Btn.setText("VIEW");
        viewPlus1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPlus1BtnActionPerformed(evt);
            }
        });
        backgrnd.add(viewPlus1Btn);
        viewPlus1Btn.setBounds(70, 150, 70, 21);

        reusePlus1Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        reusePlus1Btn.setText("REUSE");
        reusePlus1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reusePlus1BtnActionPerformed(evt);
            }
        });
        backgrnd.add(reusePlus1Btn);
        reusePlus1Btn.setBounds(0, 150, 70, 20);

        savePlus2Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        savePlus2Btn.setText("SAVE");
        savePlus2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePlus2BtnActionPerformed(evt);
            }
        });
        backgrnd.add(savePlus2Btn);
        savePlus2Btn.setBounds(140, 150, 60, 21);

        viewPlus2Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        viewPlus2Btn.setText("VIEW");
        viewPlus2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPlus2BtnActionPerformed(evt);
            }
        });
        backgrnd.add(viewPlus2Btn);
        viewPlus2Btn.setBounds(70, 150, 70, 21);

        reusePlus2Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        reusePlus2Btn.setText("REUSE");
        reusePlus2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reusePlus2BtnActionPerformed(evt);
            }
        });
        backgrnd.add(reusePlus2Btn);
        reusePlus2Btn.setBounds(0, 150, 70, 20);

        savePlus3Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        savePlus3Btn.setText("SAVE");
        savePlus3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePlus3BtnActionPerformed(evt);
            }
        });
        backgrnd.add(savePlus3Btn);
        savePlus3Btn.setBounds(140, 150, 60, 21);

        viewPlus3Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        viewPlus3Btn.setText("VIEW");
        viewPlus3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPlus3BtnActionPerformed(evt);
            }
        });
        backgrnd.add(viewPlus3Btn);
        viewPlus3Btn.setBounds(70, 150, 70, 21);

        reusePlus3Btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        reusePlus3Btn.setText("REUSE");
        reusePlus3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reusePlus3BtnActionPerformed(evt);
            }
        });
        backgrnd.add(reusePlus3Btn);
        reusePlus3Btn.setBounds(0, 150, 70, 20);

        saveMsgLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saveMsgLbl.setForeground(new java.awt.Color(255, 255, 255));
        backgrnd.add(saveMsgLbl);
        saveMsgLbl.setBounds(50, 80, 690, 40);

        ballsPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottery/01Balls.jpg"))); // NOI18N
        backgrnd.add(ballsPic);
        ballsPic.setBounds(0, 0, 800, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrnd, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrnd, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playPlus2ABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus2ABtnActionPerformed
        //Sets visibility
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(false);

        //Using only 5 textfields, rest are set to FALSE(invisible)
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        //Displays three buttons, lotto,plus1 and plus2
        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(true);
        playLottoBBtn.setVisible(true);
        playPlus2BBtn.setVisible(true);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(true);

        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;
        //Setting/getting values from textfield that is stored in 2D called userNums
        userNums[2][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[2][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[2][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[2][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[2][4] = Integer.parseInt(userNum5Tf.getText());

        compareNumsPlus2();//Calls for x method called compareNumsPlus2

        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);
        //Once the button is clicked, whatever the numbers were in the textfield, are not reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");
    }//GEN-LAST:event_playPlus2ABtnActionPerformed

    private void playPlus1ABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus1ABtnActionPerformed

        //Sets the visibility
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(false);
        //Using only 5 textfields, rest are set to FALSE(invisible)
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        //Displays three buttons, lotto,plus1 and plus2
        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(true);
        playLottoBBtn.setVisible(true);
        playPlus2BBtn.setVisible(true);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(false);
        //Displays three buttons, lotto,plus1 and plus2
        answer1JL.setVisible(false);
        answer2JL.setVisible(true);
        answer3JL.setVisible(false);
        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;

        userNums[1][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[1][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[1][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[1][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[1][4] = Integer.parseInt(userNum5Tf.getText());

        compareNumsPlus1();//Calls for x method called compareNumsPlus1
        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);

        //Once the button is clicked, whatever the numbers were in the textfield, are not reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");
    }//GEN-LAST:event_playPlus1ABtnActionPerformed

    private void playLottoABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playLottoABtnActionPerformed

        //Sets visibility
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(false);
        //Using only 5 textfields, rest are set to FALSE(invisible)
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        //Displays three buttons, lotto,plus1 and plus2
        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(true);
        playLottoBBtn.setVisible(true);
        playPlus2BBtn.setVisible(true);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(true);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;

        userNums[0][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[0][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[0][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[0][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[0][4] = Integer.parseInt(userNum5Tf.getText());
        /*
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        try {
            outFile = new File("petition.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            bw.write(Arrays.deepToString(userNums));
            bw.newLine();

            bw.close();
            JOptionPane.showMessageDialog(null, "Text Successfully written to file");
        } catch (IOException e) {
            System.out.println("Error Writing to file" + e);
        }
         */
        compareNums1();//Calls for x method called compareNumsPlus1
        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);

        //Once the button is clicked, whatever the numbers were in the textfield, are reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");


    }//GEN-LAST:event_playLottoABtnActionPerformed
    //Play again button, will 
    private void playAgainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainBtnActionPerformed
        //Sets visibility for start screen
        lottoBtn.setVisible(true);
        lottoPlusBtn.setVisible(true);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);
        //Play again, buttons are hidden.
        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

        autoGenLine1.setVisible(false);
        autoGenLine2.setVisible(false);
        autoGenLine3.setVisible(false);

        save1Btn.setVisible(false);
        view1Btn.setVisible(false);
        reuse1Btn.setVisible(false);
        save2Btn.setVisible(false);
        view2Btn.setVisible(false);
        reuse2Btn.setVisible(false);
        save3Btn.setVisible(false);
        view3Btn.setVisible(false);
        reuse3Btn.setVisible(false);

        savePlus1Btn.setVisible(false);
        viewPlus1Btn.setVisible(false);
        reusePlus1Btn.setVisible(false);
        savePlus2Btn.setVisible(false);
        viewPlus2Btn.setVisible(false);
        reusePlus2Btn.setVisible(false);
        savePlus3Btn.setVisible(false);
        viewPlus3Btn.setVisible(false);
        reusePlus3Btn.setVisible(false);

        //Sets all textfields to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");
        userNum6Tf.setText("");
        userNum7Tf.setText("");
        userNum8Tf.setText("");
        userNum9Tf.setText("");
        userNum10Tf.setText("");
        userNum11Tf.setText("");
        userNum12Tf.setText("");
        userNum13Tf.setText("");
        userNum14Tf.setText("");
        userNum15Tf.setText("");

        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;

    }//GEN-LAST:event_playAgainBtnActionPerformed

    private void lottoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lottoBtnActionPerformed
        // TODO add your handling code here:
        //Hiding buttons
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(true);
        //Using only 15 textfields
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(true);
        userNum7Tf.setVisible(true);
        userNum8Tf.setVisible(true);
        userNum9Tf.setVisible(true);
        userNum10Tf.setVisible(true);
        userNum11Tf.setVisible(true);
        userNum12Tf.setVisible(true);
        userNum13Tf.setVisible(true);
        userNum14Tf.setVisible(true);
        userNum15Tf.setVisible(true);

        playBtn.setVisible(true);

        autoGenLine1.setVisible(true);
        autoGenLine2.setVisible(true);
        autoGenLine3.setVisible(true);

        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

        save1Btn.setVisible(true);
        view1Btn.setVisible(true);
        reuse1Btn.setVisible(true);
        save2Btn.setVisible(true);
        view2Btn.setVisible(true);
        reuse2Btn.setVisible(true);
        save3Btn.setVisible(true);
        view3Btn.setVisible(true);
        reuse3Btn.setVisible(true);

        lottoNums();

        System.out.println(Arrays.toString(lottoNums));


    }//GEN-LAST:event_lottoBtnActionPerformed

    private void lottoPlusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lottoPlusBtnActionPerformed
        // TODO add your handling code here:
        //Hiding buttons
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(false);
        //Using only 5 textfields, rest are set to FALSE(invisible)
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        playPlus1ABtn.setVisible(true);
        playLottoABtn.setVisible(true);
        playPlus2ABtn.setVisible(true);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(false);

        autoGenLine1.setVisible(true);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);
        //Calls the random numbers gen, methods
        lottoNums();
        lottoPlusOneNums();
        lottoPlusTwoNums();

        //Displays the random numbers in console.
        System.out.print("Lotto: ");
        System.out.println(Arrays.toString(lottoNums));
        System.out.print("LottoPlusOne: ");
        System.out.println(Arrays.toString(lottoPlusOneNums));
        System.out.print("LottoPlusTwo: ");
        System.out.println(Arrays.toString(lottoPlusTwoNums));


    }//GEN-LAST:event_lottoPlusBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        //Sets visibility for start of game
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);

        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(true);

        answer1JL.setVisible(true);
        answer2JL.setVisible(true);
        answer3JL.setVisible(true);

        autoGenLine1.setVisible(false);
        autoGenLine2.setVisible(false);
        autoGenLine3.setVisible(false);

        save1Btn.setVisible(false);
        view1Btn.setVisible(false);
        reuse1Btn.setVisible(false);
        save2Btn.setVisible(false);
        view2Btn.setVisible(false);
        reuse2Btn.setVisible(false);
        save3Btn.setVisible(false);
        view3Btn.setVisible(false);
        reuse3Btn.setVisible(false);

        //Every textfield adds x value to the 2D array
        userNums[0][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[0][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[0][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[0][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[0][4] = Integer.parseInt(userNum5Tf.getText());
        userNums[1][0] = Integer.parseInt(userNum6Tf.getText());
        userNums[1][1] = Integer.parseInt(userNum7Tf.getText());
        userNums[1][2] = Integer.parseInt(userNum8Tf.getText());
        userNums[1][3] = Integer.parseInt(userNum9Tf.getText());
        userNums[1][4] = Integer.parseInt(userNum10Tf.getText());
        userNums[2][0] = Integer.parseInt(userNum11Tf.getText());
        userNums[2][1] = Integer.parseInt(userNum12Tf.getText());
        userNums[2][2] = Integer.parseInt(userNum13Tf.getText());
        userNums[2][3] = Integer.parseInt(userNum14Tf.getText());
        userNums[2][4] = Integer.parseInt(userNum15Tf.getText());

        compareNums();//Calls the compareNums method
        //Displays amount of numbers guessed.
        answer1JL.setText("On line 1 you correctly guessed: " + countLine1);
        answer2JL.setText("On line 2 you correctly guessed: " + countLine2);
        answer3JL.setText("On line 3 you correctly guessed: " + countLine3);
    }//GEN-LAST:event_playBtnActionPerformed

    private void userNum1TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNum1TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNum1TfActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // Closes the GUI
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void playLottoBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playLottoBBtnActionPerformed
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(false);
        //Using only 5 textfields, rest are set to FALSE(invisible)
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        //Displays three buttons, lotto,plus1 and plus2
        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(true);
        playLottoCBtn.setVisible(true);
        playPlus2CBtn.setVisible(true);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(true);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;

        userNums[0][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[0][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[0][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[0][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[0][4] = Integer.parseInt(userNum5Tf.getText());

 /*       File outFile;
        FileWriter fw;
        BufferedWriter bw;

        try {
            outFile = new File("petition.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            bw.write(Arrays.deepToString(userNums));
            bw.newLine();

            bw.close();
            JOptionPane.showMessageDialog(null, "Text Successfully written to file");
        } catch (IOException e) {
            System.out.println("Error Writing to file" + e);
        }
*/
        compareNums1();//Calls for x method called compareNumsPlus1
        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);

        //Once the button is clicked, whatever the numbers were in the textfield, are not reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");


    }//GEN-LAST:event_playLottoBBtnActionPerformed

    private void playPlus1BBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus1BBtnActionPerformed
        //Sets the visibility
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(false);
        //Using only 5 textfields, rest are set to FALSE(invisible)
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        //Displays three buttons, lotto,plus1 and plus2
        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(true);
        playLottoCBtn.setVisible(true);
        playPlus2CBtn.setVisible(true);

        playAgainBtn.setVisible(false);
        //Displays three buttons, lotto,plus1 and plus2
        answer1JL.setVisible(false);
        answer2JL.setVisible(true);
        answer3JL.setVisible(false);
        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;

        userNums[1][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[1][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[1][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[1][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[1][4] = Integer.parseInt(userNum5Tf.getText());

        compareNumsPlus1();//Calls for x method called compareNumsPlus1
        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);

        //Once the button is clicked, whatever the numbers were in the textfield, are not reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");
    }//GEN-LAST:event_playPlus1BBtnActionPerformed

    private void playPlus2BBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus2BBtnActionPerformed
        //Sets visibility
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(false);

        //Using only 5 textfields, rest are set to FALSE(invisible)
        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        //Displays three buttons, lotto,plus1 and plus2
        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(true);
        playLottoCBtn.setVisible(true);
        playPlus2CBtn.setVisible(true);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(true);

        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;
        //Setting/getting values from textfield that is stored in 2D called userNums
        userNums[2][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[2][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[2][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[2][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[2][4] = Integer.parseInt(userNum5Tf.getText());

        compareNumsPlus2();//Calls for x method called compareNumsPlus2

        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);
        //Once the button is clicked, whatever the numbers were in the textfield, are not reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");
    }//GEN-LAST:event_playPlus2BBtnActionPerformed

    private void playLottoCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playLottoCBtnActionPerformed
        //Sets visibility for start of game
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);

        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(true);

        answer1JL.setVisible(true);
        answer2JL.setVisible(true);
        answer3JL.setVisible(true);

        answer1JL.setVisible(true);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;

        userNums[0][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[0][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[0][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[0][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[0][4] = Integer.parseInt(userNum5Tf.getText());

 /*       File outFile;
        FileWriter fw;
        BufferedWriter bw;

        try {
            outFile = new File("petition.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            bw.write(Arrays.deepToString(userNums));
            bw.newLine();

            bw.close();
            JOptionPane.showMessageDialog(null, "Text Successfully written to file");
        } catch (IOException e) {
            System.out.println("Error Writing to file" + e);
        }
*/
        compareNums1();//Calls for x method called compareNumsPlus1
        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);

        //Once the button is clicked, whatever the numbers were in the textfield, are reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");


    }//GEN-LAST:event_playLottoCBtnActionPerformed

    private void playPlus1CBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus1CBtnActionPerformed
        //Sets visibility for start of game
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);

        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(true);

        //Displays three labels, lotto,plus1 and plus2
        answer1JL.setVisible(false);
        answer2JL.setVisible(true);
        answer3JL.setVisible(false);
        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;

        userNums[1][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[1][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[1][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[1][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[1][4] = Integer.parseInt(userNum5Tf.getText());

        compareNumsPlus1();//Calls for x method called compareNumsPlus1
        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);

        //Once the button is clicked, whatever the numbers were in the textfield, are not reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");
    }//GEN-LAST:event_playPlus1CBtnActionPerformed

    private void playPlus2CBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus2CBtnActionPerformed
        //Sets visibility for start of game
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);

        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);
        userNum6Tf.setVisible(false);
        userNum7Tf.setVisible(false);
        userNum8Tf.setVisible(false);
        userNum9Tf.setVisible(false);
        userNum10Tf.setVisible(false);
        userNum11Tf.setVisible(false);
        userNum12Tf.setVisible(false);
        userNum13Tf.setVisible(false);
        userNum14Tf.setVisible(false);
        userNum15Tf.setVisible(false);

        playBtn.setVisible(false);

        playPlus1ABtn.setVisible(false);
        playLottoABtn.setVisible(false);
        playPlus2ABtn.setVisible(false);

        playPlus1BBtn.setVisible(false);
        playLottoBBtn.setVisible(false);
        playPlus2BBtn.setVisible(false);

        playPlus1CBtn.setVisible(false);
        playLottoCBtn.setVisible(false);
        playPlus2CBtn.setVisible(false);

        playAgainBtn.setVisible(true);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(true);

        //Resets the numbers of guessed numbers, each time the button is clicked.
        countLine1 = 0;
        countLine2 = 0;
        countLine3 = 0;
        //Setting/getting values from textfield that is stored in 2D called userNums
        userNums[2][0] = Integer.parseInt(userNum1Tf.getText());
        userNums[2][1] = Integer.parseInt(userNum2Tf.getText());
        userNums[2][2] = Integer.parseInt(userNum3Tf.getText());
        userNums[2][3] = Integer.parseInt(userNum4Tf.getText());
        userNums[2][4] = Integer.parseInt(userNum5Tf.getText());

        compareNumsPlus2();//Calls for x method called compareNumsPlus2

        //Prints/Displays the number of guessed numbers, in each line.
        answer1JL.setText("You correctly guessed: " + countLine1);
        answer2JL.setText("You correctly guessed: " + countLine2);
        answer3JL.setText("You correctly guessed: " + countLine3);
        //Once the button is clicked, whatever the numbers were in the textfield, are not reset to blank
        userNum1Tf.setText("");
        userNum2Tf.setText("");
        userNum3Tf.setText("");
        userNum4Tf.setText("");
        userNum5Tf.setText("");
    }//GEN-LAST:event_playPlus2CBtnActionPerformed

    private void autoGenLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoGenLine1ActionPerformed
        // TODO add your handling code here:

        randomNumbers1();//Calling randomNumbers1 method
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder e = new StringBuilder();

        a.append(randomNumbers1[0]);
        b.append(randomNumbers1[1]);
        c.append(randomNumbers1[2]);
        d.append(randomNumbers1[3]);
        e.append(randomNumbers1[4]);

        userNum1Tf.setText(a.toString());
        userNum2Tf.setText(b.toString());
        userNum3Tf.setText(c.toString());
        userNum4Tf.setText(d.toString());
        userNum5Tf.setText(e.toString());


    }//GEN-LAST:event_autoGenLine1ActionPerformed

    private void autoGenLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoGenLine2ActionPerformed
        // TODO add your handling code here:
        randomNumbers2();//Calling randomNumbers2 method
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder e = new StringBuilder();

        a.append(randomNumbers2[0]);
        b.append(randomNumbers2[1]);
        c.append(randomNumbers2[2]);
        d.append(randomNumbers2[3]);
        e.append(randomNumbers2[4]);

        userNum6Tf.setText(a.toString());
        userNum7Tf.setText(b.toString());
        userNum8Tf.setText(c.toString());
        userNum9Tf.setText(d.toString());
        userNum10Tf.setText(e.toString());
    }//GEN-LAST:event_autoGenLine2ActionPerformed

    private void autoGenLine3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoGenLine3ActionPerformed
        // TODO add your handling code here:
        randomNumbers3();//Calling randomNumbers3 method
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder e = new StringBuilder();

        a.append(randomNumbers3[0]);
        b.append(randomNumbers3[1]);
        c.append(randomNumbers3[2]);
        d.append(randomNumbers3[3]);
        e.append(randomNumbers3[4]);

        userNum11Tf.setText(a.toString());
        userNum12Tf.setText(b.toString());
        userNum13Tf.setText(c.toString());
        userNum14Tf.setText(d.toString());
        userNum15Tf.setText(e.toString());
    }//GEN-LAST:event_autoGenLine3ActionPerformed

    private void savePlus1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePlus1BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        userNum1 = Integer.parseInt(userNum1Tf.getText());
        userNum2 = Integer.parseInt(userNum2Tf.getText());
        userNum3 = Integer.parseInt(userNum3Tf.getText());
        userNum4 = Integer.parseInt(userNum4Tf.getText());
        userNum5 = Integer.parseInt(userNum5Tf.getText());

        Save a = new Save();

        a.setUserNum1(userNum1);
        a.setUserNum2(userNum2);
        a.setUserNum3(userNum3);
        a.setUserNum4(userNum4);
        a.setUserNum5(userNum5);

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("outputPlus1.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(a);
            saveMsgLbl.setText("Numbers on line 1 have been saved");
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_savePlus1BtnActionPerformed

    private void viewPlus1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPlus1BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("outputPlus2.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();
            
            saveMsgLbl.setText("Numbers saved are:- " + x.getUserNum1() + ", " + x.getUserNum2() + ", " + x.getUserNum3() + ", " + x.getUserNum4() + " and " + x.getUserNum5());

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_viewPlus1BtnActionPerformed

    private void reusePlus1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reusePlus1BtnActionPerformed
        // TODO add your handling code here:
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("outputPlus1.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();

            userNum1 = x.getUserNum1();
            userNum2 = x.getUserNum2();
            userNum3 = x.getUserNum3();
            userNum4 = x.getUserNum4();
            userNum5 = x.getUserNum5();

            userNum1Tf.setText(String.valueOf(userNum1));
            userNum2Tf.setText(String.valueOf(userNum2));
            userNum3Tf.setText(String.valueOf(userNum3));
            userNum4Tf.setText(String.valueOf(userNum4));
            userNum5Tf.setText(String.valueOf(userNum5));

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_reusePlus1BtnActionPerformed

    private void reuse1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reuse1BtnActionPerformed
        // TODO add your handling code here:
        File inFile1;
        FileInputStream fStream1;
        ObjectInputStream oStream1;

        try {
            inFile1 = new File("output1.data");
            fStream1 = new FileInputStream(inFile1);
            oStream1 = new ObjectInputStream(fStream1);

            Save x;
            x = (Save) oStream1.readObject();

            userNum1 = x.getUserNum1();
            userNum2 = x.getUserNum2();
            userNum3 = x.getUserNum3();
            userNum4 = x.getUserNum4();
            userNum5 = x.getUserNum5();

            userNum1Tf.setText(String.valueOf(userNum1));
            userNum2Tf.setText(String.valueOf(userNum2));
            userNum3Tf.setText(String.valueOf(userNum3));
            userNum4Tf.setText(String.valueOf(userNum4));
            userNum5Tf.setText(String.valueOf(userNum5));

            oStream1.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_reuse1BtnActionPerformed

    private void view1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        File inFile1;
        FileInputStream fStream1;
        ObjectInputStream oStream1;

        try {
            inFile1 = new File("output1.data");
            fStream1 = new FileInputStream(inFile1);
            oStream1 = new ObjectInputStream(fStream1);

            Save x;
            x = (Save) oStream1.readObject();
            
            saveMsgLbl.setText("Numbers saved for line 1 are:- " + x.getUserNum1() + ", " + x.getUserNum2() + ", " + x.getUserNum3() + ", " + x.getUserNum4() + " and " + x.getUserNum5());

            oStream1.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_view1BtnActionPerformed

    private void save1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);

        userNum1 = Integer.parseInt(userNum1Tf.getText());
        userNum2 = Integer.parseInt(userNum2Tf.getText());
        userNum3 = Integer.parseInt(userNum3Tf.getText());
        userNum4 = Integer.parseInt(userNum4Tf.getText());
        userNum5 = Integer.parseInt(userNum5Tf.getText());

        Save a = new Save();

        a.setUserNum1(userNum1);
        a.setUserNum2(userNum2);
        a.setUserNum3(userNum3);
        a.setUserNum4(userNum4);
        a.setUserNum5(userNum5);

        File outFile1;
        FileOutputStream fStream1;
        ObjectOutputStream oStream1;

        try {
            outFile1 = new File("output1.data");
            fStream1 = new FileOutputStream(outFile1);
            oStream1 = new ObjectOutputStream(fStream1);

            oStream1.writeObject(a);
           
            saveMsgLbl.setText("Numbers on line 1 have been saved");
            oStream1.close();
        } catch (IOException e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_save1BtnActionPerformed

    private void save2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);

        userNum1 = Integer.parseInt(userNum1Tf.getText());
        userNum2 = Integer.parseInt(userNum2Tf.getText());
        userNum3 = Integer.parseInt(userNum3Tf.getText());
        userNum4 = Integer.parseInt(userNum4Tf.getText());
        userNum5 = Integer.parseInt(userNum5Tf.getText());

        Save b = new Save();

        b.setUserNum1(userNum6);
        b.setUserNum2(userNum7);
        b.setUserNum3(userNum3);
        b.setUserNum4(userNum4);
        b.setUserNum5(userNum5);

        File outFile2;
        FileOutputStream fStream2;
        ObjectOutputStream oStream2;

        try {
            outFile2 = new File("output2.data");
            fStream2 = new FileOutputStream(outFile2);
            oStream2 = new ObjectOutputStream(fStream2);

            oStream2.writeObject(b);
            //JOptionPane.showMessageDialog(null, "File written sucessfully");
            saveMsgLbl.setText("Numbers on line 2 have been saved");
            oStream2.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_save2BtnActionPerformed

    private void view2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2BtnActionPerformed
        // TODO add your handling code here:
        //saveMsgLbl.setText("");
        saveMsgLbl.setVisible(true);
        File inFile2;
        FileInputStream fStream2;
        ObjectInputStream oStream2;

        try {
            inFile2 = new File("output2.data");
            fStream2 = new FileInputStream(inFile2);
            oStream2 = new ObjectInputStream(fStream2);

            Save b;
            b = (Save) oStream2.readObject();
            
            saveMsgLbl.setText("Numbers saved for line 2 are:- " + b.getUserNum6() + ", " + b.getUserNum7() + ", " + b.getUserNum3() + ", " + b.getUserNum4() + " and " + b.getUserNum5());

            oStream2.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_view2BtnActionPerformed

    private void reuse2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reuse2BtnActionPerformed
        // TODO add your handling code here:
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("output2.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save b;
            b = (Save) oStream.readObject();

            userNum1 = b.getUserNum1();
            userNum2 = b.getUserNum2();
            userNum3 = b.getUserNum3();
            userNum4 = b.getUserNum4();
            userNum5 = b.getUserNum5();

            userNum1Tf.setText(String.valueOf(userNum1));
            userNum2Tf.setText(String.valueOf(userNum2));
            userNum3Tf.setText(String.valueOf(userNum3));
            userNum4Tf.setText(String.valueOf(userNum4));
            userNum5Tf.setText(String.valueOf(userNum5));

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_reuse2BtnActionPerformed

    private void save3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);

        userNum1 = Integer.parseInt(userNum1Tf.getText());
        userNum2 = Integer.parseInt(userNum2Tf.getText());
        userNum3 = Integer.parseInt(userNum3Tf.getText());
        userNum4 = Integer.parseInt(userNum4Tf.getText());
        userNum5 = Integer.parseInt(userNum5Tf.getText());

        Save a = new Save();

        a.setUserNum1(userNum1);
        a.setUserNum2(userNum2);
        a.setUserNum3(userNum3);
        a.setUserNum4(userNum4);
        a.setUserNum5(userNum5);

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("output3.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(a);
            //JOptionPane.showMessageDialog(null, "File written sucessfully");
            saveMsgLbl.setText("Numbers on line 3 have been saved");
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_save3BtnActionPerformed

    private void view3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view3BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("output3.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();
            
            saveMsgLbl.setText("Numbers saved for line 3 are:- " + x.getUserNum1() + ", " + x.getUserNum2() + ", " + x.getUserNum3() + ", " + x.getUserNum4() + " and " + x.getUserNum5());

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_view3BtnActionPerformed

    private void reuse3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reuse3BtnActionPerformed
        // TODO add your handling code here:
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("output3.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();

            userNum1 = x.getUserNum1();
            userNum2 = x.getUserNum2();
            userNum3 = x.getUserNum3();
            userNum4 = x.getUserNum4();
            userNum5 = x.getUserNum5();

            userNum1Tf.setText(String.valueOf(userNum1));
            userNum2Tf.setText(String.valueOf(userNum2));
            userNum3Tf.setText(String.valueOf(userNum3));
            userNum4Tf.setText(String.valueOf(userNum4));
            userNum5Tf.setText(String.valueOf(userNum5));

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_reuse3BtnActionPerformed

    private void savePlus2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePlus2BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        userNum1 = Integer.parseInt(userNum1Tf.getText());
        userNum2 = Integer.parseInt(userNum2Tf.getText());
        userNum3 = Integer.parseInt(userNum3Tf.getText());
        userNum4 = Integer.parseInt(userNum4Tf.getText());
        userNum5 = Integer.parseInt(userNum5Tf.getText());

        Save a = new Save();

        a.setUserNum1(userNum1);
        a.setUserNum2(userNum2);
        a.setUserNum3(userNum3);
        a.setUserNum4(userNum4);
        a.setUserNum5(userNum5);

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("outputPlus2.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(a);
            saveMsgLbl.setText("Numbers on line 2 have been saved");
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_savePlus2BtnActionPerformed

    private void viewPlus2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPlus2BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("outputPlus2.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();
            
            saveMsgLbl.setText("Numbers saved are:- " + x.getUserNum1() + ", " + x.getUserNum2() + ", " + x.getUserNum3() + ", " + x.getUserNum4() + " and " + x.getUserNum5());

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_viewPlus2BtnActionPerformed

    private void reusePlus2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reusePlus2BtnActionPerformed
        // TODO add your handling code here:
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("outputPlus2.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();

            userNum1 = x.getUserNum1();
            userNum2 = x.getUserNum2();
            userNum3 = x.getUserNum3();
            userNum4 = x.getUserNum4();
            userNum5 = x.getUserNum5();

            userNum1Tf.setText(String.valueOf(userNum1));
            userNum2Tf.setText(String.valueOf(userNum2));
            userNum3Tf.setText(String.valueOf(userNum3));
            userNum4Tf.setText(String.valueOf(userNum4));
            userNum5Tf.setText(String.valueOf(userNum5));

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_reusePlus2BtnActionPerformed

    private void savePlus3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePlus3BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        userNum1 = Integer.parseInt(userNum1Tf.getText());
        userNum2 = Integer.parseInt(userNum2Tf.getText());
        userNum3 = Integer.parseInt(userNum3Tf.getText());
        userNum4 = Integer.parseInt(userNum4Tf.getText());
        userNum5 = Integer.parseInt(userNum5Tf.getText());

        Save a = new Save();

        a.setUserNum1(userNum1);
        a.setUserNum2(userNum2);
        a.setUserNum3(userNum3);
        a.setUserNum4(userNum4);
        a.setUserNum5(userNum5);

        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            outFile = new File("outputPlus3.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(a);
            saveMsgLbl.setText("Numbers on line 3 have been saved");
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_savePlus3BtnActionPerformed

    private void viewPlus3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPlus3BtnActionPerformed
        // TODO add your handling code here:
        saveMsgLbl.setVisible(true);
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("outputPlus3.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();
            
            saveMsgLbl.setText("Numbers saved are:- " + x.getUserNum1() + ", " + x.getUserNum2() + ", " + x.getUserNum3() + ", " + x.getUserNum4() + " and " + x.getUserNum5());

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_viewPlus3BtnActionPerformed

    private void reusePlus3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reusePlus3BtnActionPerformed
        // TODO add your handling code here:
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            inFile = new File("outputPlus3.data");
            fStream = new FileInputStream(inFile);
            oStream = new ObjectInputStream(fStream);

            Save x;
            x = (Save) oStream.readObject();

            userNum1 = x.getUserNum1();
            userNum2 = x.getUserNum2();
            userNum3 = x.getUserNum3();
            userNum4 = x.getUserNum4();
            userNum5 = x.getUserNum5();

            userNum1Tf.setText(String.valueOf(userNum1));
            userNum2Tf.setText(String.valueOf(userNum2));
            userNum3Tf.setText(String.valueOf(userNum3));
            userNum4Tf.setText(String.valueOf(userNum4));
            userNum5Tf.setText(String.valueOf(userNum5));

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_reusePlus3BtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LottoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LottoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answer1JL;
    private javax.swing.JLabel answer2JL;
    private javax.swing.JLabel answer3JL;
    private javax.swing.JButton autoGenLine1;
    private javax.swing.JButton autoGenLine2;
    private javax.swing.JButton autoGenLine3;
    private javax.swing.JPanel backgrnd;
    private javax.swing.JLabel ballsPic;
    private javax.swing.JButton exitBtn;
    private java.awt.Label instructions1JL;
    private java.awt.Label instructions2JL;
    private java.awt.Button lottoBtn;
    private java.awt.Button lottoPlusBtn;
    private javax.swing.JButton playAgainBtn;
    private java.awt.Button playBtn;
    private javax.swing.JButton playLottoABtn;
    private javax.swing.JButton playLottoBBtn;
    private javax.swing.JButton playLottoCBtn;
    private javax.swing.JButton playPlus1ABtn;
    private javax.swing.JButton playPlus1BBtn;
    private javax.swing.JButton playPlus1CBtn;
    private javax.swing.JButton playPlus2ABtn;
    private javax.swing.JButton playPlus2BBtn;
    private javax.swing.JButton playPlus2CBtn;
    private javax.swing.JButton reuse1Btn;
    private javax.swing.JButton reuse2Btn;
    private javax.swing.JButton reuse3Btn;
    private javax.swing.JButton reusePlus1Btn;
    private javax.swing.JButton reusePlus2Btn;
    private javax.swing.JButton reusePlus3Btn;
    private javax.swing.JButton save1Btn;
    private javax.swing.JButton save2Btn;
    private javax.swing.JButton save3Btn;
    private javax.swing.JLabel saveMsgLbl;
    private javax.swing.JButton savePlus1Btn;
    private javax.swing.JButton savePlus2Btn;
    private javax.swing.JButton savePlus3Btn;
    private javax.swing.JTextField userNum10Tf;
    private javax.swing.JTextField userNum11Tf;
    private javax.swing.JTextField userNum12Tf;
    private javax.swing.JTextField userNum13Tf;
    private javax.swing.JTextField userNum14Tf;
    private javax.swing.JTextField userNum15Tf;
    private javax.swing.JTextField userNum1Tf;
    private javax.swing.JTextField userNum2Tf;
    private javax.swing.JTextField userNum3Tf;
    private javax.swing.JTextField userNum4Tf;
    private javax.swing.JTextField userNum5Tf;
    private javax.swing.JTextField userNum6Tf;
    private javax.swing.JTextField userNum7Tf;
    private javax.swing.JTextField userNum8Tf;
    private javax.swing.JTextField userNum9Tf;
    private javax.swing.JButton view1Btn;
    private javax.swing.JButton view2Btn;
    private javax.swing.JButton view3Btn;
    private javax.swing.JButton viewPlus1Btn;
    private javax.swing.JButton viewPlus2Btn;
    private javax.swing.JButton viewPlus3Btn;
    // End of variables declaration//GEN-END:variables

    private void setUserNum1(int userNum1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
