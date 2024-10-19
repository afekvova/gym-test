package ua.afek.springmvc.controller;

import java.util.Random;
import java.util.random.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "Marty") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("randomNumber",new Random().nextInt(3) + 1);
        model.addAttribute("activePage", "greeting");
        return "greeting";
    }
}
