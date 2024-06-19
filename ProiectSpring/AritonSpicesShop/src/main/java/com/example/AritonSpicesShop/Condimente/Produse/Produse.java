package com.example.AritonSpicesShop.Condimente.Produse;

import jakarta.persistence.*;

@Entity
@Table (name = "Produse", schema = "public")
public class Produse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String denumireProdus;
    int bazaPret;
    int tva;
    int pretCuTva;
    Long categorieId;

    public long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(long categorieId) {
        this.categorieId = categorieId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public void setDenumireProdus(String denumireProdus) {
        this.denumireProdus = denumireProdus;
    }

    public int getBazaPret() {
        return bazaPret;
    }

    public void setBazaPret(int bazaPret) {
        this.bazaPret = bazaPret;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public int getPretCuTva() {
        return pretCuTva;
    }

    public void setPretCuTva(int pretCuTva) {
        this.pretCuTva = pretCuTva;
    }
}
