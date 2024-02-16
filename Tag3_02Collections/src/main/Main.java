package main;

import tiere.Schwein;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Schwein> comparator = Comparator.comparing(Schwein::getName);

        Set<Schwein> data = new HashSet<>();

        data.add(new Schwein("Eins", 12));
        data.add(new Schwein("Eins", 14));
        data.add(new Schwein("Zwei", 12));
        data.add(new Schwein("Drei", 30));
        data.add(new Schwein("Vier",20));
        data.add(new Schwein("Vier",12));
        data.add(new Schwein("Fünf", 5));

        data.forEach(System.out::println);


    }
}