package com.ericzCorp.revenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericzCorp.revenda.entities.ListaCarrosRevenda;
import com.ericzCorp.revenda.repositories.ListaCarrosRepository;

@Service
public class CarroRevendaService {

    @Autowired
    private ListaCarrosRepository repository;

    public List<ListaCarrosRevenda> findAll() {
		return repository.findAll();
	}

	// retrieve
	public ListaCarrosRevenda findById(Long id) {
		Optional<ListaCarrosRevenda> cv = repository.findById(id);
		return cv.get();
	}
    
}
