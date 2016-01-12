package com.guzichenko.models;

import org.springframework.beans.factory.FactoryBean;



/**
 * Created by Артём on 11.12.2015.
 */
public class ContactFactory implements FactoryBean<Contact> {

    private String name;
    private String age;
    private String phone;

    public ContactFactory(String name, String age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Contact getObject() throws Exception {
        Contact contact = new Contact(name, age, phone);
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
