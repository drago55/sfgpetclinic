package com.horvat.sfgpetclinicapp.controllers;

import com.horvat.sfgpetclinicapp.services.VetServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetServices vetServices;

    public VetController(VetServices vetServices) {
        this.vetServices = vetServices;
    }

    @RequestMapping(path = {"", "/", "/index", "/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetServices.findAll());
        return "vets/index";
    }

}
