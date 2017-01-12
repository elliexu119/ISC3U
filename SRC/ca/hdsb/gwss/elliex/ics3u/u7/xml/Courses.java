/* Ellie Xu             
 * 1. 10. 2017.
 * Shows courses from xml. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u7.xml;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.ParsingException;
import nu.xom.Serializer;

/**
 *
 * @author 1xuell
 */
public class Courses extends javax.swing.JFrame {

    Document doc;
    Element ROOT;

    /**
     * Creates new form Courses
     */
    public Courses() {
        initComponents();
        File file = new File("courses.xml");
        if (file.exists()) {
            Builder builder = new Builder();
            try {
                doc = builder.build(file);
                ROOT = doc.getRootElement();
            } catch (ParsingException ex) {
                Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ROOT = new Element("Courses");
            doc = new Document(ROOT);
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

        javax.swing.JLabel COURSE = new javax.swing.JLabel();
        CODE = new javax.swing.JLabel();
        DISCRIPTION = new javax.swing.JLabel();
        TEACHER = new javax.swing.JLabel();
        SCHOOLBOARD = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        schoolboard = new javax.swing.JTextField();
        teacher = new javax.swing.JTextField();
        ADD = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        COURSE.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        COURSE.setText("COURSE");

        CODE.setText("CODE");

        DISCRIPTION.setText("DESCRIPTION");

        TEACHER.setText("TEACHER");

        SCHOOLBOARD.setText("SCHOOL BOARD");

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });

        schoolboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolboardActionPerformed(evt);
            }
        });

        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(COURSE)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SCHOOLBOARD)
                            .addComponent(TEACHER)
                            .addComponent(DISCRIPTION)
                            .addComponent(CODE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schoolboard, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(ADD)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(COURSE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CODE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISCRIPTION)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEACHER)
                    .addComponent(teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCHOOLBOARD)
                    .addComponent(schoolboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ADD)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void schoolboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolboardActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        String course = code.getText().trim();
        String des = description.getText().trim();
        String teach = teacher.getText().trim();
        String board = schoolboard.getText().trim();

        Element COURSE = new Element("Course");
        Element Code = new Element ("Code");
        Element DES = new Element("Discription");
        Element TEACH = new Element("Teacher");
        Element BOARD = new Element("SchoolBoard");

        COURSE.appendChild(Code);
        Code.appendChild(course);
        COURSE.appendChild(DES);
        DES.appendChild(des);
        COURSE.appendChild(TEACH);
        TEACH.appendChild(teach);
        COURSE.appendChild(BOARD);
        BOARD.appendChild(board);
        ROOT.appendChild(COURSE);
        
        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(doc);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        try {
            FileWriter file = new FileWriter("courses.xml");
            BufferedWriter writer = new BufferedWriter(file);
            writer.write(doc.toXML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sopl("");
        code.setText("");
        description.setText("");
        teacher.setText("");
        schoolboard.setText("");
    }

//GEN-LAST:event_ADDActionPerformed

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
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ADD;
    private javax.swing.JLabel CODE;
    private javax.swing.JLabel DISCRIPTION;
    private javax.swing.JLabel SCHOOLBOARD;
    private javax.swing.JLabel TEACHER;
    private javax.swing.JTextField code;
    private javax.swing.JTextField description;
    private javax.swing.JTextField schoolboard;
    private javax.swing.JTextField teacher;
    // End of variables declaration//GEN-END:variables
}