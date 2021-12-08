
package src.biblioteksystem.JFrameBibliotek;

import src.biblioteksystem.databas.Databas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import src.biblioteksystem.JFrameBibliotek.SqlKommandon;
import src.biblioteksystem.databas.Databas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LämnaTIllbaka extends javax.swing.JFrame {

    public LämnaTIllbaka() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        knapp = new javax.swing.JButton();
        a2 = new javax.swing.JLabel();
        LämnaTillbaka = new javax.swing.JButton();
        MediaID = new javax.swing.JTextField();
        a1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bibliotek");

        knapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        knapp.setText("Gå tillbaka");
        knapp.setMaximumSize(new java.awt.Dimension(116, 26));
        knapp.setMinimumSize(new java.awt.Dimension(116, 26));
        knapp.setPreferredSize(new java.awt.Dimension(115, 28));
        knapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knappActionPerformed(evt);
            }
        });

        a2.setText("Media ID: ");
        a2.setMaximumSize(new java.awt.Dimension(62, 15));
        a2.setMinimumSize(new java.awt.Dimension(62, 15));
        a2.setPreferredSize(new java.awt.Dimension(62, 15));

        LämnaTillbaka.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LämnaTillbaka.setText("Lämna Tillbaka");
        LämnaTillbaka.setMaximumSize(new java.awt.Dimension(146, 24));
        LämnaTillbaka.setMinimumSize(new java.awt.Dimension(146, 25));
        LämnaTillbaka.setPreferredSize(new java.awt.Dimension(175, 25));
        LämnaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LämnaTillbakaActionPerformed(evt);
            }
        });

        MediaID.setBackground(new java.awt.Color(204, 204, 204));
        MediaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediaIDActionPerformed(evt);
            }
        });

        a1.setText("Skanna din vara");
        a1.setMaximumSize(new java.awt.Dimension(100, 15));
        a1.setMinimumSize(new java.awt.Dimension(100, 15));
        a1.setPreferredSize(new java.awt.Dimension(100, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MediaID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(LämnaTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(knapp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MediaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(knapp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LämnaTillbaka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MediaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediaIDActionPerformed

    private void knappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knappActionPerformed
 dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_knappActionPerformed

    private void LämnaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LämnaTillbakaActionPerformed
String id=MediaID.getText();
SqlKommandon sqlKom = new SqlKommandon();
sqlKom.lämnaTillbaka(id);                    
    }//GEN-LAST:event_LämnaTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(LämnaTIllbaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LämnaTIllbaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LämnaTIllbaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LämnaTIllbaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LämnaTIllbaka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LämnaTillbaka;
    private javax.swing.JTextField MediaID;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JButton knapp;
    // End of variables declaration//GEN-END:variables
}
