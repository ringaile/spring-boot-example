package com.ringaile.springbootexample.controllers;

import com.ringaile.springbootexample.mail.MailSender;
import com.ringaile.springbootexample.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender;

    public MailController(@Qualifier("smtp") MailSender smtp){
        this.mailSender = smtp;
    }

    @RequestMapping("/mail")
    public String mail(){
        mailSender.send("mail@example.com", "Test mail", "Body of a mail");
        return "Mail sent!";
    }
}
