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
        ContactService contactService = (ContactService) context.getBean(ContactServiceImpl.class);
        ContactFactory cf = (ContactFactory) context.getBean(ContactFactory.class);
        cf.setAge("21");
        cf.setName("Artem");
        Contact contact1 = cf.getObject();
        cf.setAge("22");
        cf.setName("Bella");
        Contact contact2 = cf.getObject();

        contactService.addContact(contact1);

        System.out.println(contact1.toString() + " " + contact2.toString());
        System.out.println(contactService.getAllContacts());
        Class c1 = Contact.class;
        System.out.println(c1);


    }

}
