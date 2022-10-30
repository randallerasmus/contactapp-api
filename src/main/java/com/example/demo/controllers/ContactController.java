package com.example.demo.controllers;

import com.example.demo.models.Contact;
import com.example.demo.repositories.ContactRepository;
import com.example.demo.services.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/contactapi")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ContactService contactService;

    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return contactService.getAllContacts();
    }

}
