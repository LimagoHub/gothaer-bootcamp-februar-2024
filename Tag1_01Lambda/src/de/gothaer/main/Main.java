package de.gothaer.main;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

       new Main().run();

    }

    private void run() {
        Consumer<Integer> result = createConsumer();
        result.accept(10);
    }

    private Consumer<Integer> createConsumer() {

        int x = 20;

        Consumer<Integer> consumer = value -> {value += x; System.out.println(value);} ;



        return consumer;
    }


}


