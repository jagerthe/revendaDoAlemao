package com.ericzCorp.revenda.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;

import java.util.Set;

import com.ericzCorp.revenda.entities.enums.StatusPedido;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
    private Instant data;

    private Integer statusPedido;

    //@OneToMany(mappedBy = "id.pedido")
    //private Set<Carro> carros = new HashSet<>();

    public Pedido() {

    }

    public Pedido(Long id, Instant data, StatusPedido statusPedido) {
        this.id = id;
        this.data = data;
        setStatusPedido(statusPedido);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    // buscando codigo pelo laco FOR na classe StatusPedido
    public StatusPedido getStatusPedido() {
        return StatusPedido.valueOf(statusPedido);
    }

    // encontrando o codigo pelo obj getCode na classe StatusPedido
    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido.getCodigo();
    }

   // public Set<Carro> getCarros() {
  //      return carros;
  //  }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
    
}
