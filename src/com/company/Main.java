package com.company;

public class Main {
    private static String bojaNova="zuta";
    public static void main(String[] args) {
	    Car porse=new Car("putnicki","crna");
	    porse.setBoja("zelena");
        System.out.println("auto je " + porse.toString());
        System.out.println("Boja je "+ porse.getBoja());
        System.out.println("Nova boja je iz main clase "+ bojaNova);
        porse.Startuj("brzo");

        Car fiat =new Car();
        fiat.setBoja("siva");
        System.out.println("Boja Fiata je "+ fiat.getBoja());
        Car golf=new Car();
        System.out.println("Brzina golfa je sada  "+golf.Brzina(30));


    }

}
