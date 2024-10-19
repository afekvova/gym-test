package ua.afek.springmvc.controller;

import ua.afek.springmvc.model.User;
import ua.afek.springmvc.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private GymService gymService;

    public RegisterController() {
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("activePage", "register"); // Highlights the item in the nav bar.
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        // TODO: Add to db...
        return "register_success";
    }
}
