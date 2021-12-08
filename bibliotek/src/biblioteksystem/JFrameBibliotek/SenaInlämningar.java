
package src.biblioteksystem.JFrameBibliotek;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import src.biblioteksystem.JFrameBibliotek.SqlKommandon;
import src.biblioteksystem.MediaBibliotek.Sena;
import src.biblioteksystem.databas.Databas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SenaInlämningar extends javax.swing.JFrame {
    public SenaInlämningar() {
        initComponents();
        Visa();
    }
       public void Visa(){
        SqlKommandon sqlkom = new SqlKommandon();
        ArrayList<Sena> list = sqlkom.mediaList();
        DefaultTableModel model = (DefaultTableModel)a1.getModel();
        Object[] row = new Object [5];
        for(int i=0;i<list.size();i++) {
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getMId();
            row[2]=list.get(i).getAnvändarnamn();
            row[3]=list.get(i).getDatum();
            row[4]=list.get(i).getNF();
            model.addRow(row);
                   
            
        }
    }
           public void filter(String query)
{
    DefaultTableModel model = (DefaultTableModel)a1.getModel();
    TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
    a1.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(query));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bibliotek");

        a1.setBackground(new java.awt.Color(204, 204, 204));
        a1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        a1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MediaID", "Användarnamn", "LånDatum", "LämnadTillbaka"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        a1.setGridColor(new java.awt.Color(204, 204, 204));
        a1.setMaximumSize(new java.awt.Dimension(2147483333, 0));
        a1.setMinimumSize(new java.awt.Dimension(80, 0));
        a1.setPreferredSize(new java.awt.Dimension(380, 0));
        a1.setSelectionBackground(new java.awt.Color(0, 51, 255));
        panel.setViewportView(a1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SenaInlämningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SenaInlämningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SenaInlämningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SenaInlämningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SenaInlämningar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable a1;
    private javax.swing.JScrollPane panel;
    // End of variables declaration//GEN-END:variables
}
