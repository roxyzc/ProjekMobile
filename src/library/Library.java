/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author user
 */


public class Library {

    /**
     * @param args the command line arguments
     */
    public static Session session = new Session();
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
        login.setVisible(true);
    }
    
}