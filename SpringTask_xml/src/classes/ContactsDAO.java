package classes;

import classes.API.ContactService;

import java.util.*;

/**
 * Created by Артём on 02.12.2015.
 */
public class ContactsDAO implements ContactService {

    List list;

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public void addContact(Contact contact) {
        list.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        list.remove(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return list;
    }

    @Override
    public void clearAll() {
        list.clear();
    }





}
