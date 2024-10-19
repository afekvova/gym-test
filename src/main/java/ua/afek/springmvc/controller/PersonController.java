package ua.afek.springmvc.controller;

import ua.afek.springmvc.service.DataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    private DataAccess dataAccess;

    public PersonController() {}

    @GetMapping("/person")
    public String displayPeople(Model model) {
        var peopleList = dataAccess.getPeople();
        model.addAttribute("people", peopleList);
        model.addAttribute("activePage", "person"); // Highlights the item in the nav bar.
        return "people";
    }
}
