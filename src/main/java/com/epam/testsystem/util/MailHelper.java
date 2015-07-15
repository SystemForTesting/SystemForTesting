package com.epam.testsystem.util;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

public class MailHelper {

    public static void sendEmail(Session session, String userEmail, String username) throws MessagingException, IOException {
        SmtpMessageSender messageSender = new SmtpMessageSender();
        MimeMessage message = messageSender.createMimeMessage(session,
                "Hello, " + username,
                "systemfortesting2015@gmail.com",
                userEmail,
                Message.RecipientType.TO);
        messageSender.addText(message, "Please follow this", "utf-8", "plain");
        messageSender.addText(message,
                "<a href='http://localhost:8080/testsystem/changePassword.do'>link</a>",
                "utf-8",
                "html");
        messageSender.addText(message, "to change this password",
                "utf-8",
                "plain");
        messageSender.sendMimeMessage(message);
    }
}
