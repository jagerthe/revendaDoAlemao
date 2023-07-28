package com.ericzCorp.revenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericzCorp.revenda.entities.Loja;

public interface LojaRepository extends JpaRepository<Loja, Long>{
    
}
