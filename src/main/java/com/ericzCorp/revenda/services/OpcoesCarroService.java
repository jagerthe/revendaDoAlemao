package com.ericzCorp.revenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericzCorp.revenda.entities.OpcoesCarro;
import com.ericzCorp.revenda.repositories.OpcoesCarroRepository;

@Service
public class OpcoesCarroService {

    @Autowired
    private OpcoesCarroRepository repository;

    public List<OpcoesCarro> findAll() {
        return repository.findAll();
    }

    public OpcoesCarro findById(Long id) {
        Optional<OpcoesCarro> opc = repository.findById(id);
        return opc.get();
    }
    
}
