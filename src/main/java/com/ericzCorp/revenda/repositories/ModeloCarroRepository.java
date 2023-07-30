package com.ericzCorp.revenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericzCorp.revenda.entities.ModeloCarro;

public interface ModeloCarroRepository extends JpaRepository<ModeloCarro, Long> {
    
}
