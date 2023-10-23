package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean login = true;

        Prodotto[] database = new Prodotto[10];
        int databaseCounter = 0;

        while(login) {
            System.out.println("Digita il numero di ciò che vuoi inserire oppure esci\n" +
                    "1 - Smartphone\n" +
                    "2 - Tv\n" +
                    "3 - Cuffie\n" +
                    "4 - Esci dal programma");
            String choice = scanner.nextLine();
            if(choice.equals("4")){
                login = false;
            }else{

            System.out.println("Inserisci il nome del prodotto");
            String nomeProdotto = scanner.nextLine();
            System.out.println("Inserisci la descrizione");
            String descrizione = scanner.nextLine();
            System.out.println("Inserisci il prezzo");
            double prezzo = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Inserisci l'iva");
            int iva = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case "1":
                    System.out.println("Inserisci la memoria massima");
                    int memory = scanner.nextInt();
                    scanner.nextLine();
                    Smartphone smartphone = new Smartphone(nomeProdotto, descrizione, prezzo, iva, memory);
                    database[databaseCounter] = smartphone;
                    databaseCounter++;
                    System.out.println("Smartphone inserito.");
                    break;
                case "2":
                    System.out.println("Inserisci la dimensione in pollici");
                    int dimensione = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci true se è Smart e false se non lo è");
                    boolean smart = scanner.nextBoolean();
                    scanner.nextLine();
                    Tv tv = new Tv(nomeProdotto, descrizione, prezzo, iva, dimensione,smart);
                    database[databaseCounter] = tv;
                    databaseCounter++;
                    System.out.println("Tv inserita.");
                    break;
                case "3":
                    System.out.println("Inserisci il colore delle cuffie");
                    String colore = scanner.nextLine();
                    System.out.println("Inserisci se sono wireless true altrimenti false");
                    boolean wireless = scanner.nextBoolean();
                    scanner.nextLine();
                    Cuffie cuffie = new Cuffie(nomeProdotto, descrizione, prezzo, iva, colore, wireless);
                    database[databaseCounter] = cuffie;
                    databaseCounter++;
                    break;
                default:
                    System.out.println("invalida selezione, riseleziona un prodotto.");
            }
            }
        }
        if(database != null){
            System.out.println("I prodotti che hai inserito sono: ");
                    for (Prodotto product: database
                         ) {
                        if(product != null){
                        System.out.println(product.toString());
                        }
                    }
        }

        scanner.close();
    }
}
