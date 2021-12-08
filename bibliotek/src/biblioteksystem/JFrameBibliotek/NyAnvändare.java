
package src.biblioteksystem.JFrameBibliotek;


import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import src.biblioteksystem.databas.Databas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class NyAnvändare extends javax.swing.JFrame {

    public NyAnvändare() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        Namn = new javax.swing.JTextField();
        Adress = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        nummer = new javax.swing.JTextField();
        skapa = new javax.swing.JButton();
        GåTillbaka = new javax.swing.JButton();
        ny = new javax.swing.JLabel();
        Lösenord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bibliotek");

        id1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        id1.setText("Användarnamn");

        id2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        id2.setText("Email:");
        id2.setMaximumSize(new java.awt.Dimension(34, 14));
        id2.setMinimumSize(new java.awt.Dimension(34, 14));
        id2.setPreferredSize(new java.awt.Dimension(34, 14));

        id3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        id3.setText("Mobilnummer ");
        id3.setMaximumSize(new java.awt.Dimension(82, 14));
        id3.setMinimumSize(new java.awt.Dimension(82, 14));
        id3.setPreferredSize(new java.awt.Dimension(82, 14));

        id4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        id4.setText("Adress:");
        id4.setMaximumSize(new java.awt.Dimension(43, 14));
        id4.setMinimumSize(new java.awt.Dimension(43, 14));
        id4.setPreferredSize(new java.awt.Dimension(43, 14));

        id5.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        id5.setText("Lösenord");
        id5.setMaximumSize(new java.awt.Dimension(57, 15));
        id5.setMinimumSize(new java.awt.Dimension(57, 15));
        id5.setPreferredSize(new java.awt.Dimension(57, 15));

        Namn.setBackground(new java.awt.Color(204, 204, 204));

        Adress.setBackground(new java.awt.Color(204, 204, 204));

        Email.setBackground(new java.awt.Color(204, 204, 204));

        nummer.setBackground(new java.awt.Color(204, 204, 204));

        skapa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        skapa.setText("Skapa");
        skapa.setMaximumSize(new java.awt.Dimension(84, 28));
        skapa.setMinimumSize(new java.awt.Dimension(84, 28));
        skapa.setPreferredSize(new java.awt.Dimension(84, 28));
        skapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skapaActionPerformed(evt);
            }
        });

        GåTillbaka.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GåTillbaka.setText("Gå tillbaka");
        GåTillbaka.setMaximumSize(new java.awt.Dimension(113, 28));
        GåTillbaka.setMinimumSize(new java.awt.Dimension(113, 28));
        GåTillbaka.setPreferredSize(new java.awt.Dimension(113, 28));
        GåTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GåTillbakaActionPerformed(evt);
            }
        });

        ny.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ny.setText("Ny medlem");
        ny.setMaximumSize(new java.awt.Dimension(75, 16));
        ny.setMinimumSize(new java.awt.Dimension(75, 16));
        ny.setPreferredSize(new java.awt.Dimension(75, 16));

        Lösenord.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(skapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GåTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Namn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nummer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ny, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GåTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GåTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GåTillbakaActionPerformed
dispose();        
    }//GEN-LAST:event_GåTillbakaActionPerformed

    private void skapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skapaActionPerformed
String namn=Namn.getText();
String lösenord= String.valueOf(Lösenord.getPassword());
String email=Email.getText();
String adress=Adress.getText();
String mobilnummer=nummer.getText();
SqlKommandon sqlKom = new SqlKommandon();
sqlKom.skapaNyttKonto(namn, lösenord, email, adress, mobilnummer);

    }//GEN-LAST:event_skapaActionPerformed

    /**[
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
            java.util.logging.Logger.getLogger(NyAnvändare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyAnvändare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyAnvändare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyAnvändare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NyAnvändare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adress;
    private javax.swing.JTextField Email;
    private javax.swing.JButton GåTillbaka;
    private javax.swing.JPasswordField Lösenord;
    private javax.swing.JTextField Namn;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JTextField nummer;
    private javax.swing.JLabel ny;
    private javax.swing.JButton skapa;
    // End of variables declaration//GEN-END:variables
}
