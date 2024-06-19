package com.example.AritonSpicesShop.api.Produse.dto;

public class ProduseDtoModifica {
    String denumireProdus;
    int bazaPret;
    int tva;
    int pretCuTva;
    long categorieId;

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public void setDenumireProdus(String denumireProdus) {
        this.denumireProdus = denumireProdus;
    }

    public int getPretCuTva() {
        return pretCuTva;
    }

    public void setPretCuTva(int pretCuTva) {
        this.pretCuTva = pretCuTva;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public int getBazaPret() {
        return bazaPret;
    }

    public void setBazaPret(int bazaPret) {
        this.bazaPret = bazaPret;
    }

    public long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(long categorieId) {
        this.categorieId = categorieId;
    }
}
