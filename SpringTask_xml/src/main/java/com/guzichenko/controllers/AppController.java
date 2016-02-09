package com.guzichenko.controllers;

import com.guzichenko.models.Contact;
import com.guzichenko.service.ContactService;

import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Артем on 25.01.2016.
 */
@Controller
public class AppController {

    @Autowired
    private ContactService contactService;


    @RequestMapping(value = "/Contact", method = RequestMethod.GET)
    public String contact(Model model) {
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "Contact";

    }

    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact")Contact contact){
        //if(contact.getId() == 0){
            contactService.addContact(contact);
        //}else{
        //   contactService.updateContact(contact);
        //}
        //model.addAttribute("name", contact.getName());
        //model.addAttribute("age", contact.getAge());
        //model.addAttribute("phone", contact.getPhone());
        return "result";
    }

    @RequestMapping(value = "/allContacts", method = RequestMethod.GET)
    public String getAll(ModelMap model){
        List<Contact> list = contactService.getAllContacts();
        model.addAttribute("list", list);
        return "allContacts";
    }

    @RequestMapping(value="/delete/{id}")
    public String deleteContact(@PathVariable("id") long id) {
        contactService.deleteContact(id);
        return "redirect:/allContacts";
    }
    /*
    @RequestMapping("/edit/{id}")
    public String editContact(@PathVariable("id") int id, Model model){
        model.addAttribute("contact", contactService.getContact(id));
        return "Contact";
    }
    */

}
