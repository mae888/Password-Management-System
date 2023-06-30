package Main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmailReset extends javax.swing.JFrame {

    public EmailReset() {
        initComponents();
    }

    String OTP = "NTY";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        oldMailTF = new javax.swing.JTextField();
        newMailTF = new javax.swing.JTextField();
        reNewMailTF = new javax.swing.JTextField();
        resetBTN = new javax.swing.JButton();
        returnBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        otpBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        otpTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Email Reset");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Current Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("New Email");

        oldMailTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        newMailTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        reNewMailTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        resetBTN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resetBTN.setText("Reset Email");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });

        returnBTN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        returnBTN.setText("Return ");
        returnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Re-Enter New Email");

        otpBTN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        otpBTN.setText("Send OTP");
        otpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpBTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("OTP");

        otpTF.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reNewMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(otpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newMailTF, oldMailTF, otpTF, reNewMailTF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(oldMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(otpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(reNewMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {newMailTF, oldMailTF, otpTF, reNewMailTF});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTNActionPerformed
        LoginWindow2 r = new LoginWindow2();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnBTNActionPerformed

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        if (otpTF.getText().equals(OTP)) {
            if (getLoginEmail().equals(oldMailTF.getText())) {
                if (emailsMatch(reNewMailTF.getText(), newMailTF.getText())) {
                    resetDetails(newMailTF.getText());
                    JOptionPane.showMessageDialog(null, "Email Reset Successffully");
                } else {
                    JOptionPane.showMessageDialog(null, "Emails Do Not Match");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your current email address is wrong");
            }
        } else {
            JOptionPane.showMessageDialog(null, "OTP do not match, try again");
        }

    }//GEN-LAST:event_resetBTNActionPerformed

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
                new EmailReset().setVisible(true);
            }
        });
    }

    public boolean emailsMatch(String p1, String p2) {
        p1 = reNewMailTF.getText();
        p2 = newMailTF.getText();
        return p1.equals(p2);
    }

    public String getLoginEmail() {
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

    public boolean resetDetails(String newEmail) {
        try {
            FileWriter r = new FileWriter("Builds", true);
            r.write(newEmail + "\n");
            r.flush();
            r.close();
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField newMailTF;
    private javax.swing.JTextField oldMailTF;
    private javax.swing.JButton otpBTN;
    private javax.swing.JTextField otpTF;
    private javax.swing.JTextField reNewMailTF;
    private javax.swing.JButton resetBTN;
    private javax.swing.JButton returnBTN;
    // End of variables declaration//GEN-END:variables
}
