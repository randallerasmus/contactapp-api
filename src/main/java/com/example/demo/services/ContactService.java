package com.example.demo.services;

import com.example.demo.models.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAllContacts();

    void addContact (Contact contact);

    void updateContact(Contact contact, String contactId);

    void deleteContact(String contactId);
}
