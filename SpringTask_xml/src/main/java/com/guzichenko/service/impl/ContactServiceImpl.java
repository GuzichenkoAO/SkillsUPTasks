package com.guzichenko.service.impl;

import com.guzichenko.entities.MappedContact;
import com.guzichenko.models.Contact;
import com.guzichenko.repository.ContactRepository;
import com.guzichenko.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Артём on 11.12.2015.
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Qualifier("contactRepositoryImpl")
    @Autowired
    private ContactRepository contactRepository;


    @Autowired
    MappedContact mc;


    public ContactServiceImpl() {
    }

    @Override
    @Transactional
    public void addContact(Contact contact) {
        mc.setName(contact.getName());
        mc.setAge(contact.getAge());
        mc.setPhone(contact.getPhone());
        contactRepository.addContact(mc);
    }

    @Override
    @Transactional
    public void updateContact(Contact contact){
        mc.setId(contact.getId());
        mc.setName(contact.getName());
        mc.setAge(contact.getAge());
        mc.setPhone(contact.getPhone());
        contactRepository.updateContact(mc);
    }

    @Override
    @Transactional
    public void deleteContact(long id) {
        contactRepository.deleteContact(id);
    }

    @Override
    @Transactional
    public Contact getContact(long id){
        Contact contact = new Contact();
        mc = contactRepository.selectContact(id);
        contact.setId(mc.getId());
        contact.setName(mc.getName());
        contact.setAge(mc.getAge());
        contact.setPhone(mc.getPhone());
        return contact;
    }

    @Override
    @Transactional
    public List<Contact> getAllContacts() {
        List<MappedContact> mappedContacts = contactRepository.getAllContact();
        List<Contact> contacts = new ArrayList<>(mappedContacts.size());
        for (MappedContact mc: mappedContacts){
            Contact contact = new Contact();
            contact.setId(mc.getId());
            contact.setName(mc.getName());
            contact.setPhone(mc.getPhone());
            contact.setAge(mc.getAge());
            contacts.add(contact);
        }
        return contacts;
    }

    @Override
    @Transactional
    public void clearAll() {
        contactRepository.clearAll();
    }
}
