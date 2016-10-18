/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

import java.text.NumberFormat;

/**
 *
 * @author 1xuell
 */
public class Y2kProblemDetector extends javax.swing.JFrame {

    /**
     * Creates new form Y2kProblemDetector
     */
    public Y2kProblemDetector() {
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

        born = new javax.swing.JLabel();
        bornAns = new javax.swing.JTextField();
        year = new javax.swing.JLabel();
        yearAns = new javax.swing.JTextField();
        old = new javax.swing.JLabel();
        ageAns = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        born.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        born.setText("Entre the last two digits of the year you were born");

        bornAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bornAnsActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        year.setText("Entre the last two digits of the current year");

        yearAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearAnsActionPerformed(evt);
            }
        });

        old.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        old.setText("Your age: ");

        ageAns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageAnsActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(bornAns, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(born))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(yearAns, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(year))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(Calculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(old)
                        .addGap(18, 18, 18)
                        .addComponent(ageAns, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(born)
                .addGap(18, 18, 18)
                .addComponent(bornAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(year)
                .addGap(18, 18, 18)
                .addComponent(yearAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(old)
                    .addComponent(ageAns, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(Menu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bornAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bornAnsActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bornAnsActionPerformed

    private void yearAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearAnsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_yearAnsActionPerformed

    private void ageAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageAnsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ageAnsActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        int born = Integer.parseInt(bornAns.getText());
        int year = Integer.parseInt(yearAns.getText());
        
        if (born > year && year < 100 && born < 100 && year >= 0 && born >= 0) {
            int age = 100 - born + year;
            NumberFormat integer
                    = NumberFormat.getIntegerInstance();
            ageAns.setText(integer.format (age));
        } 
        else if (born == year && year < 100 && born < 100 && year >= 0 && born >= 0) {
            ageAns.setText("You are either 100 or 0 years old.");
        } 
        else if (year >= born && year < 100 && born < 100 && year >= 0 && born >= 0) {
            int age = year - born;
            NumberFormat integer
                    = NumberFormat.getIntegerInstance();
            ageAns.setText(integer.format (age));
        } else {
            ageAns.setText("Invalid data.");
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new IfMenu().setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(Y2kProblemDetector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Y2kProblemDetector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Y2kProblemDetector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Y2kProblemDetector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Y2kProblemDetector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField ageAns;
    private javax.swing.JLabel born;
    private javax.swing.JTextField bornAns;
    private javax.swing.JLabel old;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearAns;
    // End of variables declaration//GEN-END:variables
}
