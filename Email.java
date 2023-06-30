package Main;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

    public void sendMail(String content, String to) {
        Properties props;
        Session session;
        MimeMessage message;
        props = new Properties();
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // example exmail and passwrod
                return new PasswordAuthentication("projectdemo123@outlook.com", "testtttest123");
            }
        };
        session = Session.getInstance(props, auth);
        try {

            InternetAddress[] recipients = new InternetAddress[1];
            recipients[0] = new InternetAddress(to);
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress("projectdemo123@outlook.com"));
            message.addRecipients(Message.RecipientType.TO, recipients);
            message.setSubject("OTP");
            message.setText(content);
            long authenticationStartTime = System.nanoTime();
            Transport.send(message);
            long authenticationEndTime = System.nanoTime();
           // System.out.println("Email sent");
            System.out.println("Authentication Time: " + (authenticationEndTime - authenticationStartTime) + " ns");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}

class spam {

    public static void main(String[] args) {
        Email e = new Email();
        e.sendMail("Test", "your email");
    }
}
