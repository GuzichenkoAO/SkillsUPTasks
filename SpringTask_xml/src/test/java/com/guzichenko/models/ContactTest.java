package com.guzichenko.models;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


/**
 * Created by Артём on 11.12.2015.
 */
public class ContactTest {
    String name;
    String age;
    @Mock
    Contact contact;

    public ContactTest() {
    }


    @Before
        public void setUp(){
        name = "name";
        age = "age";
        contact = mock(Contact.class);

        when(contact.getAge()).thenReturn(age);
    }

    @Test
    public void testGetName() throws Exception {
        when(contact.getName()).thenReturn(name);
        assertEquals(name, contact.getName());
    }

    @Test
    public void testGetAge() throws Exception {
        when(contact.getAge()).thenReturn(age);
        assertEquals(age, contact.getAge());
    }



}
