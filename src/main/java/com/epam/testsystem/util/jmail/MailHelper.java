package com.epam.testsystem.util.jmail;

import com.epam.testsystem.model.User;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

public class MailHelper {

    public static void sendEmail(Session session, User user, String userPassword) throws MessagingException, IOException {
        SmtpMessageSender messageSender = new SmtpMessageSender();
        MimeMessage message = messageSender.createMimeMessage(session,
                "Hello, " + user.getUsername(),
                "systemfortesting2015@gmail.com",
                user.getEmail(),
                Message.RecipientType.TO);
        messageSender.addText(message, "Your username: " + user.getUsername(), "utf-8", "plain");
        messageSender.addText(message, "Your password: " + userPassword, "utf-8", "plain");
        messageSender.addText(message,
                "<a href='http://localhost:8080/testsystem/login.do'>Go to main page</a>",
                "utf-8",
                "html");
        messageSender.sendMimeMessage(message);
    }
}
