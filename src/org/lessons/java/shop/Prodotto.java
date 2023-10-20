package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    private int codice = randCode();
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;


    public Prodotto(String nome,String descrizione,double prezzo,int iva){
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

//    METODI
    public double prezzoConIva(){

        return prezzo * (100 + iva);

    }
    public String prezzoFormattatoConIva(){
        DecimalFormat format = new DecimalFormat("#.##");

        double prezzoIvato = prezzoConIva();

        return format.format(prezzoIvato);
    }
    public String nomeProdotto(){
        return codice + "-" + nome;
    }


//    GETTER and SETTER

    public int getCodice(){
        return codice;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = Prodotto.this.descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;

    }public int getIva(){
        return iva;
    }

    public void setIva(int iva){
        this.iva = iva;
    }
// Side  metodi
    private int randCode(){
        Random randomNum = new Random();

        return randomNum.nextInt(1,99999999);
    }

}

