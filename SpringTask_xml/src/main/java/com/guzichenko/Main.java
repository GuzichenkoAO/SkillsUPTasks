package com.guzichenko;

import com.guzichenko.models.Contact;
import com.guzichenko.models.ContactFactory;
import com.guzichenko.service.ContactService;
import com.guzichenko.service.impl.ContactServiceImpl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by GuzichenkoAO on 11.12.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ContactService contactService =  context.getBean(ContactServiceImpl.class);
        ContactFactory cf = context.getBean(ContactFactory.class);
        cf.setAge("35");
        cf.setName("Vasya");
        cf.setPhone("03");
        Contact contact1 = cf.getObject();
        cf.setAge("22");
        cf.setName("Bella");
        cf.setPhone("555");
        Contact contact2 = cf.getObject();

        contactService.addContact(contact1);

        contactService.getAllContacts().forEach(System.out::println);



    }

}
