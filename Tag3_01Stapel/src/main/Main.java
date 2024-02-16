package main;

import collections.Stapel;
import collections.StapelException;
import geo.Kreis;
import geo.Punkt;
import tiere.Schwein;

public class Main {
    public static void main(String[] args) throws StapelException {

        Stapel<Punkt> stapel = new Stapel<Punkt>(40);

        for (int i = 0; i < 10; i++) {
            if(!stapel.isFull()) {
                stapel.push(new Punkt(i,i));
                stapel.push(new Kreis(i,i,5));
                //stapel.push(new Schwein("Schwein Nr." + i));
                //stapel.push(i);
            }
        }

        while(!stapel.isEmpty()) {
            Punkt p = stapel.pop();
            p.rechts();
            System.out.println(p);
        }

    }
}