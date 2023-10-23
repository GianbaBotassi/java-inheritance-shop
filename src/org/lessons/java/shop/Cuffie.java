package org.lessons.java.shop;

public class Cuffie extends Prodotto{

    //Attributi
    private String colore;
    private boolean isWireless;

    //Costruttori
    public Cuffie(String nome, String descrizione, double prezzo, int iva, String colore, boolean isWireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }
    //Metodi


    @Override
    public String toString() {
        return super.toString() +
                "Cuffie{" +
                "colore='" + colore + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }

    //Getters and Setters
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
