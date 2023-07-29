package com.ericzCorp.revenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericzCorp.revenda.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
