package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Person p = Person
                .builder()
                .vorname("John")
                .nachname("Doe")
                .ort("Nowhere")
                .build();

        System.out.println( p );
    }
}
