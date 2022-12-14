package com.example.demo.repositories;

import com.example.demo.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {

    Optional<Contact> findByContactId(String contactId);

    List<Contact> findByFirstName(String firstName);
}
