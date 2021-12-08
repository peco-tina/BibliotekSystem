package src.biblioteksystem.MainBibliotek;

import src.biblioteksystem.JFrameBibliotek.PersonalLoggaIn;
import src.biblioteksystem.JFrameBibliotek.LoggaIn;
import src.biblioteksystem.JFrameBibliotek.NyAnvändare;
import src.biblioteksystem.JFrameBibliotek.Söka;

public class FrontPage extends javax.swing.JFrame {
 FrontPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JLabel();
        knapp1 = new javax.swing.JButton();
        knapp2 = new javax.swing.JButton();
        knapp3 = new javax.swing.JButton();
        knapp4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bibliotek");

        a1.setText("               Bibliotek");

        knapp1.setText("Logga in");
        knapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp1ActionPerformed(evt);
            }
        });

        knapp2.setText("Admin");
        knapp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp2ActionPerformed(evt);
            }
        });

        knapp3.setText("Skapa konto");
        knapp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp3ActionPerformed(evt);
            }
        });

        knapp4.setText("Sök");
        knapp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(knapp2)
                            .addComponent(knapp1)
                            .addComponent(knapp3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(knapp4)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(knapp1)
                .addGap(18, 18, 18)
                .addComponent(knapp2)
                .addGap(18, 18, 18)
                .addComponent(knapp3)
                .addGap(18, 18, 18)
                .addComponent(knapp4)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void knapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp1ActionPerformed
 LoggaIn li = new LoggaIn();
 li.setVisible(true);
    }//GEN-LAST:event_knapp1ActionPerformed

    private void knapp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp2ActionPerformed
        PersonalLoggaIn loggain = new PersonalLoggaIn();  
        loggain.setVisible(true);
    }//GEN-LAST:event_knapp2ActionPerformed

    private void knapp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp3ActionPerformed
NyAnvändare na = new NyAnvändare();
na.setVisible(true);
    }//GEN-LAST:event_knapp3ActionPerformed

    private void knapp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp4ActionPerformed
Söka söka = new Söka();
söka.setVisible(true);
    }//GEN-LAST:event_knapp4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JButton knapp1;
    private javax.swing.JButton knapp2;
    private javax.swing.JButton knapp3;
    private javax.swing.JButton knapp4;
    // End of variables declaration//GEN-END:variables
}
