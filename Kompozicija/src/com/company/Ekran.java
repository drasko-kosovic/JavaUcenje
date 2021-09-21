package com.company;

public class Ekran {


    private Dimenzije dimenzije;
    private String rezolucija;

    public Ekran(Dimenzije dimenzije, String rezolucija) {
        this.dimenzije = dimenzije;
        this.rezolucija = rezolucija;
    }

    public Dimenzije getDimenzije() {
        return dimenzije;
    }

    public String getRezolucija() {
        return rezolucija;
    }
}
