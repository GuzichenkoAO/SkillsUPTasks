package com.guzichenko.service.impl;

import com.guzichenko.entities.MappedContact;
import com.guzichenko.models.Contact;
import com.guzichenko.repository.ContactRepository;
import com.guzichenko.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Артём on 11.12.2015.
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    MappedContact mc;

    public ContactServiceImpl() {
    }

    @Override
    public void addContact(Contact contact) {
        mc.setName(contact.getName());
        mc.setAge(contact.getAge());
        mc.setPhone(contact.getPhone());
        contactRepository.addContact(mc);

    }

    @Override
    public void deleteContact(Contact contact) {
        contactRepository.deleteContact(mc);
    }

    @Override
    public List<Contact> getAllContacts() {
        List<MappedContact> mappedContacts = contactRepository.getAllContact();
        List<Contact> contacts = new ArrayList<>(mappedContacts.size());
        for (MappedContact mc: mappedContacts){
            Contact contact = new Contact();
            contact.setName(mc.getName());
            contact.setPhone(mc.getPhone());
            contact.setAge(mc.getAge());
            contacts.add(contact);
        }
        return contacts;
    }

    @Override
    public void clearAll() {

    }
}
