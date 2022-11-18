/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
        // cek session
        if(Library.session.getSession() == null){
            System.out.println("User tidak punya session...");
        }else{
            System.out.println("User Sudah punya session...");
        }
    }
    
    public void clearTxt(){
        txtNama.setText("");
        txtNim.setText("");
        txtKelas.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtRepassword.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        txtKelas = new javax.swing.JTextField();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtRepassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 460));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 130, 72, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 36, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Kelas");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 290, 35, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Nim");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 210, 23, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 210, 90, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Re-Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 290, 120, 17);

        btnLogin1.setFont(new java.awt.Font("Open Sans SemiCondensed", 1, 11)); // NOI18N
        btnLogin1.setText("LOGIN");
        btnLogin1.setBorder(null);
        btnLogin1.setBorderPainted(false);
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin1);
        btnLogin1.setBounds(140, 420, 110, 30);

        btnRegister1.setBackground(new java.awt.Color(8, 138, 27));
        btnRegister1.setFont(new java.awt.Font("Open Sans SemiCondensed", 1, 11)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("REGISTER");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister1);
        btnRegister1.setBounds(140, 370, 110, 30);

        txtKelas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtKelas);
        txtKelas.setBounds(30, 310, 150, 30);

        txtNim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtNim);
        txtNim.setBounds(30, 230, 150, 30);

        txtNama.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtNama);
        txtNama.setBounds(30, 150, 150, 30);

        txtUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtUsername);
        txtUsername.setBounds(220, 150, 150, 30);

        txtRepassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtRepassword);
        txtRepassword.setBounds(220, 310, 150, 30);

        txtPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(220, 230, 150, 30);

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 40));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 40);

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HELLO !");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 50, 400, 30);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Please insert your data :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 90, 400, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(414, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        clearTxt();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        try {
            // TODO add your handling code here:
            Koneksi.ConnectDB();
            
            String nama = txtNama.getText();
            String nim = txtNim.getText();
            String kelas = txtKelas.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String repassword = txtRepassword.getText();
            
            if((nama.isEmpty() || (nama.length() < 6 == true)) && (nim.isEmpty() || (nim.length() < 9 == true)) && (kelas.isEmpty() || (kelas.length() < 6 == true)) && (username.isEmpty() || (username.length() < 6 == true)) && (password.isEmpty() || (password.length() < 6 == true)) && (repassword.isEmpty() || (repassword.length() < 6 == true))){
                clearTxt();
                JOptionPane.showMessageDialog(null, "Invalid", "Warning", JOptionPane.ERROR_MESSAGE);
            }else if((nama.isBlank() || (nama.length() < 6 == true) ) || (nim.isBlank() || (nim.length() < 9 == true)) || (kelas.isBlank() || (kelas.length() < 6 == true)) || (username.isBlank() || (username.length() < 6 == true))){
                clearTxt();
                JOptionPane.showMessageDialog(null, "invalid", "Warning", JOptionPane.ERROR_MESSAGE);
            }else{
                Connection conn = Koneksi.ConnectDB();
                String query = "SELECT * FROM tb_users where username='"+username+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                String AUser = null;
                while(rs.next()){
                    AUser = rs.getString("username");
                }
                st.close();

                if(AUser != null){
                    JOptionPane.showMessageDialog(null, "Oopss.. Username sudah terpakai!", "Warning", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(!password.toLowerCase().equals(repassword.toLowerCase())){
                    JOptionPane.showMessageDialog(null, "Oopss.. Re-Password harus sama dengan Password!", "Warning", JOptionPane.ERROR_MESSAGE);
                    }else{
                        String sql = "INSERT INTO `tb_users`(`nama`, `nim`, `kelas`, `username`, `password`) VALUES ("
                            + "'"+nama+"'"
                            + ",'"+nim+"'"
                            + ",'"+kelas+"'"
                            + ",'"+username+"'"
                            + ",'"+password+"')";
                        PreparedStatement preparedStmt = conn.prepareStatement(sql);
                        preparedStmt.execute();
                        clearTxt();
                        JOptionPane.showMessageDialog(null, "Berhasil registrasi", "Success", JOptionPane.INFORMATION_MESSAGE);
                        conn.close();
                        System.out.println("Registrasi Berhasil...");
                        Login login = new Login();
                        this.setVisible(false);
                        login.setVisible(true);
                    }
                }
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void txtRepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepasswordActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
