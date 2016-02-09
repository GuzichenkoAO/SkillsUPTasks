package com.guzichenko.repository.impl;

import com.guzichenko.entities.MappedContact;
import com.guzichenko.repository.ContactRepository;

import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

/**
 * Created by Артём on 11.12.2015.
 */

@Repository
public class ContactRepositoryImpl implements ContactRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public void addContact(MappedContact contact) {
        em.persist(contact);
    }

    @Override
    @Transactional
    public void updateContact(MappedContact contact){
        em.merge(contact);
    }

    @Override
    @Transactional
    public void deleteContact(long id) {
        em.remove(em.find(MappedContact.class, id));
    }

    @Override
    @Transactional
    public List<MappedContact> getAllContact() {
        return em.createQuery("from com.guzichenko.entities.MappedContact", MappedContact.class).getResultList();

    }
    @Override
    @Transactional
    public MappedContact selectContact(long id) {
        return em.find(MappedContact.class, id);
    }

    @Override
    @Transactional
    public void clearAll(){
    em.clear();
    }






}
