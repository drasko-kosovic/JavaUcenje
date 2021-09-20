package com.company;

public class Car implements IVozila {

    private  String model;
    private String boja;

    public Car(String model, String boja) {
        this.model = model;
        this.boja = boja;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Car() {
    }

    public String getBoja() {
        return boja;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", boja='" + boja + '\'' +
                '}';
    }
   public void Startuj(String tempo){
       System.out.println("Auto je krenuo   " + tempo);
   }



    @Override
    public Integer Brzina(Integer brzina) {

        return brzina;
    }

}
