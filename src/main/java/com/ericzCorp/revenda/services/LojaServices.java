package com.ericzCorp.revenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericzCorp.revenda.entities.Loja;
import com.ericzCorp.revenda.repositories.LojaRepository;

@Service
public class LojaServices {

    @Autowired
    private LojaRepository repository;

    public List<Loja> findAll() {
        return repository.findAll();
    }
    
}
