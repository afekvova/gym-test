package ua.afek.springmvc.controller;

import ua.afek.springmvc.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private GymService gymService;

    @GetMapping()
    public String home() {
        return "index";
    }
}
