package com.example.AritonSpicesShop.Condimente.CategorieProduse;

import jakarta.persistence.*;

@Entity
@Table(name = "Categorie", schema = "public")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String denumireProdus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public void setDenumireProdus(String denumireProdus) {
        this.denumireProdus = denumireProdus;
    }
}
