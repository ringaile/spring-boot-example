package com.ringaile.springbootexample.controllers;

import com.ringaile.springbootexample.mail.MailSender;
import com.ringaile.springbootexample.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailSender mailSender;

    @RequestMapping("/mail")
    public String mail(){
        mailSender.send("mail@example.com", "Test mail", "Body of a mail");
        return "Mail sent!";
    }
}