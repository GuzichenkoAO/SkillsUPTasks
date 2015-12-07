package classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Артём on 02.12.2015.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        ContactsDAO contactsDAO = (ContactsDAO) context.getBean("contactsDAO");
        System.out.println(contactsDAO.getAllContacts());
        Contact contact = (Contact) context.getBean("fiofan");
        contactsDAO.addContact(contact);
        System.out.println(contactsDAO.getAllContacts());

    }

}
