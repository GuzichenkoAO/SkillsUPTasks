package com.guzichenko.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Артем on 12.01.2016.
 */
@Entity
@Table(name="contacts")
public class MappedContact {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO )
        @Column(name ="id")
        private Long id;


        @Column(name = "name")
        private String name;
        @Column
        private String phone;
        @Column
        private String age;


        public MappedContact() {
        }

        public MappedContact(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public MappedContact(String name, String age, String phone) {
            this.name = name;
            this.phone = phone;
            this.age = age;
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

        public Long getId() {
        return id;
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
            return  name +
                    " " + age +
                    " " + phone;
        }
    }

