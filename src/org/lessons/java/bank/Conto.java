package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    private final String numeroConto;
    private String nome;
    private double saldo = 0;

    public Conto(String nome) {
        this.numeroConto = randNumConto();
        this.nome = nome;
    }

//METODI

    public void versamentoConto(double valore) {
        saldo = saldo + valore;
    }

    public void prelievoConto(double valore) {
        if (saldo - valore < 0) {
            System.out.println("Puoi prelevare solo " + saldo + "€");

        } else {
            saldo = saldo - valore;
        }
    }


    //GETTER e SETTERS
    public String getNumeroConto() {
        return numeroConto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double saldo() {
        return saldo;
    }

    public String saldoFormattato(){

        return String.format("%.2f",saldo);
    }

//Utility methods

    public String randNumConto(){
        Random randNum = new Random();
        return String.valueOf(randNum.nextInt(1,1001));
    }


}

