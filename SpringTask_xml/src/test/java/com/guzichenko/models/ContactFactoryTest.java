package com.guzichenko.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Артём on 11.12.2015.
 */
public class ContactFactoryTest {
    String name = "name";
    String age = "age";

    ContactFactory cf = new ContactFactory(name,age);
    Contact contact = new Contact(name,age);

    @Test
    public void getObjectTest() throws Exception {
        Contact contact1 = cf.getObject();
        assertNotNull(contact1);
        assertNotEquals(contact, contact1);
        assertEquals(contact.toString(),contact1.toString());
    }

    @Test
    public void getObjectTypeTest(){

        assertEquals(contact.getClass(),cf.getObjectType());
    }

    @Test
    public void isSingletonTest(){
        assertEquals(false,cf.isSingleton());
    }




}
