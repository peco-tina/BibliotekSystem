
package src.biblioteksystem.JFrameBibliotek;


import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import src.biblioteksystem.databas.Databas;
import src.biblioteksystem.AnvändareBibliotek.Användare;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UppdateraAnvändare1 extends javax.swing.JFrame {
    DefaultTableModel dm;
    public UppdateraAnvändare1() {
        initComponents();
 
        Visa();
    }
    
     public void Visa(){
        SqlKommandon sqlkom = new SqlKommandon();
        
        ArrayList<Användare> list = sqlkom.användarLista();
        DefaultTableModel model = (DefaultTableModel)b1.getModel();
        Object[] row = new Object [6];
        for(int i=0;i<list.size();i++) {
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getnamn();
            row[2]=list.get(i).getlösenord();
            row[3]=list.get(i).getadress();
            row[4]=list.get(i).getemail();
            row[5]=list.get(i).getmobilnummer();
            model.addRow(row);
                   
            
        }
    }

public void filter(String query)
{
    DefaultTableModel model = (DefaultTableModel)b1.getModel();
    TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
    b1.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(query));
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JLabel();
        uppdatera = new javax.swing.JButton();
        namn = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        lösenord = new javax.swing.JTextField();
        adress1 = new javax.swing.JTextField();
        mobilnummer1 = new javax.swing.JTextField();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        panel = new javax.swing.JScrollPane();
        b1 = new javax.swing.JTable();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        söka = new javax.swing.JTextField();
        a9 = new javax.swing.JLabel();
        användareId = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bibliotek");

        a1.setText("ID:");

        uppdatera.setText("Uppdatera");
        uppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateraActionPerformed(evt);
            }
        });

        a2.setText("Namn");

        a3.setText("Lösenord");

        a4.setText("Email:");

        a5.setText("Adress:");

        a6.setText("Mobilnummer");

        b1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Namn", "Lösenord", "Email", "Adress", "Mobilnummer"
            }
        ));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        panel.setViewportView(b1);

        a7.setFont(new java.awt.Font("Apple Braille", 0, 11)); // NOI18N
        a7.setText("Välj Användare");

        a8.setFont(new java.awt.Font("Apple Braille", 0, 11)); // NOI18N
        a8.setText("Skriv in nya värden");

        söka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökaActionPerformed(evt);
            }
        });
        söka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sökaKeyReleased(evt);
            }
        });

        a9.setText("Söka");

        användareId.setFont(new java.awt.Font("Apple Braille", 0, 12)); // NOI18N
        användareId.setText("ID");

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(uppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(söka, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(602, 602, 602))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(a8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(a4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(a1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taBort, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(användareId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobilnummer1)
                            .addComponent(adress1)
                            .addComponent(email1)
                            .addComponent(lösenord)
                            .addComponent(namn))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(a7)
                        .addGap(388, 388, 388))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(295, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(a7)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(a8)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a1)
                            .addComponent(användareId))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a2)
                            .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a3)
                            .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a4)
                            .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a5)
                            .addComponent(adress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a6)
                            .addComponent(mobilnummer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a9)
                    .addComponent(söka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateraActionPerformed
String AnvändarNamn = namn.getText();
        String losenordd = String.valueOf(lösenord.getText());
        String email = email1.getText();
        String adress = adress1.getText();
        String mobilnummer = mobilnummer1.getText();
        int rad = b1.getSelectedRow();
        String värde = (b1.getModel().getValueAt(rad, 0).toString());
        SqlKommandon sqlkom = new SqlKommandon();
        sqlkom.uppdateraKonto(AnvändarNamn, losenordd, email, adress, mobilnummer, rad, värde);
        DefaultTableModel model = (DefaultTableModel)b1.getModel();
        model.setRowCount(0);
        Visa();
    }//GEN-LAST:event_uppdateraActionPerformed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
     int i = b1.getSelectedRow();  
    TableModel model = b1.getModel();
    användareId.setText(model.getValueAt(i,0).toString());
    namn.setText(model.getValueAt(i,1).toString());
    lösenord.setText(model.getValueAt(i,2).toString());
    email1.setText(model.getValueAt(i,3).toString());
    adress1.setText(model.getValueAt(i,4).toString());
    mobilnummer1.setText(model.getValueAt(i,5).toString());
    
// TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void sökaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sökaKeyReleased
        String query=söka.getText().toLowerCase();
        filter(query);
    }//GEN-LAST:event_sökaKeyReleased

    private void sökaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sökaActionPerformed

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        String id = användareId.getText();
        SqlKommandon sqlkom = new SqlKommandon();
        sqlkom.taBort(id);
    }//GEN-LAST:event_taBortActionPerformed

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
            java.util.logging.Logger.getLogger(UppdateraAnvändare1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UppdateraAnvändare1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UppdateraAnvändare1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UppdateraAnvändare1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UppdateraAnvändare1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JTextField adress1;
    private javax.swing.JLabel användareId;
    private javax.swing.JTable b1;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField lösenord;
    private javax.swing.JTextField mobilnummer1;
    private javax.swing.JTextField namn;
    private javax.swing.JScrollPane panel;
    private javax.swing.JTextField söka;
    private javax.swing.JButton taBort;
    javax.swing.JButton uppdatera;
    // End of variables declaration//GEN-END:variables
}
