/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

/**
 *
 * @author akbaroke
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public final class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        viewData();
    }
    
    public void clear(){
        txtNamaP.setText("");
        txtNimP.setText("");
        txtKelasP.setText("");
    }
    
    public void viewData(){
        try{
            Connection conn = Koneksi.ConnectDB();
            String query = "SELECT * FROM tb_users where userID='"+ Library.session.getSession() +"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            String Anama = null;
            String Anim = null;
            String Akelas = null;
            String Apassword = null;
            while(rs.next()){
                Anama = rs.getString("nama");
                Anim = rs.getString("nim");
                Akelas = rs.getString("kelas");
                Apassword = rs.getString("password");
            }
            txtNamaP.setText(Anama);
            txtNimP.setText(Anim);
            txtKelasP.setText(Akelas);
            st.close();
        }catch (SQLException ex) {
              System.out.println(ex);
        }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        btnMenuP = new javax.swing.JButton();
        btnUpdateP = new javax.swing.JButton();
        txtKelasP = new javax.swing.JTextField();
        txtNimP = new javax.swing.JTextField();
        txtNamaP = new javax.swing.JTextField();
        txtRepasswordP = new javax.swing.JPasswordField();
        txtPasswordBaruP = new javax.swing.JPasswordField();
        txtPasswordLamaP = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(44, 62, 80));
        jPanel8.setMinimumSize(new java.awt.Dimension(360, 400));
        jPanel8.setPreferredSize(new java.awt.Dimension(360, 400));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuP.setFont(new java.awt.Font("Open Sans SemiCondensed", 1, 11)); // NOI18N
        btnMenuP.setText("MENU");
        btnMenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPActionPerformed(evt);
            }
        });
        jPanel8.add(btnMenuP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 80, 30));

        btnUpdateP.setBackground(new java.awt.Color(8, 138, 27));
        btnUpdateP.setFont(new java.awt.Font("Open Sans SemiCondensed", 1, 11)); // NOI18N
        btnUpdateP.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateP.setText("UPDATE");
        btnUpdateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePActionPerformed(evt);
            }
        });
        jPanel8.add(btnUpdateP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 100, 30));
        jPanel8.add(txtKelasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 30));
        jPanel8.add(txtNimP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 30));
        jPanel8.add(txtNamaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 30));

        txtRepasswordP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepasswordPActionPerformed(evt);
            }
        });
        jPanel8.add(txtRepasswordP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 130, 30));

        txtPasswordBaruP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordBaruPActionPerformed(evt);
            }
        });
        jPanel8.add(txtPasswordBaruP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 130, 30));

        txtPasswordLamaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordLamaPActionPerformed(evt);
            }
        });
        jPanel8.add(txtPasswordLamaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, 30));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 40));
        jPanel2.setLayout(null);
        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PROFILE");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nama :");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Nim :");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Kelas :");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Re-Password");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Password lama :");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Password baru :");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(376, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuPActionPerformed

    private void btnUpdatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = Koneksi.ConnectDB();
            String query = "SELECT * FROM tb_users where userID='"+ Library.session.getSession() +"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            String Apassword = null;
            while(rs.next()){
                Apassword = rs.getString("password");
            }
            
            String nama = txtNamaP.getText();
            String nim = txtNimP.getText();
            String kelas = txtKelasP.getText();
            String passwordLama = txtPasswordLamaP.getText();
            String passwordBaru = txtPasswordBaruP.getText();
            String repassword = txtRepasswordP.getText();
            
            if(nama.isEmpty() && nim.isEmpty() && kelas.isEmpty() && passwordLama.isEmpty() && passwordBaru.isEmpty() && repassword.isEmpty()){
                JOptionPane.showMessageDialog(null, "Oopss.. Data harus diisi semua!", "Warning", JOptionPane.ERROR_MESSAGE);
            }else if((nama.isBlank() || (nama.length() < 6 == true)) || (nim.isBlank() || (nim.length() < 6 == true)) || (kelas.isBlank() || (kelas.length() < 6 == true))){ 
                clear();
                JOptionPane.showMessageDialog(null, "Invalid", "Warning", JOptionPane.ERROR_MESSAGE);
            }else if(passwordLama.isEmpty() && passwordBaru.isEmpty() && repassword.isEmpty()){
                String sql = "UPDATE `tb_users` SET `nama`='"+nama+"',`nim`='"+nim+"',`kelas`='"+kelas+"' WHERE `userID`='"+ Library.session.getSession() +"'";
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.execute();
                JOptionPane.showMessageDialog(null, "Berhasil", "Success", JOptionPane.INFORMATION_MESSAGE);
                conn.close();
                System.out.println("Profile Berhasil di update...");
            }else{
                System.out.println(Apassword.equals(passwordLama));
                System.out.println(Apassword);
                System.out.println(passwordLama);
                if(Apassword.equals(passwordLama) && passwordBaru.isEmpty() && repassword.isEmpty()){
                    JOptionPane.showMessageDialog(this, "password baru dan repassword wajib diisi ...", "Warning", JOptionPane.ERROR_MESSAGE);
                }else if(Apassword.equals(passwordLama) && passwordBaru != null && passwordBaru.isEmpty()){
                        JOptionPane.showMessageDialog(this, "password baru wajib diisi ...", "Warning", JOptionPane.ERROR_MESSAGE);
                }else if(Apassword.equals(passwordLama) && repassword.isEmpty() && passwordBaru != null){
                        JOptionPane.showMessageDialog(this, "repassword baru wajib diisi ...", "Warning", JOptionPane.ERROR_MESSAGE);
                }else if(Apassword.equals(passwordLama) == false){
                    JOptionPane.showMessageDialog(this, "Password lama salah ...", "Gagal Update", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(passwordLama.equals(passwordBaru)){
                        JOptionPane.showMessageDialog(this, "Password baru tidak boleh sama dengan password lama ...", "Gagal Update", JOptionPane.ERROR_MESSAGE);
                    }else{
                        if(!passwordBaru.equals(repassword)){
                            JOptionPane.showMessageDialog(this, "Re-password harus sama dengan password baru ...", "Gagal Update", JOptionPane.ERROR_MESSAGE);
                        }else{
                            String sql = "UPDATE `tb_users` SET `nama`='"+nama+"',`nim`='"+nim+"',`kelas`='"+kelas+"',`password`='"+passwordBaru+"' WHERE `userID`='"+ Library.session.getSession() +"'";
                            PreparedStatement preparedStmt = conn.prepareStatement(sql);
                            preparedStmt.execute();
                            JOptionPane.showMessageDialog(null, "Berhasil", "Success", JOptionPane.INFORMATION_MESSAGE);
                            conn.close();
                            System.out.println("Profile Berhasil di update...");
                            txtPasswordLamaP.setText("");
                            txtPasswordBaruP.setText("");
                            txtRepasswordP.setText("");
                        }
                    }
                }
            }
            
            st.close();
        }catch (SQLException ex) {
              System.out.println(ex);
        }
    }//GEN-LAST:event_btnUpdatePActionPerformed

    private void txtRepasswordPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepasswordPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepasswordPActionPerformed

    private void txtPasswordBaruPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordBaruPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordBaruPActionPerformed

    private void txtPasswordLamaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordLamaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordLamaPActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuP;
    private javax.swing.JButton btnUpdateP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtKelasP;
    private javax.swing.JTextField txtNamaP;
    private javax.swing.JTextField txtNimP;
    private javax.swing.JPasswordField txtPasswordBaruP;
    private javax.swing.JPasswordField txtPasswordLamaP;
    private javax.swing.JPasswordField txtRepasswordP;
    // End of variables declaration//GEN-END:variables
}