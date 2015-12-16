package com.guzichenko.repository;

import com.guzichenko.repository.impl.ContactRepositoryImpl;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Артём on 11.12.2015.
 */
public class ContactRepositoryTest {

    ContactRepositoryImpl contactRepository = new ContactRepositoryImpl();

    @Test
    public void getAllContactsTest(){
        assertEquals(ArrayList.class, contactRepository.getAllContact().getClass());
    }

}
