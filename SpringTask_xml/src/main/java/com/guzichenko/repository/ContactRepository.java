package com.guzichenko.repository;

import com.guzichenko.models.Contact;
import java.util.List;

/**
 * Created by Артём on 11.12.2015.
 */

public interface ContactRepository {

    void addContact(Contact contact);

    void deleteContact(Contact contact);

    List<Contact> getAllContact();

    void clearAll();
}
