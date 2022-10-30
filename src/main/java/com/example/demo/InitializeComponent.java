package com.example.demo;

import com.example.demo.models.Contact;
import com.example.demo.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitializeComponent {
   @Autowired
   private ContactRepository contactRepository;

    @PostConstruct
    private void init(){

        Contact contact1 = new Contact();
        contact1.setName("Cristiano");
        contact1.setLastname("Ronaldo");
        contact1.setContactNumber("0723647689");
        contactRepository.save(contact1);

    }
}
