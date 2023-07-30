package com.ericzCorp.revenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericzCorp.revenda.entities.ModeloCarro;
import com.ericzCorp.revenda.repositories.ModeloCarroRepository;

@Service
public class ModeloCarroService {

    @Autowired
    private ModeloCarroRepository repository;

    public List<ModeloCarro> findAll() {
		return repository.findAll();
	}

    public ModeloCarro findById(Long id) {
		Optional<ModeloCarro> mdlc = repository.findById(id);
		return mdlc.get();
	}
    
}
