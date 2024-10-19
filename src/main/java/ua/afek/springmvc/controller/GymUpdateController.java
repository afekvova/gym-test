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
public class GymUpdateController {

    @Autowired
    private GymService gymService;

    @GetMapping("/gym_update")
    public String updateGym(Model model) {
//        var gym = gymService.getGym(79);
//        model.addAttribute("gym", gym);
        return "gym_update";
    }

    @PostMapping("/gym_update")
    public String updateGym(@ModelAttribute("gym") Gym gym, Model model) {
//        gymService.update(gym);
        return "gym_update";
    }
}
