package org.lessons.java.shop;

public class Tv extends Prodotto{

    //Attributi
    private int dimension;
    private boolean isSmart;

    //Costruttori
    public Tv(String nome, String descrizione, double prezzo, int iva, int dimension, boolean isSmart) {
        super(nome, descrizione, prezzo, iva);
        this.dimension = dimension;
        this.isSmart = isSmart;
    }

    //Methods


    @Override
    public String toString() {
        return  super.toString() +
                "Tv{" +
                "dimension=" + dimension +
                ", isSmart=" + isSmart +
                '}';
    }

    @Override
    public double scontoFedelta() {
        if(!isSmart){
            return prezzoConIva() - (prezzoConIva() * 0.10);
        }
        return super.scontoFedelta();
    }

    //Getters and setters
    public int getDimension() {
        return dimension;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
