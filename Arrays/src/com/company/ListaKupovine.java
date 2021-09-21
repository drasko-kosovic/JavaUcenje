package com.company;

import java.util.ArrayList;

public class ListaKupovine {

    ArrayList<String> lista= new ArrayList<String>();

     public void dodajArtikal(String artikal){
         lista.add(artikal);
         System.out.println(lista);
     }

    public void obrisiArtikal(int broj){
        lista.remove(broj);
        System.out.println(lista);
    }
}
