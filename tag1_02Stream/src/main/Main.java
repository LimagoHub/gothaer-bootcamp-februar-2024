package main;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 1. Stream erzeugen
        // 2. Intermediate Operations
        // 3. Termination



         IntStream.iterate(1,z->z+3).limit(20).forEach(System.out::println);

//
//        var liste = List.of("eins","zwei","drei", "vier");
//
//        Stream<String> myStream = liste.stream();
//                myStream.peek(s-> System.out.println(s))
//                .filter(s->s.endsWith("ei"))
//                .map(s->s.toUpperCase())
//                .forEach(System.out::println);




    }
}