package com.guzichenko;

import com.guzichenko.models.Contact;
import com.guzichenko.models.ContactFactory;
import com.guzichenko.service.ContactService;
import com.guzichenko.service.impl.ContactServiceImpl;

import com.guzichenko.persistence.HibernateUtil;
import org.hibernate.Session;

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

        cf.setAge("21");
        cf.setName("Artem");
        cf.setPhone("098551122");
        Contact contact1 = cf.getObject();
        cf.setAge("22");
        cf.setName("Bella");
        cf.setPhone("555");
        Contact contact2 = cf.getObject();

        contactService.addContact(contact1);

        System.out.println(contact1.toString() + " " + contact2.toString());
        System.out.println(contactService.getAllContacts());

        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();





    }

}
