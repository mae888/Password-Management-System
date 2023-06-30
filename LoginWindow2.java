package Main;

import Main.AddPass;
import Main.Email;
import Main.PasswordReset;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginWindow2 extends javax.swing.JFrame {

    String OTP = "nothing";

    public LoginWindow2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        passwordResetBTN = new javax.swing.JButton();
        otpTF = new javax.swing.JTextField();
        LoginBTN = new javax.swing.JButton();
        otpBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icons/icons8_One_Time_Password_80px.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        passwordResetBTN.setBackground(new java.awt.Color(255, 255, 255));
        passwordResetBTN.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        passwordResetBTN.setText(" Reset Email ");
        passwordResetBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        passwordResetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordResetBTNActionPerformed(evt);
            }
        });
        getContentPane().add(passwordResetBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, 64));

        otpTF.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        otpTF.setCaretColor(new java.awt.Color(51, 51, 51));
        getContentPane().add(otpTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 340, 60));

        LoginBTN.setBackground(new java.awt.Color(255, 255, 255));
        LoginBTN.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        LoginBTN.setText("Login");
        LoginBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 170, 60));

        otpBTN.setBackground(new java.awt.Color(255, 255, 255));
        otpBTN.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        otpBTN.setText("Send OTP");
        otpBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        otpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpBTNActionPerformed(evt);
            }
        });
        getContentPane().add(otpBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 140, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Icons/Background2 (3).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        if (otpTF.getText().equalsIgnoreCase(OTP)) {
            AddPass r = new AddPass();
            r.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid OTP, Try Again");
        }
    }//GEN-LAST:event_LoginBTNActionPerformed

    private void passwordResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordResetBTNActionPerformed
        PasswordReset r = new PasswordReset();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_passwordResetBTNActionPerformed

    private void otpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otpBTNActionPerformed
        JOptionPane.showMessageDialog(null, "Sending OTP to your email address, wait for confirmation");
        String email = getLoginEmail();
        Email mail = new Email();
        OTP = generateOTP();
        mail.sendMail(OTP, email);
        JOptionPane.showMessageDialog(null, "OTP Sent Successfully");
    }//GEN-LAST:event_otpBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow2().setVisible(true);
            }
        });
    }

    public String getLoginEmail(){
        String mail = "";
        try {
            Scanner scan = new Scanner(new FileReader("Builds"));
            while (scan.hasNext()) {
                mail = scan.next();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
//        JOptionPane.showMessageDialog(null, mail); 
        return mail;
    }
    
    public String generateOTP() {
        Random r = new Random();
        String otp = "";
        for (int i = 0; i < 5; i++) {
            otp += r.nextInt(10);
        }
        return otp;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton otpBTN;
    private javax.swing.JTextField otpTF;
    private javax.swing.JButton passwordResetBTN;
    // End of variables declaration//GEN-END:variables
}
