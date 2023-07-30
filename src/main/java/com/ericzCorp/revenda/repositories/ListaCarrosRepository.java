package com.ericzCorp.revenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericzCorp.revenda.entities.ListaCarrosRevenda;

public interface ListaCarrosRepository extends JpaRepository<ListaCarrosRevenda, Long> {
    
}
