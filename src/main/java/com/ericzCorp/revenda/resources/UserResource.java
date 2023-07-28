package com.ericzCorp.revenda.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericzCorp.revenda.entities.Vendedor;

@RestController
@RequestMapping(value = "/vendedores")
public class UserResource {

    @GetMapping
    public ResponseEntity<Vendedor> findAll(){
        Vendedor v = new Vendedor(1L, "Eric", "60138685061");
        return ResponseEntity.ok().body(v);
    }
    
}
