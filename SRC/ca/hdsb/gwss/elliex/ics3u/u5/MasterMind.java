/* Ellie Xu             
 * 11. 31. 2016.
 * Method parameters
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u5;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;

/**
 *
 * @author 1xuell
 */
public class MasterMind extends javax.swing.JFrame {

    int correctColor = 0;
    int correctPosition = 0;
    String block1 = "";
    String block2 = "";
    String block3 = "";

    /**
     * Creates new form MasterMind
     */
    public MasterMind() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        guess1 = new javax.swing.JTextField();
        guess2 = new javax.swing.JTextField();
        guess3 = new javax.swing.JTextField();
        newgame = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        colours = new javax.swing.JLabel();
        positions = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guess the Colour of the Blocks");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter your guesses:");

        guess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guess1ActionPerformed(evt);
            }
        });

        guess2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guess2ActionPerformed(evt);
            }
        });

        guess3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guess3ActionPerformed(evt);
            }
        });

        newgame.setText("New Game");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of Colours correct:");

        jLabel4.setText("Number of Posistions correct:");

        colours.setText(" ");

        positions.setText(" ");

        jLabel5.setText("R, G, B, Y");

        check.setText("Check your Answer");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        show.setText("Show Answer");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(positions, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(37, 37, 37)
                                    .addComponent(colours, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(guess1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(guess2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addComponent(guess3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(show))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(newgame)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newgame)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guess1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guess3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guess2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(check)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(colours))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(positions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guess1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guess1ActionPerformed

    private void guess2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guess2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guess2ActionPerformed

    private void guess3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guess3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guess3ActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        //variables 
        int colour1, colour2, colour3;
        
        //colour of the blocks
        colour1 = (int) (Math.random() * 4) + 1;
        colour2 = (int) (Math.random() * 4) + 1;
        colour3 = (int) (Math.random() * 4) + 1;
        switch (colour1) {
            case 1:
                block1 = "R";
                break;
            case 2:
                block1 = "Y";
                break;
            case 3:
                block1 = "B";
                break;
            case 4:
                block1 = "G";
        }
        switch (colour2) {
            case 1:
                block2 = "R";
                break;
            case 2:
                block2 = "Y";
                break;
            case 3:
                block2 = "B";
                break;
            case 4:
                block2 = "G";
        }
        switch (colour3) {
            case 1:
                block3 = "R";
                break;
            case 2:
                block3 = "Y";
                break;
            case 3:
                block3 = "B";
                break;
            case 4:
                block3 = "G";
        }

    }//GEN-LAST:event_newgameActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        //variables
        String allBlock, allAnswer, answer1, answer2, answer3;
        int red = 0, yellow = 0, green = 0, blue = 0, ared = 0, ayellow = 0, agreen = 0, ablue = 0;

        //user input
        answer1 = (guess1.getText()).toUpperCase().trim();
        answer2 = (guess2.getText()).toUpperCase().trim();
        answer3 = (guess3.getText()).toUpperCase().trim();
        correctPosition = 0;
        correctColor = 0;

        //position match of the answer and the blocks
        if (answer1.equals(block1)) {
            correctPosition++;
        }
        if (answer2.equals(block2)) {
            correctPosition++;
        }
        if (answer3.equals(block3)) {
            correctPosition++;
        }

        //colour match of the user input and the blocks
        allBlock = block1 + block2 + block3;
        for (int i = 0; i < allBlock.length(); i++) {
            switch (allBlock.charAt(i)) {
                case 'R':
                    red++;
                    break;
                case 'B':
                    blue++;
                    break;
                case 'G':
                    green++;
                    break;
                case 'Y':
                    yellow++;
            }
        }
        sopl("Block red: " + red);
        allAnswer = answer1 + answer2 + answer3;
        for (int i = 0; i < allAnswer.length(); i++) {
            switch (allAnswer.charAt(i)) {
                case 'R':
                    ared++;
                    break;
                case 'B':
                    ablue++;
                    break;
                case 'G':
                    agreen++;
                    break;
                case 'Y':
                    ayellow++;
            }
        }
        if (red > 0 && ared > 0) {
            for (int i = 1; ared > 0 && red > 0; i++) {
                correctColor++;
                ared -= i;
                red -= i;
            }
        }
        if (blue > 0 && ablue > 0) {
            for (int i = 1; ablue > 0 && blue > 0; i++) {
                correctColor++;
                ablue -= i;
                blue -= i;
            }
        }
        if (yellow > 0 && ayellow > 0) {
            for (int i = 1; ayellow > 0 && yellow > 0; i++) {
                correctColor++;
                ayellow -= i;
                yellow -= i;
            }
        }
        if (green > 0 && agreen > 0) {
            for (int i = 1; agreen > 0 && green > 0; i++) {
                correctColor++;
                agreen -= i;
                green -= i;
            }
        }
        
        //output
        sopl("correct colour: " + correctColor);
        sopl("correct position: " + correctPosition);
        colours.setText(Integer.toString(correctColor));
        positions.setText(Integer.toString(correctPosition));
    }//GEN-LAST:event_checkActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        guess1.setText(block1);
        guess2.setText(block2);
        guess3.setText(block3);
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(MasterMind.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterMind.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterMind.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterMind.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterMind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JLabel colours;
    private javax.swing.JTextField guess1;
    private javax.swing.JTextField guess2;
    private javax.swing.JTextField guess3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newgame;
    private javax.swing.JLabel positions;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
