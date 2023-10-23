package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
//
    Smartphone ciao = new Smartphone("cighi", "bello tanto", 100, 0, 66);
    Tv hello = new Tv("LG", "molto grande", 100, 0, 26, true);
    Cuffie steelSeries = new Cuffie("Steel Series", "non vanno più", 100, 0, "white", true);
//
        System.out.println(ciao);
        System.out.println(ciao.prezzoConIva());
        System.out.println(ciao.scontoFedelta());
        System.out.println(hello.prezzoConIva());
        System.out.println(hello.scontoFedelta());
        System.out.println(steelSeries.prezzoConIva());
        System.out.println(steelSeries.scontoFedelta());
//        System.out.println(ciao);
//        System.out.println(hello);
//        System.out.println(steelSeries);

    }
}
