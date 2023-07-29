package com.ericzCorp.revenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericzCorp.revenda.entities.Vendedor;
import com.ericzCorp.revenda.repositories.VendedorRepository;

@Service
public class VendedorServices {
    
    @Autowired
    private VendedorRepository repository;

    public List<Vendedor> findAll() {
        return repository.findAll();
    }

    public Vendedor findById(Long id) {
        Optional<Vendedor> v = repository.findById(id);
        return v.get();
    } 
}
