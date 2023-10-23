package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    private final String codice = randCode();
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;


    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //    METODI
    public double prezzoConIva() {

        return prezzo + ((prezzo *  iva)/ 100);
    }
    public String prezzoFormattatoConIva() {
        DecimalFormat format = new DecimalFormat("#.##");

        double prezzoIvato = prezzoConIva();

        return format.format(prezzoIvato);
    }
    public double scontoFedelta() {
        return prezzoConIva() - (prezzoConIva() * 0.02);
    }


    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + codice + '\'' +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }



    public String nomeProdotto() {
        return codice + "-" + nome;
    }


//    GETTER and SETTER

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = Prodotto.this.descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;

    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    // Side  metodi
    private String randCode() {
        Random randomNum = new Random();

        int codice = randomNum.nextInt(1, 1000000000);

        String codFormattato = String.format("%d", codice);

        while (codFormattato.length() < 8) {
            codFormattato = "0" + codFormattato;
        }

//        Con StringBuilder
//        StringBuilder codFormattato = new StringBuilder(String.format("%d", codice));
//
//        while(codFormattato.length() < 8){
//            codFormattato.insert(0, "0");
//        }

        return codFormattato.toString();
    }

}

