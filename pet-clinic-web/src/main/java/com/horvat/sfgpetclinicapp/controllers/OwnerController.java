package com.horvat.sfgpetclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path ="/owners")
@Controller
public class OwnerController {

    @RequestMapping(path = {"", "/", "/index", "/index.html"})
    public String listVets(){
        return "owners/index";
    }
}
