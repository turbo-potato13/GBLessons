package com.vtb.kortunov.lesson23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Navigation {
    @GetMapping("/")
    public String showProducts() {
        return "navigation";
    }
}
