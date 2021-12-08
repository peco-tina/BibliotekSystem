
package src.biblioteksystem.JFrameBibliotek;

import src.biblioteksystem.JFrameBibliotek.Låna1;

/**
 *
 * @author nemanjagligorijevic
 */
public class AnvändarSida extends javax.swing.JFrame {
    public AnvändarSida() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        knapp1 = new javax.swing.JButton();
        knapp2 = new javax.swing.JButton();
        knapp3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bibliotek");

        knapp1.setText("Låna ");
        knapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp1ActionPerformed(evt);
            }
        });

        knapp2.setText("Lämna tillbaka");
        knapp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp2ActionPerformed(evt);
            }
        });

        knapp3.setText("Gå tillbaka");
        knapp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(knapp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(knapp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(knapp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(knapp1)
                .addGap(51, 51, 51)
                .addComponent(knapp2)
                .addGap(18, 18, 18)
                .addComponent(knapp3)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void knapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp1ActionPerformed
       Låna1 l = new Låna1();          
     l.setVisible(true);  
    }//GEN-LAST:event_knapp1ActionPerformed

    private void knapp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp2ActionPerformed
     LämnaTIllbaka lt = new LämnaTIllbaka();
     lt.setVisible(true);
    }//GEN-LAST:event_knapp2ActionPerformed

    private void knapp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp3ActionPerformed
        LoggaIn li = new LoggaIn();          
     li.setVisible(true);  
     dispose();     
    }//GEN-LAST:event_knapp3ActionPerformed

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
            java.util.logging.Logger.getLogger(AnvändarSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnvändarSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnvändarSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnvändarSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnvändarSida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton knapp1;
    private javax.swing.JButton knapp2;
    private javax.swing.JButton knapp3;
    // End of variables declaration//GEN-END:variables
}
