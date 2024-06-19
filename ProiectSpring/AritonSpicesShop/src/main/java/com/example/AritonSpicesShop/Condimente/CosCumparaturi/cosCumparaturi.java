package com.example.AritonSpicesShop.Condimente.CosCumparaturi;

import jakarta.persistence.*;

@Entity
@Table(name = "CosCumparaturi", schema = "public")
public class cosCumparaturi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cosId;
    int produsId;

    public int getCosId() {
        return cosId;
    }

    public void setCosId(int cosId) {
        this.cosId = cosId;
    }

    public int getProdusId() {
        return produsId;
    }

    public void setProdusId(int produsId) {
        this.produsId = produsId;
    }
}
