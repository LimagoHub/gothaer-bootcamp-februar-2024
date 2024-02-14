package application;

import tiere.Schwein;

public class Main {
    public static void main(String[] args) {

        System.out.println(Schwein.getCounter());



        Schwein piggy = new Schwein("Miss Piggy"); // Lokale Variablen
        System.out.println(Schwein.getCounter());

        Schwein babe = new Schwein("Babe"); // Lokale Variablen
        System.out.println(Schwein.getCounter());

    }


}