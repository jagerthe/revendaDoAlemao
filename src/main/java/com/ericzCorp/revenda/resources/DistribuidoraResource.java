package com.ericzCorp.revenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericzCorp.revenda.entities.Distribuidora;
import com.ericzCorp.revenda.services.DistribuidoraService;

@RestController
@RequestMapping(value = "/distribuidoras")
public class DistribuidoraResource {

    @Autowired
    private DistribuidoraService service;

    @GetMapping
	public ResponseEntity<List<Distribuidora>> findAll() {
		List<Distribuidora> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Distribuidora> findById(@PathVariable Long id) {
		Distribuidora d = service.findById(id);
		return ResponseEntity.ok().body(d);
	}
    
}
