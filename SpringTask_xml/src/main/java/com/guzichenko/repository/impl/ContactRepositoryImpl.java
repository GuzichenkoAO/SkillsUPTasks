package com.guzichenko.repository.impl;

import com.guzichenko.entities.MappedContact;
import com.guzichenko.models.Contact;
import com.guzichenko.repository.ContactRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Артём on 11.12.2015.
 */
@Repository
public class ContactRepositoryImpl implements ContactRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.guzichenko");


    private EntityManager em = entityManagerFactory.createEntityManager();

    public ContactRepositoryImpl() {
    }

    @Override
    @Transactional
    public void addContact(MappedContact contact) {
        em.getTransaction().begin();
        em.persist(contact);
        em.getTransaction().commit();


    }

    @Override
    public void deleteContact(MappedContact contact) {
    }

    @Override
    @Transactional
    public List<MappedContact> getAllContact() {
        return em.createQuery("from com.guzichenko.entities.MappedContact", MappedContact.class).getResultList();

    }

    @Override
    public void clearAll() { }



}
