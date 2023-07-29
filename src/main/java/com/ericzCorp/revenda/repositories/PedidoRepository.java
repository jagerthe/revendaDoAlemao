package com.ericzCorp.revenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericzCorp.revenda.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
