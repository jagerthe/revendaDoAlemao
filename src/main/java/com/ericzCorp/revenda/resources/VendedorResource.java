package com.ericzCorp.revenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericzCorp.revenda.entities.Vendedor;
import com.ericzCorp.revenda.services.VendedorServices;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorResource {

    @Autowired
    public VendedorServices service;

    @GetMapping
    public ResponseEntity<List<Vendedor>> findAll() {
        List<Vendedor> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Vendedor> findById(@PathVariable Long id) {
        Vendedor v = service.findById(id);
        return ResponseEntity.ok().body(v);
    }
    
}
