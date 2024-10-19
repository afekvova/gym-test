package ua.afek.springmvc.controller;

import ua.afek.springmvc.service.DataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonInfoController {

    @Autowired
    private DataAccess dataAccess;

    @GetMapping("/person_info")
    public String getPersonInfo(@RequestParam(name="id", required = true) int id, Model model) {
        var person = dataAccess.findPerson(id);
        model.addAttribute("person", person);
        return "person_info";
    }
}
