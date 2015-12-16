package com.guzichenko.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Артём on 11.12.2015.
 */
public class ContactTest {
    String name = "name";
    String age = "age";
    Contact contact = new Contact(name, age);

    @Test
    public void testGetName() throws Exception {
        contact.setName(name);
        assertEquals(name, contact.getName());
    }

    @Test
    public void testGetAge() throws Exception {
        contact.setAge(age);
        assertEquals(age, contact.getAge());
    }


}
