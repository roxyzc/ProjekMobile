/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TambahBuku extends javax.swing.JFrame {

    /**
     * Creates new form TambahBuku
     */
    public TambahBuku() {
        initComponents();
    }
    
    public void clear(){
        txtNamaBuku.setText("");
        txtPengarang.setText("");
        txtStokBuku.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnListBuku = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        txtNamaBuku = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtStokBuku = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListBuku.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        btnListBuku.setText("Tambahkan");
        btnListBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListBukuMouseClicked(evt);
            }
        });
        btnListBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListBukuActionPerformed(evt);
            }
        });
        jPanel1.add(btnListBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, 30));

        btnMenu1.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        btnMenu1.setText("Menu");
        btnMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenu1MouseClicked(evt);
            }
        });
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 30));
        jPanel1.add(txtNamaBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 30));
        jPanel1.add(txtPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 30));
        jPanel1.add(txtStokBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 40));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TAMBAH BUKU");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Stok Buku");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Nama Buku");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Pengarang ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"Read to discover new things.\"");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 220, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(415, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListBukuActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu1MouseClicked
        // TODO add your handling code here:
        Menu n = new Menu();
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_btnMenu1MouseClicked

    private void btnListBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListBukuMouseClicked
        try {
            // TODO add your handling code here:
            Koneksi.ConnectDB();
            Connection conn = Koneksi.ConnectDB();
            String query = "SELECT * FROM tb_buku where nama_bk='"+ txtNamaBuku.getText() +"' and pengarang_bk='"+txtPengarang.getText()+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            String stok = null;
            String namaBuku = null;
            String namaPengarang = null;
            while(rs.next()){
                stok = rs.getString("stok_bk");
                namaBuku = rs.getString("nama_bk");
                namaPengarang = rs.getString("pengarang_bk");
            }
            
            if((txtNamaBuku.getText().isEmpty() || (txtNamaBuku.getText().length() < 2 == true)) || (txtPengarang.getText().isEmpty() || (txtPengarang.getText().length() < 6 == true) || txtStokBuku.getText().isEmpty())){
                clear();
                JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(txtNamaBuku.getText().isBlank() == true && txtPengarang.getText().isBlank() == true){
                txtNamaBuku.setText("");
                txtPengarang.setText("");
                JOptionPane.showMessageDialog(null, "nama buku dan nama pengarang invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(txtNamaBuku.getText().isBlank() == true && txtPengarang.getText().isBlank() == false){
                txtNamaBuku.setText("");
                JOptionPane.showMessageDialog(null, "nama buku invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(txtNamaBuku.getText().isBlank() == false && txtPengarang.getText().isBlank() == true){
                txtPengarang.setText("");
                JOptionPane.showMessageDialog(null, "pengarang buku invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(stok == null && rs.next() == false){
                String ins = "INSERT INTO `tb_buku`(`nama_bk`, `pengarang_bk`, `stok_bk`) VALUES ("
                //                            + "'"+txtNoBuku.getText()+"'"
                + "'"+txtNamaBuku.getText().toLowerCase()+"'"
                + ",'"+txtPengarang.getText().toLowerCase()+"'"
                + ",'"+txtStokBuku.getText()+"')";
                PreparedStatement preparedStmt = conn.prepareStatement(ins);
                preparedStmt.execute();
                clear();
                JOptionPane.showMessageDialog(null, "Berhasil menambahkan buku", "Success", JOptionPane.INFORMATION_MESSAGE);
                conn.close();
            }else{
                String upd = "UPDATE `tb_buku` SET `stok_bk`='"+(Integer.parseInt(txtStokBuku.getText()) + Integer.parseInt(stok))+"' WHERE `nama_bk`='"+ namaBuku +"' and `pengarang_bk`='"+namaPengarang+"'";
                PreparedStatement preparedStmt = conn.prepareStatement(upd);
                preparedStmt.execute();
                clear();
                JOptionPane.showMessageDialog(null, "Berhasil menambahkan stok", "Success", JOptionPane.INFORMATION_MESSAGE);
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnListBukuMouseClicked

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
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListBuku;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNamaBuku;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtStokBuku;
    // End of variables declaration//GEN-END:variables
}
