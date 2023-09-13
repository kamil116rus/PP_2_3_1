package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.servise.UserServise;

import javax.validation.Valid;


@Controller
@RequestMapping("/")
public class UserController {
    private final UserServise userServise;


    @Autowired
    public UserController(UserServise userServise) {
        this.userServise= userServise;
    }

    @GetMapping
    public String table(Model model ){
        model.addAttribute("users", userServise.getAllUsers());
        return "table";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userServise.getUserById(id));
        return "user";
    }

    @GetMapping("/new")
    public String create(User user) {
        return "create";
    }

    @PostMapping("/new")
    public String create(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            userServise.addUser(user);
        }
        return "redirect:/";
    }



}
