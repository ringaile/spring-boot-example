package com.ringaile.springbootexample.controllers;

import com.ringaile.springbootexample.mail.MailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender;

    public MailController(MailSender smtpMailSender){
        this.mailSender = smtpMailSender;
    }

    @RequestMapping("/mail")
    public String mail(){
        mailSender.send("mail@example.com", "Test mail", "Body of a mail");
        return "Mail sent!";
    }
}
