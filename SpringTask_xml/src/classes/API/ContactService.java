package classes.API;

import classes.Contact;
import java.util.List;

/**
 * Created by Артём on 02.12.2015.
 */

public interface ContactService {

    void init();

    void addContact(Contact contact);

    void deleteContact(Contact contact);

    List<Contact> getAllContacts();

    void clearAll();
}
