package main;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    private static final String FILENAME ="C:/Windows/Logs/ReAgent/ReAgent.log";
    public static void main(String[] args) {

      new Main().run();
    }

    private void run() {

        try {
            Path path = Paths.get(FILENAME);
//            Stream<String> lines = Files.lines(path);
//
//            String result = lines.collect(Collectors.joining("\n"));
//
//            Map<Character, Long> endResult = result.chars().mapToObj(c->Character.valueOf((char)c))
//                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//            endResult.forEach((key, value)->System.out.printf("Buchstabe '%s' kommt %s mal vor\n",key, value));

            Files
                    .lines(path)
                    .collect(Collectors.joining("\n"))
                    .chars()
                    .mapToObj(c->Character.valueOf((char)c))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                    forEach((key, value)->System.out.printf("Buchstabe '%s' kommt %s mal vor\n",key, value));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// Collectors.groupingBy(s->s.getName(), Collectors.sum(s->s.getGewicht())))
    }


    private boolean isPrime(int possiblePrime) {
        for(int i = 2; i <= possiblePrime/2; i++) {
            if(possiblePrime%i==0) return false;
        }
        return true;
    }
}

class Schwein {
    private String name;
    private int gewicht;
}
