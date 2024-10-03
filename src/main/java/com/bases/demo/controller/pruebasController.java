package com.bases.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class pruebasController {

    
    @GetMapping(value = "/")
    public String getMethodName() {
        return "Hola Mundo";
    }
}
