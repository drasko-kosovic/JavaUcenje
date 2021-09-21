package com.company;

public class Autobus extends Vozila{

    private int broj_sjedista;

    public Autobus(String vrsta_vozila, int broj_brzina, int broj_sjedista) {
        super(vrsta_vozila, broj_brzina);
        this.broj_sjedista = broj_sjedista;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "broj_sjedista=" + broj_sjedista +
                '}';
    }

    @Override
    public String Stani() {
        return "stao je";
    }

}
