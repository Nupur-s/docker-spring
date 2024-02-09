package com.dockerpostgres.dockerpostgres.controller;

import com.dockerpostgres.dockerpostgres.entity.People;
import com.dockerpostgres.dockerpostgres.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PeopleController {

    @Autowired
    PeopleService peopleService;
    @GetMapping("/form")
    public String getPeople(){
        return "index";
    }

    @PostMapping("/form")
    public String makeEntry(@ModelAttribute People people, Model model){

        peopleService.saveEntry(people);
        List<People>users = peopleService.getEntries();
        model.addAttribute("user",users);
        return "users";
    }
}
