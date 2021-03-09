package com.krist.tjforestry.controller;


import com.krist.tjforestry.model.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {
    @RequestMapping("/contacts")
    public String contactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contacts";
    }

    @PostMapping("/contacts")
    @ResponseBody
    public String contactSubmit(@ModelAttribute Contact contact, Model model) {
        model.addAttribute("contact", contact);
        return "Paldies par Jūsu ziņojumu, tuvākajā laikā sazināsimies ar Jums";
    }


}
