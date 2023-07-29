package com.ericzCorp.revenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericzCorp.revenda.entities.Cliente;
import com.ericzCorp.revenda.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    public ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente findById(Long id) {
        Optional<Cliente> c = repository.findById(id);
        return c.get();

    }
}
