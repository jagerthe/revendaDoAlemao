package com.ericzCorp.revenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericzCorp.revenda.entities.ModeloCarro;
import com.ericzCorp.revenda.services.ModeloCarroService;

@RestController
@RequestMapping(value = "/modelocarros")
public class ModeloCarroResource {
    
    @Autowired
    private ModeloCarroService service;

    @GetMapping
	public ResponseEntity<List<ModeloCarro>> findAll() {
		List<ModeloCarro> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}

    @GetMapping(value = "/{id}")
	public ResponseEntity<ModeloCarro> findById(@PathVariable Long id) {
		ModeloCarro mdlc = service.findById(id);
		return ResponseEntity.ok().body(mdlc);
	}
}
