package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginWindow1 extends javax.swing.JFrame {


    public LoginWindow1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordResetBTN = new javax.swing.JButton();
        LoginBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        passTF = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordResetBTN.setBackground(new java.awt.Color(255, 255, 255));
        passwordResetBTN.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        passwordResetBTN.setText(" Reset Password ");
        passwordResetBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        passwordResetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordResetBTNActionPerformed(evt);
            }
        });
        getContentPane().add(passwordResetBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, 64));

        LoginBTN.setBackground(new java.awt.Color(255, 255, 255));
        LoginBTN.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        LoginBTN.setText("Login");
        LoginBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 170, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icons/icons8_password_80px.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        passTF.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        getContentPane().add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 420, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icons/Background2 (3).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        if (passTF.getText().equals(getLoginPassword())) {
            LoginWindow2 r = new LoginWindow2();
            r.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Password");
        }
    }//GEN-LAST:event_LoginBTNActionPerformed

    private void passwordResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordResetBTNActionPerformed
        PasswordReset r = new PasswordReset();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_passwordResetBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow1().setVisible(true);
            }
        });
    }

    public String getLoginPassword(){
        String mail = "";
        try {
            Scanner scan = new Scanner(new FileReader("Access"));
            while (scan.hasNext()) {
                mail = scan.next();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
//        JOptionPane.showMessageDialog(null, mail); 
        return mail;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JButton passwordResetBTN;
    // End of variables declaration//GEN-END:variables
}
