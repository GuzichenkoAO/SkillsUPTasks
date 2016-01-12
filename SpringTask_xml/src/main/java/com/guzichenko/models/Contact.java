package com.guzichenko.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Артём on 11.12.2015.
 */


public class Contact implements Serializable{


    private String name;
    private String phone;
    private String age;


    public Contact() {
    }

    public Contact(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Contact(String name, String age, String phone) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }



    @Override
    public String toString() {
        return  name + " " + age + " "+ phone;
    }
}
