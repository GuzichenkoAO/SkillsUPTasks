package com.guzichenko.controllers;
import com.guzichenko.models.Contact;
import com.guzichenko.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Артем on 25.01.2016.
 */
@Controller
public class AppController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/newContact", method = RequestMethod.GET)
    public ModelAndView contact() {
        return new ModelAndView("newContact", "contact", new Contact());
    }

    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact")Contact contact, Model model){
        contactService.addContact(contact);
        model.addAttribute("name", contact.getName());
        model.addAttribute("age", contact.getAge());
        model.addAttribute("phone", contact.getPhone());
        return "result";
    }

    @RequestMapping(value = "/allContacts", method = RequestMethod.GET)
    public String getAll(Model model){
        List<Contact> list = contactService.getAllContacts();
        model.addAttribute("list", list);
        return "allContacts";
    }



}
