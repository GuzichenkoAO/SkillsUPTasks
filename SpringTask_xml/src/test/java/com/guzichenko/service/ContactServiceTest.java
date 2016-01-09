package com.guzichenko.service;

import com.guzichenko.models.Contact;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Артём on 13.12.2015.
 */
public class ContactServiceTest {

    @Mock
    ContactService contactService;

    @Before
    public void setUp() throws Exception {
        contactService = mock(ContactService.class);
    }

    @Test
    public void getAllContactsTest(){
        ArrayList<Contact> list = mock(ArrayList.class);
        when(contactService.getAllContacts()).thenReturn(list);
        assertEquals(list, contactService.getAllContacts());

    }
    @Test
    public void clearAllTest(){

        assertEquals(0, contactService.getAllContacts().size());

    }


}
