package com.guzichenko.repository.impl;

import com.guzichenko.models.Contact;
import com.guzichenko.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Артём on 11.12.2015.
 */
public class ContactRepositoryImpl implements ContactRepository {

    ArrayList<Contact> list = new ArrayList<>();

    @Override
    public void addContact(Contact contact) {
        list.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        list.remove(contact);

    }

    @Override
    public List<Contact> getAllContact() {
        return list;
    }

    @Override
    public void clearAll() {
        list.clear();
    }



}
