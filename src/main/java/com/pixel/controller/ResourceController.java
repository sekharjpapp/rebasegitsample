package com.pixel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/get")
    public String getIndex() {
        return "Get Index";
    }
    public void bugFix() {
        System.out.println("Bug Fix in main");
    }
    public void bugFix2() {
        System.out.println("Bug Fix 2 in main");
    }
    public void bugFix3() {
        System.out.println("Bug Fix 3 in main");
    }
}
