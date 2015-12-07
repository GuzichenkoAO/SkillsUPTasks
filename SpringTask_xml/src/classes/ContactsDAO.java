package classes;

import classes.API.ContactService;

import java.util.*;

/**
 * Created by Артём on 02.12.2015.
 */
public class ContactsDAO implements ContactService {
    int BookSize;
    List list;

    public void setBookSize(int bookSize) {
        BookSize = bookSize;
    }

    public void setList(List list) {
        this.list = list;
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
