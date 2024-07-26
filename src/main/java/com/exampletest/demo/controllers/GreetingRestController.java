package com.exampletest.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {
        System.out.println("Solicitud ejecutada");
        return "Hello " + name;
    }

}
