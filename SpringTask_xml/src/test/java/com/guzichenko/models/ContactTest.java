package com.guzichenko.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


/**
 * Created by Артём on 11.12.2015.
 */
public class ContactTest {
    String name;
    String age;
    Contact contact;

    public ContactTest() {
    }


    @Before
        public void setUp(){
        name = "name";
        age = "age";
        contact = mock(Contact.class);
        when(contact.getName()).thenReturn(name);
        when(contact.getAge()).thenReturn(age);
    }

    @Test
    public void testGetName() throws Exception {

        assertEquals(name, contact.getName());
    }

    @Test
    public void testGetAge() throws Exception {

        assertEquals(age, contact.getAge());
    }



}
