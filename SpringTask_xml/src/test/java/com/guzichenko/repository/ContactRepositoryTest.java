package com.guzichenko.repository;

import com.guzichenko.models.Contact;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Артём on 11.12.2015.
 */
public class ContactRepositoryTest {

    @Mock
    ContactRepository contactRepository;

    @Before
    public void setUp() throws Exception {
        contactRepository = mock(ContactRepository.class);
    }

    @Test
    public void getAllContactsTest(){
        ArrayList<Contact> list = mock(ArrayList.class);
        when(contactRepository.getAllContact()).thenReturn(list);
        assertEquals(list, contactRepository.getAllContact());
    }

}
