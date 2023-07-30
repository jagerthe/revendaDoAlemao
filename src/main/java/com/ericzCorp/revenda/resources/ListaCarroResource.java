package com.ericzCorp.revenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericzCorp.revenda.entities.ListaCarrosRevenda;
import com.ericzCorp.revenda.services.CarroRevendaService;

@RestController
@RequestMapping(value = "/carros")
public class ListaCarroResource {
    
    @Autowired
    private CarroRevendaService service;

    @GetMapping
	public ResponseEntity<List<ListaCarrosRevenda>> findAll() {
		List<ListaCarrosRevenda> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ListaCarrosRevenda> findById(@PathVariable Long id) {
		ListaCarrosRevenda cv = service.findById(id);
		return ResponseEntity.ok().body(cv);
	}
}
