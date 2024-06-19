package com.example.AritonSpicesShop.api.Produse.dto;

public class ProduseCategorieDto {


    String numeProdus;
    String numeCategorie;

    public ProduseCategorieDto(String numeProdus, String numeCategorie) {
        this.numeProdus = numeProdus;
        this.numeCategorie = numeCategorie;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public String getNumeCategorie() {
        return numeCategorie;
    }

    public void setNumeCategorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
    }
}

