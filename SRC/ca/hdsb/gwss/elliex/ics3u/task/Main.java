/* Ellie Xu             
 * 1, 20, 2017
 * Animal data base with search xml.
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.task;

/**
 *
 * @author 1xuell
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        Background = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Title2 = new javax.swing.JLabel();
        MadeBy = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        Data2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(0, 51, 102));
        Background.setForeground(new java.awt.Color(0, 102, 204));

        Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 255, 255));
        Title.setText("Don't be upsetti, have some spaghetti");

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.setToolTipText("");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Title2.setBackground(new java.awt.Color(255, 255, 255));
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Multiple choice ICS3U questions");

        MadeBy.setForeground(new java.awt.Color(255, 255, 255));
        MadeBy.setText("A program made by Ellie");

        Data.setForeground(new java.awt.Color(204, 204, 204));
        Data.setText("Version 1.0");

        Data2.setForeground(new java.awt.Color(204, 204, 204));
        Data2.setText("5 Questions in total");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Title))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Title2))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(MadeBy)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Data2)
                .addGap(20, 20, 20))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Data)
                    .addComponent(Data2))
                .addGap(33, 33, 33)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(start)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addGap(18, 18, 18)
                .addComponent(Title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MadeBy)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        this.dispose();
        new Questions().setVisible(true);
    }//GEN-LAST:event_startActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Data2;
    private javax.swing.JLabel MadeBy;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title2;
    private javax.swing.JButton exit;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
