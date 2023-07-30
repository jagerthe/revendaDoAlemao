package com.ericzCorp.revenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericzCorp.revenda.entities.OpcoesCarro;
import com.ericzCorp.revenda.services.OpcoesCarroService;

@RestController
@RequestMapping(value = "/opcoescarros")
public class OpcoesCarroResource {

    @Autowired
    private OpcoesCarroService service;

    @GetMapping
    public ResponseEntity<List<OpcoesCarro>> findAll() {
        List<OpcoesCarro> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OpcoesCarro> findById(@PathVariable Long id) {
        OpcoesCarro opc = service.findById(id);
        return ResponseEntity.ok().body(opc);
    }
    
}
