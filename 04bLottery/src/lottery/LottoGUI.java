/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Carl
 */
public class LottoGUI extends javax.swing.JFrame {

    //ArrayList<Lotto> userList;
    //ArrayList<lottoPlus> userList2;
    private int userNums1, userNums2, userNums3, userNums4, userNums5, count;
    

    /**
     * Creates new form LotteryGUI
     */
    public LottoGUI() {
        initComponents();
        //userList = new ArrayList<>();
        //userListPlus = new ArrayList<>();

        lottoBtn.setVisible(true);
        lottoPlusBtn.setVisible(true);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);

        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);

        playBtn.setVisible(false);

        playLottoBtn.setVisible(false);
        playPlus1Btn.setVisible(false);
        playPlus2Btn.setVisible(false);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

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
        answer1JL = new javax.swing.JLabel();
        answer2JL = new javax.swing.JLabel();
        answer3JL = new javax.swing.JLabel();
        playAgainBtn = new javax.swing.JButton();
        lottoBtn = new java.awt.Button();
        lottoPlusBtn = new java.awt.Button();
        instructions1JL = new java.awt.Label();
        instructions2JL = new java.awt.Label();
        userNum1Tf = new javax.swing.JTextField();
        userNum2Tf = new javax.swing.JTextField();
        userNum3Tf = new javax.swing.JTextField();
        userNum4Tf = new javax.swing.JTextField();
        userNum5Tf = new javax.swing.JTextField();
        playBtn = new java.awt.Button();
        playLottoBtn = new javax.swing.JButton();
        playPlus1Btn = new javax.swing.JButton();
        playPlus2Btn = new javax.swing.JButton();
        ballsPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        setResizable(false);

        backgrnd.setLayout(null);

        answer1JL.setBackground(new java.awt.Color(255, 255, 204));
        answer1JL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        answer1JL.setForeground(new java.awt.Color(255, 255, 204));
        answer1JL.setText("The total correct numbers on line 1:  ");
        backgrnd.add(answer1JL);
        answer1JL.setBounds(220, 390, 400, 17);

        answer2JL.setBackground(new java.awt.Color(255, 255, 204));
        answer2JL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        answer2JL.setForeground(new java.awt.Color(255, 255, 204));
        answer2JL.setText("The total correct numbers on line 2:  ");
        backgrnd.add(answer2JL);
        answer2JL.setBounds(220, 410, 400, 17);

        answer3JL.setBackground(new java.awt.Color(255, 255, 204));
        answer3JL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        answer3JL.setForeground(new java.awt.Color(255, 255, 204));
        answer3JL.setText("The total correct numbers on line 3:  ");
        backgrnd.add(answer3JL);
        answer3JL.setBounds(220, 430, 400, 17);

        playAgainBtn.setText(" play again... visible for TESTING");
        playAgainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playAgainBtn);
        playAgainBtn.setBounds(260, 320, 280, 23);

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
        lottoBtn.setBounds(250, 110, 290, 30);

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
        lottoPlusBtn.setBounds(250, 150, 290, 30);

        instructions1JL.setAlignment(java.awt.Label.CENTER);
        instructions1JL.setBackground(new java.awt.Color(255, 255, 204));
        instructions1JL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        instructions1JL.setText("YOU HAVE 3 LINES TO PLAY!");
        backgrnd.add(instructions1JL);
        instructions1JL.setBounds(100, 20, 580, 40);

        instructions2JL.setBackground(new java.awt.Color(255, 255, 204));
        instructions2JL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        instructions2JL.setText("PLEASE ENTER 5 NUMBERS BETWEEN 1 AND 40");
        backgrnd.add(instructions2JL);
        instructions2JL.setBounds(100, 60, 580, 40);

        userNum1Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum1Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum1Tf);
        userNum1Tf.setBounds(210, 200, 50, 50);

        userNum2Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum2Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum2Tf);
        userNum2Tf.setBounds(290, 200, 50, 50);

        userNum3Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum3Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum3Tf);
        userNum3Tf.setBounds(370, 200, 50, 50);

        userNum4Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum4Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum4Tf);
        userNum4Tf.setBounds(450, 200, 50, 50);

        userNum5Tf.setBackground(new java.awt.Color(255, 255, 204));
        userNum5Tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backgrnd.add(userNum5Tf);
        userNum5Tf.setBounds(530, 200, 50, 50);

        playBtn.setBackground(new java.awt.Color(0, 0, 204));
        playBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playBtn.setForeground(new java.awt.Color(255, 255, 204));
        playBtn.setLabel("Click to play this line");
        backgrnd.add(playBtn);
        playBtn.setBounds(250, 280, 290, 30);

        playLottoBtn.setBackground(new java.awt.Color(0, 0, 204));
        playLottoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playLottoBtn.setForeground(new java.awt.Color(255, 255, 204));
        playLottoBtn.setText("Play this line as LOTTO PLUS 1");
        playLottoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playLottoBtnActionPerformed(evt);
            }
        });
        backgrnd.add(playLottoBtn);
        playLottoBtn.setBounds(270, 350, 250, 25);

        playPlus1Btn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus1Btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus1Btn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus1Btn.setText("Play this line as LOTTO");
        playPlus1Btn.setMaximumSize(new java.awt.Dimension(241, 25));
        playPlus1Btn.setMinimumSize(new java.awt.Dimension(241, 25));
        playPlus1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus1BtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus1Btn);
        playPlus1Btn.setBounds(10, 350, 240, 25);

        playPlus2Btn.setBackground(new java.awt.Color(0, 0, 204));
        playPlus2Btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playPlus2Btn.setForeground(new java.awt.Color(255, 255, 204));
        playPlus2Btn.setText("Play this line as LOTTO PLUS 2");
        playPlus2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playPlus2BtnActionPerformed(evt);
            }
        });
        backgrnd.add(playPlus2Btn);
        playPlus2Btn.setBounds(540, 350, 250, 25);

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

    private void playPlus2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus2BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playPlus2BtnActionPerformed

    private void playLottoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playLottoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playLottoBtnActionPerformed

    private void playPlus1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playPlus1BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playPlus1BtnActionPerformed

    private void playAgainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainBtnActionPerformed
        // TODO add your handling code here:
        lottoBtn.setVisible(true);
        lottoPlusBtn.setVisible(true);

        instructions1JL.setVisible(false);
        instructions2JL.setVisible(false);

        userNum1Tf.setVisible(false);
        userNum2Tf.setVisible(false);
        userNum3Tf.setVisible(false);
        userNum4Tf.setVisible(false);
        userNum5Tf.setVisible(false);

        playBtn.setVisible(false);

        playLottoBtn.setVisible(false);
        playPlus1Btn.setVisible(false);
        playPlus2Btn.setVisible(false);

        playAgainBtn.setVisible(false);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);
    }//GEN-LAST:event_playAgainBtnActionPerformed

    private void lottoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lottoBtnActionPerformed
        // TODO add your handling code here:
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(true);

        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);

        playBtn.setVisible(true);

        playLottoBtn.setVisible(false);
        playPlus1Btn.setVisible(false);
        playPlus2Btn.setVisible(false);

        playAgainBtn.setVisible(true);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);

        //int[][] userNums = new int[3][5];//C.M 2D array with 3 rows for the lines and 5 cols for the user input numbers on each line
        
        int[] lottoNums; //V.V 1D array with 5 indexs
        int[] lottoPlusOneNums = null; //V.V 1D array with 5 indexs randomly generated numbers
        int[] lottoPlusTwoNums = null; //V.V 1D array with 5 indexs randomly generated numbers
        
        //V.V Declaring and creating ArrayList called objectLines this ArrayList stores userNums1/5 and gameType of each line 
        ArrayList<Line> objectLines = new ArrayList<>();

        //V.V Declaring and creating object LottoNums
        LottoNums myLottoNums = new LottoNums();

        //V.V Generates the random numbers
        myLottoNums.lottoNums();
        myLottoNums.lottoPlusOneNums();
        myLottoNums.lottoPlusTwoNums();

        //V.V Getting genereated number from LottoNums class
        lottoNums = myLottoNums.getLottoNums();
        lottoPlusOneNums = myLottoNums.getLottoPlusOneNums();
        lottoPlusTwoNums = myLottoNums.getLottoPlusTwoNums();

        //V.V Declaring and creating an object, which send, the lotto numbers + ArrayList called lines to class Lotto
        //Lotto myLotto = new Lotto(lottoNums, objectLines);
         Lotto myLotto = new Lotto(lottoNums, lottoPlusOneNums, lottoPlusTwoNums, objectLines);

        //V.V Displaying Random numbers from all three games
        System.out.println(Arrays.toString(lottoNums));
        

        userNums1 = Integer.parseInt(userNum1Tf.getText());
        userNums2 = Integer.parseInt(userNum2Tf.getText());
        userNums3 = Integer.parseInt(userNum3Tf.getText());
        userNums4 = Integer.parseInt(userNum4Tf.getText());
        userNums5 = Integer.parseInt(userNum5Tf.getText());

        //Lotto a = new Lotto();

        setUserNums1(userNums1);
        setUserNums2(userNums2);
        setUserNums3(userNums3);
        setUserNums4(userNums4);
        setUserNums5(userNums5);

        //add object to array list
        //objectLines.add(a);

        //increase the counter
        count++;

        //V.V Carl has used JOptionPane which made the output look better, than using Syttem.out, therefore these three lines will not be used
        //V.V Outputs how many numbers have been guessed in each line.
        System.out.println("Amount of Numbers Guessed in Line 1 Total :" + myLotto.getCountLine1());//Line1
        System.out.println("Amount of Numbers Guessed in Line 2 Total :" + myLotto.getCountLine2());//Line2
        System.out.println("Amount of Numbers Guessed in Line 3 Total :" + myLotto.getCountLine3());//Line3
        //C.M.Output results to the user in 1 JOptionPane window

    }//GEN-LAST:event_lottoBtnActionPerformed

    private void lottoPlusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lottoPlusBtnActionPerformed
        // TODO add your handling code here:
        lottoBtn.setVisible(false);
        lottoPlusBtn.setVisible(false);

        instructions1JL.setVisible(true);
        instructions2JL.setVisible(true);

        userNum1Tf.setVisible(true);
        userNum2Tf.setVisible(true);
        userNum3Tf.setVisible(true);
        userNum4Tf.setVisible(true);
        userNum5Tf.setVisible(true);

        playBtn.setVisible(false);

        playLottoBtn.setVisible(true);
        playPlus1Btn.setVisible(true);
        playPlus2Btn.setVisible(true);

        playAgainBtn.setVisible(true);

        answer1JL.setVisible(false);
        answer2JL.setVisible(false);
        answer3JL.setVisible(false);
    }//GEN-LAST:event_lottoPlusBtnActionPerformed
    //public ArrayList<Lotto> getUserList() {
    //return userList;
    //}

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
    private javax.swing.JPanel backgrnd;
    private javax.swing.JLabel ballsPic;
    private java.awt.Label instructions1JL;
    private java.awt.Label instructions2JL;
    private java.awt.Button lottoBtn;
    private java.awt.Button lottoPlusBtn;
    private javax.swing.JButton playAgainBtn;
    private java.awt.Button playBtn;
    private javax.swing.JButton playLottoBtn;
    private javax.swing.JButton playPlus1Btn;
    private javax.swing.JButton playPlus2Btn;
    private javax.swing.JTextField userNum1Tf;
    private javax.swing.JTextField userNum2Tf;
    private javax.swing.JTextField userNum3Tf;
    private javax.swing.JTextField userNum4Tf;
    private javax.swing.JTextField userNum5Tf;
    // End of variables declaration//GEN-END:variables

    private void setUserNums1(int userNums1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setUserNums2(int userNums2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setUserNums3(int userNums3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setUserNums4(int userNums4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setUserNums5(int userNums5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}