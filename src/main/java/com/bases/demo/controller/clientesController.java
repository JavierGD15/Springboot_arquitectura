package com.bases.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bases.demo.model.clientesModel;
import com.bases.demo.service.clientesService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/clientes")
public class clientesController {
    
    @Autowired
    private clientesService service;

    @GetMapping("/")
    public Iterable<clientesModel> getClientes() {
        return this.service.findAll();
    }
    
}
