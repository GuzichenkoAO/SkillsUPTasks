package com.guzichenko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Артем on 02.02.2016.
 */

@Controller
public class EnterController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String enter() {
        return "index";
    }

}
