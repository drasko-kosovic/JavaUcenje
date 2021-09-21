package com.company;

public class Tv {
  private Daljinski daljinski;
  private Ekran ekran;

     Tv(Daljinski daljinski, Ekran ekran) {
        this.daljinski = daljinski;
        this.ekran = ekran;
    }

    Daljinski getDaljinski() {
        return daljinski;
    }

    private Ekran getEkran() {
        return ekran;
    }
    public void Pritisni(){
         daljinski.PritisniDugme();
    }
}
