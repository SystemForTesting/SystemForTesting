package com.epam.testsystem.main;

import com.epam.testsystem.util.SmtpMessageSender;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws MessagingException, IOException {
        String smtpHost = "smtp.mail.ru"; //host of smtp mail server
        int smtpPort = 465;               //port of smtp mail server
        String username = "your_username"; //your username e-mail account
        String password = "your_password"; //your password e-mail account

        SmtpMessageSender messageSender = new SmtpMessageSender();
        Session session = messageSender.createSession(smtpHost,
                smtpPort,
                username,
                password);
        MimeMessage message = messageSender.createMimeMessage(session,
                "Test message",
                "from@gmail.com",
                "yakovshmidt93@gmail.com",
                Message.RecipientType.TO);
        messageSender.addText(message, "<Plain text>", "utf-8", "plain");
        messageSender.addText(message,
                "<a href='#'>HTML link</a>",
                "utf-8",
                "html");
//        messageSender.addAttachment(message,
//                new File("./src/main/resources/file.txt"));
//        messageSender.addAttachment(message,
//                new File("./src/main/resources/file.jpg"));
        messageSender.sendMimeMessage(message);
    }
}
