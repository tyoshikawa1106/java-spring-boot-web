package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class CustomerController {
  
    @RequestMapping("/")
    public String index() {
        return "this is Spring Boot Sample!";
    }
}