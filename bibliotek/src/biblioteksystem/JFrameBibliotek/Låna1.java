
package src.biblioteksystem.JFrameBibliotek;


import src.biblioteksystem.JFrameBibliotek.LoggaIn;
import src.biblioteksystem.JFrameBibliotek.SqlKommandon;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import src.biblioteksystem.MediaBibliotek.MediaBibliotek;
import src.biblioteksystem.databas.Databas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
public class Låna1 extends javax.swing.JFrame {

    public Låna1() {
        initComponents();
        Visa();
    }
    
   public void Visa(){
        SqlKommandon sqlKom = new SqlKommandon();
        
        ArrayList<MediaBibliotek> list = sqlKom.Lista();
        DefaultTableModel model = (DefaultTableModel)a2.getModel();
        Object[] row = new Object [6];
        for(int i=0;i<list.size();i++) {
            row[0]=list.get(i).getMId();
            row[1]=list.get(i).getNamn();
            row[2]=list.get(i).getÅr();
            row[3]=list.get(i).getgenre();
            row[4]=list.get(i).getFörfattare();
            row[5]=list.get(i).getAntal();
            model.addRow(row);
        }
    }


public void AktuellAnvändare(){
        LoggaIn användare = new LoggaIn();
    String AktuellAnvändare = användare.getAnvändarNamn();
    iddd.setText(AktuellAnvändare); 
    }
    public void filter(String query)
{
    DefaultTableModel model = (DefaultTableModel)a2.getModel();
    TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
    a2.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(query));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gåTillbaka = new javax.swing.JButton();
        låna = new javax.swing.JButton();
        panel = new javax.swing.JScrollPane();
        a2 = new javax.swing.JTable();
        MediaID = new javax.swing.JLabel();
        namn = new javax.swing.JLabel();
        År = new javax.swing.JLabel();
        genre = new javax.swing.JLabel();
        författare = new javax.swing.JLabel();
        antal2 = new javax.swing.JLabel();
        antal1 = new javax.swing.JLabel();
        Söka = new javax.swing.JTextField();
        a1 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        iddd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bibliotek");

        gåTillbaka.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        gåTillbaka.setText("Gå tillbaka");
        gåTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gåTillbakaActionPerformed(evt);
            }
        });

        låna.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        låna.setText("Låna");
        låna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lånaActionPerformed(evt);
            }
        });

        a2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titel", "År", "Genre", "Författare", "Antal "
            }
        ));
        a2.setSelectionBackground(new java.awt.Color(0, 255, 0));
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
        });
        panel.setViewportView(a2);

        MediaID.setText("ID");

        namn.setText("Namn");

        År.setText("År");

        genre.setText("Genre");

        författare.setText("Författare");

        antal2.setText("Antal ");

        Söka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SökaActionPerformed(evt);
            }
        });
        Söka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SökaKeyReleased(evt);
            }
        });

        a1.setText("Söka");

        iddd.setVisible(false);
        iddd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Söka, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(låna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gåTillbaka, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(iddd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(antal1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(namn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MediaID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(År, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(antal2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(författare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MediaID)
                        .addGap(18, 18, 18)
                        .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(År)
                        .addGap(18, 18, 18)
                        .addComponent(författare)
                        .addGap(18, 18, 18)
                        .addComponent(genre)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(antal1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(antal2)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(iddd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(låna, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gåTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a1)
                                .addComponent(Söka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(92, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lånaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lånaActionPerformed
 String antal = antal1.getText();
        int rad = a2.getSelectedRow();
        String värde = (a2.getModel().getValueAt(rad, 0).toString());
        String MediaId = MediaID.getText();
        String användarnamn = iddd.getText ();
        SqlKommandon sqlkom = new SqlKommandon();
        sqlkom.Låna(antal, rad, värde, MediaId, användarnamn);        

    }//GEN-LAST:event_lånaActionPerformed
   public static Date LäggaTillDag(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return new Date(c.getTimeInMillis());
   }
    
    private void gåTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gåTillbakaActionPerformed
 dispose(); 
    }//GEN-LAST:event_gåTillbakaActionPerformed

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
        
        int i = a2.getSelectedRow();  
    TableModel model = a2.getModel();
    antal1.setText(model.getValueAt(i,5).toString());
    MediaID.setText(model.getValueAt(i,0).toString());
    namn.setText(model.getValueAt(i,1).toString());
    År.setText(model.getValueAt(i,2).toString());
    genre.setText(model.getValueAt(i,3).toString());
    författare.setText(model.getValueAt(i,4).toString()); 
    }//GEN-LAST:event_a2MouseClicked

    private void SökaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SökaKeyReleased
  String query=Söka.getText();
  
        filter(query); 
    }//GEN-LAST:event_SökaKeyReleased

    private void SökaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SökaActionPerformed
    }//GEN-LAST:event_SökaActionPerformed

    private void idddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idddActionPerformed
    }//GEN-LAST:event_idddActionPerformed

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
            java.util.logging.Logger.getLogger(Låna1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Låna1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Låna1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Låna1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Låna1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MediaID;
    private javax.swing.JTextField Söka;
    private javax.swing.JLabel a1;
    public javax.swing.JTable a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel antal1;
    private javax.swing.JLabel antal2;
    private javax.swing.JLabel författare;
    private javax.swing.JLabel genre;
    private javax.swing.JButton gåTillbaka;
    private javax.swing.JTextField iddd;
    private javax.swing.JButton låna;
    private javax.swing.JLabel namn;
    private javax.swing.JScrollPane panel;
    private javax.swing.JLabel År;
    // End of variables declaration//GEN-END:variables
}
