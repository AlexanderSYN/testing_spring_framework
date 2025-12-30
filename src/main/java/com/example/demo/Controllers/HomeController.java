package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная Страница");
        return "home";
    }

    @GetMapping("/next")
    public String next(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("title", "след страницы");
        return "next";
    }
}
