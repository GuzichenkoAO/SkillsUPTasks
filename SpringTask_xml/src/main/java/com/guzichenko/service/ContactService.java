package com.guzichenko.service;

import com.guzichenko.models.Contact;

import java.util.List;

/**
 * Created by Артём on 11.12.2015.
 */

public interface ContactService {

    void addContact(Contact contact);

    void deleteContact(Contact contact);

    List<Contact> getAllContacts();

    void clearAll();


}
