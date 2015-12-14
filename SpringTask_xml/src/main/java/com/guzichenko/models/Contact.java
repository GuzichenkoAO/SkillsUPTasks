package com.guzichenko.models;

/**
 * Created by Артём on 11.12.2015.
 */
public class Contact {

    private String name;
    private String age;

    public Contact() {
    }

    public Contact(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  name + " " + age ;
    }
}
