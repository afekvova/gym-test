package ua.afek.springmvc.controller;

import ua.afek.springmvc.model.Gym;

import ua.afek.springmvc.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GymController {

    @Autowired
    private GymService gymService;

    @GetMapping("/gym")
    public String showForm(Model model) {
        Gym gym = new Gym();
        model.addAttribute("gym", gym);
        model.addAttribute("activePage", "register");
        return "gym";
    }

    @PostMapping("/gym")
    public String formPosted(@ModelAttribute("gym") Gym gym, Model model) {
        gymService.addGym(gym);
        model.addAttribute("newGymName",  gym.getName());
        return "gym_success";
    }
}
