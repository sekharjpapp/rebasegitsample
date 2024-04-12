package com.pixel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/get")
    public String getIndex() {
        return "Get Index";
    }
    public void feature2() {
        System.out.println("todo ");
    }
    public void feature3() {
        System.out.println("todo ");
    }
    public void feature4() {
        System.out.println("todo 4");
    }
}
