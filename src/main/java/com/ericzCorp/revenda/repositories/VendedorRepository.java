package com.ericzCorp.revenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericzCorp.revenda.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
    
}
