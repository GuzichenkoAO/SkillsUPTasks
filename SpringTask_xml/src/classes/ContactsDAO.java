package classes;

import classes.API.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.*;

/**
 * Created by Артём on 02.12.2015.
 */
@Repository
public class ContactsDAO implements ContactService {

    int BookSize;
    @Autowired
    List<Contact> list;



    public void setBookSize(int bookSize) {
        BookSize = bookSize;
    }

    public int getBookSize() {
        return BookSize;
    }


    public void init(){
        if (BookSize>list.size())
            BookSize=list.size();
        }


    @Override
    public void addContact(Contact contact) {
        if (list.size()<BookSize)
        list.add(contact);
        else System.out.println("The Book is full");
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
