package com.guzichenko.models;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.FactoryBean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Created by Артём on 11.12.2015.
 */
public class ContactFactoryTest {
    String name;
    String age;

    @Mock
    FactoryBean<Contact> cf;
    @Mock
    Contact contact;

    @Before
    public void setUp() throws Exception {
        name = "name";
        age = "age";
        cf = mock(FactoryBean.class);
        contact = mock(Contact.class);

    }

    @Test
    public void getObjectTest() throws Exception {
        Contact contact1 = mock(Contact.class);
        when(cf.getObject()).thenReturn(contact);

        assertNotNull(contact);
        assertNotEquals(cf.getObject(), contact1);
        assertEquals(contact.toString(),contact1.toString());
    }

    @Test
    public void getObjectTypeTest() throws Exception{
        Class c1= Contact.class;
        when(cf.getObjectType()).thenReturn(c1);
        assertEquals(Contact.class, cf.getObjectType());
    }

    @Test
    public void isSingletonTest(){
        assertEquals(false,cf.isSingleton());
    }




}
