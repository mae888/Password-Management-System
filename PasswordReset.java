package Main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PasswordReset extends javax.swing.JFrame {

    String OTP = "NTY";

    public PasswordReset() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        otpTF = new javax.swing.JTextField();
        newPassTF = new javax.swing.JTextField();
        reNewPassTF = new javax.swing.JTextField();
        sendotpTF = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        returnBTN1 = new javax.swing.JButton();
        resetBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Password Reset");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("OTP");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("New Password");

        otpTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        newPassTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        reNewPassTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        sendotpTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sendotpTF.setText("Send OTP");
        sendotpTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendotpTFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Re-Enter New Password");

        returnBTN1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        returnBTN1.setText("Return ");
        returnBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTN1ActionPerformed(evt);
            }
        });

        resetBTN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resetBTN.setText("Reset Password");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(returnBTN1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(newPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reNewPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(otpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sendotpTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newPassTF, reNewPassTF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sendotpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reNewPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {newPassTF, otpTF, reNewPassTF});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendotpTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendotpTFActionPerformed
        JOptionPane.showMessageDialog(null, "Sending OTP to your email address, wait for confirmation");
        String email = getLoginEmail();
        Email mail = new Email();
        OTP = generateOTP();
        mail.sendMail(OTP, email);
        JOptionPane.showMessageDialog(null, "OTP Sent Successfully");
    }//GEN-LAST:event_sendotpTFActionPerformed

    private void returnBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTN1ActionPerformed
        LoginWindow1 l = new LoginWindow1();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnBTN1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        if (OTP.equalsIgnoreCase(otpTF.getText())) {
            if (passwordsMatch(reNewPassTF.getText(), newPassTF.getText())) {
                    resetDetails(newPassTF.getText());
                    JOptionPane.showMessageDialog(null, "Password Reset Successffully");
                    LoginWindow1 l = new LoginWindow1();
                    l.setVisible(true);
                    dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Passwords Do Not Match");
            }
        } else {
            JOptionPane.showMessageDialog(null, "OTP Does Not Match");
        }
    }//GEN-LAST:event_resetBTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordReset().setVisible(true);
            }
        });
    }

    public boolean passwordsMatch(String p1, String p2) {
        p1 = reNewPassTF.getText();
        p2 = newPassTF.getText();
        return p1.equals(p2);
    }

    public String getLoginPassword() {
        String p = "";
        try {
            Scanner scan = new Scanner(new FileReader("Access"));
            while (scan.hasNext()) {
                p = scan.next();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
        return p;
    }

    public String getLoginEmail() {
        String p = "";
        try {
            Scanner scan = new Scanner(new FileReader("Builds"));
            while (scan.hasNext()) {
                p = scan.next();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
        return p;
    }

    public boolean resetDetails(String newPass) {
        try {
            FileWriter r = new FileWriter("Access", true);
            r.write(newPass + "\n");
            r.flush();
            r.close();
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField newPassTF;
    private javax.swing.JTextField otpTF;
    private javax.swing.JTextField reNewPassTF;
    private javax.swing.JButton resetBTN;
    private javax.swing.JButton returnBTN1;
    private javax.swing.JButton sendotpTF;
    // End of variables declaration//GEN-END:variables
}
