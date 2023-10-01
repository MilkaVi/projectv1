package com.example.projectv1.controller;

import com.example.projectv1.repo.ItemRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;

@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class HomeController {
    ItemRepository itemRepository;

    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("/items")
    public String secured() {
        return itemRepository.findAll().toString();
    }
}