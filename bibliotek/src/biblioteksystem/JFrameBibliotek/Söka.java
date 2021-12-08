package src.biblioteksystem.JFrameBibliotek;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import src.biblioteksystem.MediaBibliotek.MediaBibliotek;
import src.biblioteksystem.databas.Databas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Söka extends javax.swing.JFrame {

    public Söka() {
        initComponents();
        show_media();
    }

    public void show_media() {
        SqlKommandon sqlkom = new SqlKommandon();
        sqlkom.Lista();
        ArrayList<MediaBibliotek> list = sqlkom.Lista();
        DefaultTableModel model = (DefaultTableModel) a3.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMId();
            row[1] = list.get(i).getNamn();
            row[2] = list.get(i).getÅr();
            row[3] = list.get(i).getgenre();
            row[4] = list.get(i).getFörfattare();
            row[5] = list.get(i).getAntal();
            model.addRow(row);

        }
    }

    public void filter(String query) {
        DefaultTableModel model = (DefaultTableModel) a3.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        a3.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JScrollPane();
        a3 = new javax.swing.JTable();
        söka = new javax.swing.JTextField();
        a2 = new javax.swing.JLabel();
        a1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bibliotek");

        a3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MediaID", "Namn", "År", "Genre", "Författare", "Antal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        a3.setMaximumSize(new java.awt.Dimension(2147481122, 0));
        a3.setMinimumSize(new java.awt.Dimension(95, 0));
        a3.setRowHeight(17);
        a3.setSelectionBackground(new java.awt.Color(0, 255, 0));
        a3.getTableHeader().setReorderingAllowed(false);
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
        });
        panel.setViewportView(a3);

        söka.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        söka.setMaximumSize(new java.awt.Dimension(2147481234, 2147481234));
        söka.setPreferredSize(new java.awt.Dimension(11, 28));
        söka.setSelectionColor(new java.awt.Color(0, 0, 153));
        söka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sökaKeyReleased(evt);
            }
        });

        a2.setText("Söka");

        a1.setBackground(new java.awt.Color(204, 204, 204));
        a1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        a1.setText("Gå tillbaka");
        a1.setMaximumSize(new java.awt.Dimension(112, 28));
        a1.setMinimumSize(new java.awt.Dimension(112, 28));
        a1.setPreferredSize(new java.awt.Dimension(112, 28));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(a2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(söka, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(söka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked

    }//GEN-LAST:event_a3MouseClicked

    private void sökaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sökaKeyReleased
        String query = söka.getText();

        filter(query);
        // TODO add your handling code here:
    }//GEN-LAST:event_sökaKeyReleased

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed

        setVisible(false);

    }//GEN-LAST:event_a1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JLabel a2;
    private javax.swing.JTable a3;
    private javax.swing.JScrollPane panel;
    private javax.swing.JTextField söka;
    // End of variables declaration//GEN-END:variables
}
