package com.ericzCorp.revenda.entities;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_carros")
public class ListaCarrosRevenda implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCarro;
    private String marcaCarro;
    private String modeloCarro;
    private int anoModelo;
    private String carroceria;
    private double motor;
    private String transmissao;
    private String cor;
    private Double valor;

    //mostrar os carros disponiveis somente na loja
    //e nao mostrar as lojas nos carros disponiveis
    @ManyToOne
    @JoinColumn(name = "loja_id")
    private Loja revenda;

    public ListaCarrosRevenda() {

    }

    public ListaCarrosRevenda(Long id, String nomeCarro, String marcaCarro, String modeloCarro, int anoModelo,
            String carroceria, double motor, String transmissao, String cor, double valor, Loja revenda) {
        this.id = id;
        this.nomeCarro = nomeCarro;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoModelo = anoModelo;
        this.carroceria = carroceria;
        this.motor = motor;
        this.transmissao = transmissao;
        this.cor = cor;
        this.valor = valor;
        this.revenda = revenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Loja getRevenda() {
        return revenda;
    }

    public void setRevenda(Loja revenda) {
        this.revenda = revenda;
   }

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
        ListaCarrosRevenda other = (ListaCarrosRevenda) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
