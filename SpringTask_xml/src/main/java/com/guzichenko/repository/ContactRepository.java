package com.guzichenko.repository;

import com.guzichenko.entities.MappedContact;

import java.util.List;


/**
 * Created by Артём on 11.12.2015.
 */

public interface ContactRepository {


    void addContact(MappedContact contact);

    void deleteContact(MappedContact contact);

    List<MappedContact> getAllContact();

    void clearAll();
}
