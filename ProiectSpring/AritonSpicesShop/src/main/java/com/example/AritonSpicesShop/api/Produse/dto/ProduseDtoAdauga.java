package com.example.AritonSpicesShop.api.Produse.dto;

import jakarta.validation.constraints.NotBlank;

public class ProduseDtoAdauga {
    @NotBlank(message = "Trebuie completat numele produsului")
    String denumireProdus;
    int bazaPret;
    int tva;
    int pretCuTva;
    Long categorieId;

    public @NotBlank(message = "Trebuie completat numele produsului") String getDenumireProdus() {
        return denumireProdus;
    }

    public void setDenumireProdus(@NotBlank(message = "Trebuie completat numele produsului") String denumireProdus) {
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

    public long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
    }
}
