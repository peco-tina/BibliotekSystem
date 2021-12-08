
package src.biblioteksystem.JFrameBibliotek;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import src.biblioteksystem.databas.Databas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author nemanjagligorijevic
 */
public class LoggaIn extends javax.swing.JFrame {
    static String AnvändarNamn;

    public LoggaIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        knapp1 = new javax.swing.JButton();
        knapp2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bibliotek");

        a1.setText("Anvöndarnamn");

        a2.setText("Lösenord");

        a3.setBackground(new java.awt.Color(204, 204, 204));
        a3.setMaximumSize(new java.awt.Dimension(2147483222, 2147483222));
        a3.setMinimumSize(new java.awt.Dimension(8, 25));
        a3.setPreferredSize(new java.awt.Dimension(8, 25));
        a3.setSelectionColor(new java.awt.Color(0, 0, 255));
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        lösenord.setBackground(new java.awt.Color(204, 204, 204));
        lösenord.setMaximumSize(new java.awt.Dimension(2147483222, 2147483222));
        lösenord.setMinimumSize(new java.awt.Dimension(8, 25));
        lösenord.setName(""); // NOI18N
        lösenord.setPreferredSize(new java.awt.Dimension(8, 25));
        lösenord.setSelectionColor(new java.awt.Color(0, 0, 255));
        lösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lösenordActionPerformed(evt);
            }
        });

        knapp1.setText("Logga in");
        knapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp1ActionPerformed(evt);
            }
        });

        knapp2.setText("Gå tillbaka");
        knapp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knapp2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1)
                    .addComponent(a2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(knapp2)
                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(knapp1))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a2)
                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(knapp1)
                .addGap(18, 18, 18)
                .addComponent(knapp2)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void KundLoggaIn(){
String AnvändarNamn = a3.getText();
String lösenordd = String.valueOf(lösenord.getPassword());
SqlKommandon sqlKom = new SqlKommandon();
sqlKom.KundLoggaIn(AnvändarNamn, lösenordd);
    

}
public  String getAnvändarNamn(){
        
        return AnvändarNamn;
}
         
    private void lösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lösenordActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void knapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp1ActionPerformed
        KundLoggaIn();
    }//GEN-LAST:event_knapp1ActionPerformed

    private void knapp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knapp2ActionPerformed
        dispose(); 
    }//GEN-LAST:event_knapp2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoggaIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JTextField a3;
    private javax.swing.JButton knapp1;
    private javax.swing.JButton knapp2;
    private javax.swing.JPasswordField lösenord;
    // End of variables declaration//GEN-END:variables
}
