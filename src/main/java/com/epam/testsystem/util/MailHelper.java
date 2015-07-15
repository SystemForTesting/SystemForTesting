package com.epam.testsystem.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.logging.Logger;

@Service
public class MailHelper {

    public static void sendEmail(Session session, String userEmail) throws MessagingException, IOException {

        SmtpMessageSender messageSender = new SmtpMessageSender();
        MimeMessage message = messageSender.createMimeMessage(session,
                "Change password",
                "systemfortesting2015@gmail.com",
                userEmail,
                Message.RecipientType.TO);
        messageSender.addText(message, "Change your password", "utf-8", "plain");
        messageSender.addText(message,
                "<a href='#'>HTML link</a>",
                "utf-8",
                "html");
        messageSender.sendMimeMessage(message);
        System.out.println("DONE!");
    }
}
