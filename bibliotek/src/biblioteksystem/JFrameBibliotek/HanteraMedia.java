package src.biblioteksystem.JFrameBibliotek;

import src.biblioteksystem.JFrameBibliotek.SenaInlämningar;
import src.biblioteksystem.JFrameBibliotek.Uppdatera1;
import src.biblioteksystem.JFrameBibliotek.LäggaTill2;
public class HanteraMedia extends javax.swing.JFrame {

    public HanteraMedia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NyMedlem = new javax.swing.JLabel();
        LämnaTillbaka = new javax.swing.JButton();
        LämnaTillbaka1 = new javax.swing.JButton();
        LämnaTillbaka2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bibliotek");

        NyMedlem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NyMedlem.setText("Hantera Media");

        LämnaTillbaka.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LämnaTillbaka.setText("Lägga till");
        LämnaTillbaka.setPreferredSize(new java.awt.Dimension(150, 25));
        LämnaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LämnaTillbakaActionPerformed(evt);
            }
        });

        LämnaTillbaka1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LämnaTillbaka1.setText("Visa sena inlämningar");
        LämnaTillbaka1.setPreferredSize(new java.awt.Dimension(150, 25));
        LämnaTillbaka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LämnaTillbaka1ActionPerformed(evt);
            }
        });

        LämnaTillbaka2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LämnaTillbaka2.setText("Uppdatera eller Ta bort");
        LämnaTillbaka2.setPreferredSize(new java.awt.Dimension(150, 25));
        LämnaTillbaka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LämnaTillbaka2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LämnaTillbaka2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LämnaTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(LämnaTillbaka1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(NyMedlem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(NyMedlem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LämnaTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LämnaTillbaka2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LämnaTillbaka1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LämnaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LämnaTillbakaActionPerformed
 LäggaTill2 lt = new LäggaTill2();          
     lt.setVisible(true);         
    }//GEN-LAST:event_LämnaTillbakaActionPerformed

    private void LämnaTillbaka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LämnaTillbaka2ActionPerformed
Uppdatera1 up = new Uppdatera1();          
     up.setVisible(true);     
    }//GEN-LAST:event_LämnaTillbaka2ActionPerformed

    private void LämnaTillbaka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LämnaTillbaka1ActionPerformed
SenaInlämningar si = new SenaInlämningar();
si.setVisible(true);    
        
      
    }//GEN-LAST:event_LämnaTillbaka1ActionPerformed

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
            java.util.logging.Logger.getLogger(HanteraMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HanteraMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HanteraMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HanteraMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new HanteraMedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LämnaTillbaka;
    private javax.swing.JButton LämnaTillbaka1;
    private javax.swing.JButton LämnaTillbaka2;
    private javax.swing.JLabel NyMedlem;
    // End of variables declaration//GEN-END:variables
}
