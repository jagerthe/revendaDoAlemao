package com.ericzCorp.revenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericzCorp.revenda.entities.Distribuidora;
import com.ericzCorp.revenda.repositories.DistribuidoraRepository;

@Service
public class DistribuidoraService {

    @Autowired
    private DistribuidoraRepository repository;

    public List<Distribuidora> findAll() {
		return repository.findAll();
	}

	public Distribuidora findById(Long id) {
		Optional<Distribuidora> d = repository.findById(id);
		return d.get();
	}
    
}
