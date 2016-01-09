package com.guzichenko.models;

/**
 * Created by Артём on 11.12.2015.
 */

public class Contact {

    private Long id;


    private String name;
    private String phone;
    private String age;


    public Contact() {
    }

    public Contact(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
