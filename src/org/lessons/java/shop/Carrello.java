package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Flag per tornare all'inserimento finchè non si decide di uscire
        boolean login = true;

        //Array di prodotti settato a 10
        Prodotto[] database = new Prodotto[10];
        //counter per incrementare ogni volta l'iterazione ad un nuovo prodotto
        int databaseCounter = 0;
        // flag carta fedeltà
        boolean isLoyalCustomer = false;

        //Richiesta se in possesso di carta fedeltà
        System.out.println("Digita 1 se hai la carta fedeltà?");
        int fidelityCard = Integer.parseInt(scanner.nextLine());

        if(fidelityCard == 1){
            isLoyalCustomer = true;
            System.out.println("Hai la carta fedeltà.");
        }else{
            System.out.println("Non hai la carta fedeltà.");
        }

        //inizia ciclo di inserimento prodotti
        while(login) {
            System.out.println("Digita il numero di ciò che vuoi inserire oppure esci\n" +
                    "1 - Smartphone\n" +
                    "2 - Tv\n" +
                    "3 - Cuffie\n" +
                    "4 - Esci dal programma");
            String choice = scanner.nextLine();

            //Selezione per uscire e stampare ciò che si ha inserito
            if(choice.equals("4")){
                login = false;
            }else if(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")){
                System.out.println("Errato inserimento, seleziona un prodotto valido.");
            }
            else{

            System.out.println("Inserisci il nome del prodotto");
            String nomeProdotto = scanner.nextLine();
            System.out.println("Inserisci la descrizione");
            String descrizione = scanner.nextLine();
            System.out.println("Inserisci il prezzo");
            double prezzo = Double.parseDouble(scanner.nextLine());
            System.out.println("Inserisci l'iva");
            int iva = Integer.parseInt(scanner.nextLine());

            //Switch per selezione inserimento prodotti
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
        double total =0;
        if(databaseCounter != 0) {
            System.out.println("I prodotti che hai inserito sono: ");
                    for (Prodotto product: database
                         ) {
                        if(product != null){
                            if(isLoyalCustomer){
                                total += product.scontoFedelta();
                            }else{
                            total += product.prezzoConIva();
                            }
                        System.out.println(product);
                        }
                    }
            System.out.printf("Il totale è pari a: %.2f",total );
        }else{
            System.out.println("Non hai inserito prodotti, arrivederci.");
        }

        scanner.close();
    }
}
