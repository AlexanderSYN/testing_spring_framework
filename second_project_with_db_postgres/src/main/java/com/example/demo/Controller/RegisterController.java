package com.example.demo.Controller;

import com.example.demo.DB.User;
import com.example.demo.Repository_db.UserRepository;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    private final UserRepository userRepository;

    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String register() {
        return "accounts/register";
    }

    @PostMapping("/register/user")
    public String handleForm(@RequestParam("name") String name,
                             @RequestParam("surname") String surname,
                             @RequestParam("patronomyc") String patronomyc,
                             @RequestParam("email") String email,
                             @RequestParam(value = "confirmed_email", defaultValue = "false") boolean confirmed_email,
                             @RequestParam("password") String password,
                             Model model) {


        User user = new User(name, surname, patronomyc, email, confirmed_email, password);
        userRepository.save(user);

        model.addAttribute("name", name);

        return "accounts/success";
    }


}
