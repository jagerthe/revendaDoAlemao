package com.ericzCorp.revenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericzCorp.revenda.entities.Loja;
import com.ericzCorp.revenda.services.LojaServices;

@RestController
@RequestMapping(value = "/lojas")
public class LojaResource {

    @Autowired
    private LojaServices service;

    @GetMapping
    public ResponseEntity<List<Loja>> findAll() {
        List<Loja> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Loja> findById(@PathVariable Long id) {
        Loja l = service.findById(id);
        return ResponseEntity.ok().body(l);
    }
    
}
