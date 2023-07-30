package com.ericzCorp.revenda.entities;

import java.io.Serializable;

import com.ericzCorp.revenda.entities.pk.CarroMontadoPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_carromontado")
public class MonteSeuCarro implements Serializable {
    private static final long serialVersionUID = 1L;

    // embeddedId = setar o atributo chave composta
    @EmbeddedId
    private CarroMontadoPK id = new CarroMontadoPK();

    public MonteSeuCarro() {

    }

    public MonteSeuCarro(OpcoesCarro opcoesCarro, ModeloCarro modeloCarro, Distribuidora distribuidora) {
        super();
        id.setOpcoesCarro(opcoesCarro);
        id.setModeloCarro(modeloCarro);
        id.setDistribuidora(distribuidora);
    }

    public CarroMontadoPK getId() {
        return id;
    }

    public void setId(CarroMontadoPK id) {
        this.id = id;
    }

    public OpcoesCarro getOpcoesCarro() {
        return id.getOpcoesCarro();
    }

    public void setOpcoesCarro(OpcoesCarro opcoesCarro) {
        id.setOpcoesCarro(opcoesCarro);
    }

    public ModeloCarro getModeloCarro() {
        return id.getModeloCarro();
    }

    public void setModeloCarro(ModeloCarro modeloCarro) {
        id.setModeloCarro(modeloCarro);
    }

    public Distribuidora geDistribuidora() {
        return id.getDistribuidora();
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        id.setDistribuidora(distribuidora);
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
        MonteSeuCarro other = (MonteSeuCarro) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    

}