package classes;

import classes.conf.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by Артём on 02.12.2015.
 */
public class MainApp {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ContactsDAO contactsDAO = context.getBean(ContactsDAO.class);

        System.out.println(contactsDAO.getAllContacts());




    }

}
