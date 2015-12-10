package classes;

import classes.API.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Артём on 02.12.2015.
 */
@Repository
@Service
public class ContactsDAO implements ContactService {

    @Autowired
    private List<Contact> list;



    public void setList(List list) {
        this.list = list;
    }


    @Override
    public void init() {

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
