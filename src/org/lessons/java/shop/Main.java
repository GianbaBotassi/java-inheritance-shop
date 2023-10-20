package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
       Prodotto prod1 = new Prodotto("Nutella","Nocciolata gustosa", 3.05,22);
       Prodotto prod2 = new Prodotto("Cioccolato", "Dolcissimo", 2.04,4);
       Prodotto prod3 = new Prodotto("Formaggio", "Stagionato", 1.50, 22);

        System.out.println(prod1.getCodice());
        System.out.println(prod1.getPrezzo());
        System.out.println(prod1.prezzoConIva());
        System.out.println(prod1.prezzoFormattatoConIva());
        System.out.println(prod1.nomeProdotto());
    }
}
