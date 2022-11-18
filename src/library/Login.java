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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
    public void clearTxt(){
        txtUsername2.setText("");
        txtPassword2.setText("");
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
        jLabel6 = new javax.swing.JLabel();
        btnRegister2 = new javax.swing.JButton();
        btnLogin2 = new javax.swing.JButton();
        txtUsername2 = new javax.swing.JTextField();
        txtPassword2 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 400));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 190, 90, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 240, 70, 24);

        btnRegister2.setFont(new java.awt.Font("Open Sans SemiCondensed", 1, 11)); // NOI18N
        btnRegister2.setText("REGISTER");
        btnRegister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister2);
        btnRegister2.setBounds(130, 350, 90, 30);

        btnLogin2.setFont(new java.awt.Font("Open Sans SemiCondensed", 1, 11)); // NOI18N
        btnLogin2.setText("LOGIN");
        btnLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin2);
        btnLogin2.setBounds(140, 300, 70, 30);

        txtUsername2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsername2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername2);
        txtUsername2.setBounds(160, 190, 150, 30);
        jPanel1.add(txtPassword2);
        txtPassword2.setBounds(160, 230, 150, 30);

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 40));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 360, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 70, 170, 30);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Please insert your username and password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 110, 250, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/perpus-removebg-preview.png"))); // NOI18N
        jLabel5.setIconTextGap(1);
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-10, 160, 410, 340);

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(376, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegister2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister2ActionPerformed
        // TODO add your handling code here:
        Register regis = new Register();
        this.setVisible(false);
        regis.setVisible(true);
    }//GEN-LAST:event_btnRegister2ActionPerformed

    private void btnLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin2ActionPerformed
        // TODO add your handling code here:
        try{
            Koneksi.ConnectDB();
            String username = txtUsername2.getText();
            String password = txtPassword2.getText();
            Connection connection = Koneksi.ConnectDB();
            String query = "SELECT * FROM tb_users where username='"+username+"'";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            String AUser = null;
            String Apassword = null;
            String AID = null;
            while(rs.next()){
                AUser = rs.getString("username");
                Apassword = rs.getString("password");
                AID = rs.getString("userID");
            }
            st.close();
      
            if(username.isEmpty() && password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Username dan Password kosong", "Warning", JOptionPane.ERROR_MESSAGE);
            }else if(username != null && password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Password anda kosong", "Warning",JOptionPane.ERROR_MESSAGE);
                txtUsername2.getText();
            }else if(username.isEmpty() && password != null){
                JOptionPane.showMessageDialog(this, "Username anda kosong", "Warning",JOptionPane.ERROR_MESSAGE);
                txtPassword2.getText();
            }else if((username.equals(AUser) == false) && password.equals(Apassword) == false){
                JOptionPane.showMessageDialog(this, "User tidak ditemukan", "Warning",JOptionPane.ERROR_MESSAGE);
                txtUsername2.getText();
                txtPassword2.getText();
            }else if((password.equals(Apassword) == false) && username.equals(AUser) == true){
                JOptionPane.showMessageDialog(this, "Passowrd salah", "Warning",JOptionPane.ERROR_MESSAGE);
                txtPassword2.getText();
            }else{
                clearTxt();
                System.out.println("Login Berhasil...");
                Menu menu = new Menu();
                // set session
                Library.session.setSession(AID);
//                System.out.println(Menu.session.getSession());
                this.setVisible(false);
                menu.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Login Error...", "Warning",JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_btnLogin2ActionPerformed

    private void txtUsername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin2;
    private javax.swing.JButton btnRegister2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUsername2;
    // End of variables declaration//GEN-END:variables
}