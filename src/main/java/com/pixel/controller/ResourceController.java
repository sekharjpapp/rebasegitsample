package com.pixel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/get")
    public String getIndex() {
        return "Get Index";
    }
}
