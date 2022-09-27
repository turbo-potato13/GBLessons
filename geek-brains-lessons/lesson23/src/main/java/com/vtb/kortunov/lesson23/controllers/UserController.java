package com.vtb.kortunov.lesson23.controllers;

import com.vtb.kortunov.lesson23.entities.User;
import com.vtb.kortunov.lesson23.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @GetMapping("/all")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "all_users";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        userService.saveOrUpdateUser(user);
        return "redirect:/users/all";
    }

    @GetMapping("/edit/{id}")
    public String showEditUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "user-edit-page";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute User user) {
        userService.saveOrUpdateUser(user);
        return "redirect:/users/all";
    }

    @GetMapping("/remove/{id}")
    public String removeUser(@PathVariable Long id) {
        userService.removeUser(id);
        return "redirect:/users/all";
    }
}
