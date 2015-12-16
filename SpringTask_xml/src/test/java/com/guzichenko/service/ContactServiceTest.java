package com.guzichenko.service;

import com.guzichenko.service.impl.ContactServiceImpl;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Артём on 13.12.2015.
 */
public class ContactServiceTest {

    ContactService contactService = new ContactServiceImpl();

    @Test
    public void getAllContactsTest(){
        assertEquals(ArrayList.class, contactService.getAllContacts().getClass());

    }
    @Test
    public void clearAllTest(){
        assertEquals(0, contactService.getAllContacts().size());

    }


}
