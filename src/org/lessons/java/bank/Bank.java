package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci il tuo nome per la creazione del conto.");
        String nome = scanner.nextLine();

        Conto conto1 = new Conto(nome);

        System.out.printf("Il conto n.%s intestato a %s è stato creato!\n", conto1.getNumeroConto(), conto1.getNome());

        boolean login = true;

        while (login) {

            System.out.println("Digita: \n" +
                    "1 per versare una somma di denaro \n" +
                    "2 per prelevare una somma di denaro \n" +
                    "3 per uscire");
            int digit = scanner.nextInt();
            scanner.nextLine();

            if (digit == 1) {
                System.out.println("Inserisci la cifra che vuoi versare sul tuo conto.");
                double sommaDaVersare = scanner.nextInt();
                scanner.nextLine();
                conto1.versamentoConto(sommaDaVersare);
                System.out.printf("Il tuo saldo è pari a %s€.%n", conto1.saldoFormattato());
            } else if (digit == 2) {
                System.out.println("Inserisci la cifra che vuoi prelevare dal tuo conto.");
                double sommaDaPrelevare = scanner.nextInt();
                scanner.nextLine();
                conto1.prelievoConto(sommaDaPrelevare);
                System.out.printf("Il tuo saldo è pari a %s€.%n", conto1.saldoFormattato());
            } else if (digit == 3) {
                System.out.println("Arrivederci.");
                login = false;
            } else {
                System.out.println("Il numero inserito è errato.");
            }

        }
    }
}
