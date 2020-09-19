package com.horvat.sfgpetclinicapp.controllers;

import com.horvat.sfgpetclinicapp.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path ="/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping(path = {"", "/", "/index", "/index.html"})
    public String listVets(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
