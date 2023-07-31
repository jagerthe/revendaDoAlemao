package com.ericzCorp.revenda.entities.pk;

import java.io.Serializable;

import com.ericzCorp.revenda.entities.Distribuidora;
import com.ericzCorp.revenda.entities.ModeloCarro;
import com.ericzCorp.revenda.entities.OpcoesCarro;
import com.ericzCorp.revenda.entities.Pedido;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


//embeddable = projetar dados e ser embutida em outra classe
@Embeddable
public class CarroMontadoPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "opcaocarro_id")
    private OpcoesCarro opcoesCarro;

    @ManyToOne
    @JoinColumn(name = "modelocarro_id")
    private ModeloCarro modeloCarro;

    @ManyToOne
    @JoinColumn(name = "distribuidora_id")
    private Distribuidora distribuidora;
    
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public OpcoesCarro getOpcoesCarro() {
        return opcoesCarro;
    }

    public void setOpcoesCarro(OpcoesCarro opcoesCarro) {
        this.opcoesCarro = opcoesCarro;
    }

    public ModeloCarro getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(ModeloCarro modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((opcoesCarro == null) ? 0 : opcoesCarro.hashCode());
        result = prime * result + ((modeloCarro == null) ? 0 : modeloCarro.hashCode());
        result = prime * result + ((distribuidora == null) ? 0 : distribuidora.hashCode());
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
        CarroMontadoPK other = (CarroMontadoPK) obj;
        if (opcoesCarro == null) {
            if (other.opcoesCarro != null)
                return false;
        } else if (!opcoesCarro.equals(other.opcoesCarro))
            return false;
        if (modeloCarro == null) {
            if (other.modeloCarro != null)
                return false;
        } else if (!modeloCarro.equals(other.modeloCarro))
            return false;
        if (distribuidora == null) {
            if (other.distribuidora != null)
                return false;
        } else if (!distribuidora.equals(other.distribuidora))
            return false;
        return true;
    }

    
    
}
