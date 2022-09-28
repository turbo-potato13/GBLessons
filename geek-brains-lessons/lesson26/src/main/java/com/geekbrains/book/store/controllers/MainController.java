package com.geekbrains.book.store.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping
    public String showHomePage() {
        return "about-page";
    }

    @GetMapping("/many")
    @ResponseBody
    public String manyParams(@RequestParam MultiValueMap params) {
        return "1";
    }
}
