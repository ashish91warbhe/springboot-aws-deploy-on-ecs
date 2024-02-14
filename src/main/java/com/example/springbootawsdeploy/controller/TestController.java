package com.example.springbootawsdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Data")
public class TestController {
   @GetMapping
    public String getData(){
       return "Messege from Ecs";
   }
}
