package com.guzichenko.Controllers;

import com.guzichenko.models.Contact;
import com.guzichenko.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Артем on 25.01.2016.
 */
@Controller
public class ContactController {


    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("contact", "command", new Contact());
    }

    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")Contact contact){
        contactService.addContact(contact);
        return "result";
    }



}
