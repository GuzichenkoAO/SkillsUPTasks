package com.guzichenko.models;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Артём on 11.12.2015.
 */
public class ContactFactory implements FactoryBean<Contact> {

    private String name;
    private String age;

    public ContactFactory(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public Contact getObject() throws Exception {
        Contact contact = new Contact(name, age);
        return contact;
    }

    @Override
    public Class<Contact> getObjectType() {
        return Contact.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
