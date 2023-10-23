package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto{
    private String imeiCode = imeiGenerator();
    private int phoneMemory;

    //Costruttori

    public Smartphone(String nome, String descrizione, double prezzo, int iva, int phoneMemory) {
        super(nome, descrizione, prezzo, iva);
        this.phoneMemory = phoneMemory;
    }


    //Metodi

    @Override
    public String toString() {

        return  super.toString() +
                "Smartphone{" +
                "imeiCode='" + imeiCode + '\'' +
                ", phoneMemory=" + phoneMemory +
                '}';
    }

    @Override
    public double scontoFedelta() {
        if(phoneMemory < 32){
            return prezzoConIva() - (prezzoConIva() * 0.05);
        }
        return super.scontoFedelta();
    }
    //Getters and Setters

    public String getImeiCode() {
        return imeiCode;
    }

    public int getPhoneMemory() {
        return phoneMemory;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    // Utility methods

    private String imeiGenerator(){
        Random randImei = new Random();
        return String.format("%015d",randImei.nextInt(1000,9999999));
    }
}
