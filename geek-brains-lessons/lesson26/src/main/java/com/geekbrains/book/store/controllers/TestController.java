package com.geekbrains.book.store.controllers;

import com.geekbrains.book.store.entities.Test;
import com.geekbrains.book.store.repositories.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final TestRepository testRepository;

    @GetMapping
    public void getAllDocuments() {
        Test test = new Test(1L, "stat", "data", LocalDateTime.MIN, LocalDateTime.MAX);
        testRepository.save(test);
    }

    @PostMapping
    public void add(){
        Test test = new Test(1L, "stat", "data", LocalDateTime.MIN, LocalDateTime.MAX);
        testRepository.save(test);
    }
}