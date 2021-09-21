package com.company;

public class Vozila {

    private String vrsta_vozila;
    private int broj_brzina;

    public Vozila(String vrsta_vozila, int broj_brzina) {
        this.vrsta_vozila = vrsta_vozila;
        this.broj_brzina = broj_brzina;
    }

    public String getVrsta_vozila() {
        return vrsta_vozila;
    }

    public void setVrsta_vozila(String vrsta_vozila) {
        this.vrsta_vozila = vrsta_vozila;
    }

    public int getBroj_brzina() {
        return broj_brzina;
    }

    public void setBroj_brzina(int broj_brzina) {
        this.broj_brzina = broj_brzina;
    }

    @Override
    public String toString() {
        return "Vozila{" +
                "vrsta_vozila='" + vrsta_vozila + '\'' +
                ", broj_brzina=" + broj_brzina +
                '}';
    }

    public Vozila() {
    }

    public String Stani(){
      return  "staje ";

    }


}
