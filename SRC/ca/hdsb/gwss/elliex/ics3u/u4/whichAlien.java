/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

/**
 *
 * @author 1xuell
 */
public class whichAlien extends javax.swing.JFrame {

    /**
     * Creates new form whichAlien
     */
    public whichAlien() {
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

        jFrame1 = new javax.swing.JFrame();
        eye1 = new javax.swing.JLabel();
        antenna1 = new javax.swing.JLabel();
        Type1 = new javax.swing.JLabel();
        eyea1 = new javax.swing.JTextField();
        eye = new javax.swing.JLabel();
        antenna = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        eyea = new javax.swing.JTextField();
        antennaa = new javax.swing.JTextField();
        typea = new javax.swing.JTextField();
        identify = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eye1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eye1.setText("Number of eyes");

        antenna1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        antenna1.setText("Number of antennas");

        Type1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Type1.setText("Type of alien");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Type1)
                    .addComponent(antenna1)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(eye1)
                        .addGap(18, 18, 18)
                        .addComponent(eyea1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eye1)
                    .addComponent(eyea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(antenna1)
                .addGap(48, 48, 48)
                .addComponent(Type1)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eye.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eye.setText("Number of eyes");

        antenna.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        antenna.setText("Number of antennas");

        Type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Type.setText("Type of alien");

        eyea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyeaActionPerformed(evt);
            }
        });

        identify.setText("Identify");
        identify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifyActionPerformed(evt);
            }
        });

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(antenna)
                                            .addComponent(eye))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eyea, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(antennaa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Type)
                                        .addGap(13, 13, 13)
                                        .addComponent(typea, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(identify)))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(menu)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eye)
                    .addComponent(eyea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antenna)
                    .addComponent(antennaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(identify)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Type)
                    .addComponent(typea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(menu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eyeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eyeaActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new IfMenu().setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    private void identifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifyActionPerformed
        // TODO add your handling code here:
        int eye = Integer.parseInt(eyea.getText());
        int an = Integer.parseInt(antennaa.getText());
        //result
            if (an >= 0 && eye >= 0) {
                System.out.println("The alien can be: ");
                if (an >= 3 && eye <= 4 && eye >= 0) {
                    typea.setText("TroyMartian");
                }
                if (an <= 2 && an >= 0 && eye <= 3 && eye >= 0) {
                    typea.setText("GraemeMercurian");
                }
                if (an <= 6 && an >= 0 && eye >= 2) {
                    typea.setText("VladSaturnian");
                } else if ((an < 3 && eye > 4) || eye >= 3 && an >= 2) {
                    typea.setText("Unkown species");
                }
            } else {
                typea.setText("INVALID DATA");
            }
        
    }//GEN-LAST:event_identifyActionPerformed

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
            java.util.logging.Logger.getLogger(whichAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(whichAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(whichAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(whichAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new whichAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Type;
    private javax.swing.JLabel Type1;
    private javax.swing.JLabel antenna;
    private javax.swing.JLabel antenna1;
    private javax.swing.JTextField antennaa;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel eye1;
    private javax.swing.JTextField eyea;
    private javax.swing.JTextField eyea1;
    private javax.swing.JButton identify;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField typea;
    // End of variables declaration//GEN-END:variables
}