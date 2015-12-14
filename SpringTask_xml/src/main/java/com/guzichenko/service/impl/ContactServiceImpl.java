package com.guzichenko.service.impl;

import com.guzichenko.models.Contact;
import com.guzichenko.repository.ContactRepository;
import com.guzichenko.repository.impl.ContactRepositoryImpl;
import com.guzichenko.service.ContactService;

import java.util.List;

/**
 * Created by Артём on 11.12.2015.
 */
public class ContactServiceImpl implements ContactService {

    ContactRepository contactRepository = new ContactRepositoryImpl();

        @Override
    public void addContact(Contact contact) {
        contactRepository.addContact(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contactRepository.deleteContact(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.getAllContact();
    }

    @Override
    public void clearAll() {
        contactRepository.clearAll();
    }
}
