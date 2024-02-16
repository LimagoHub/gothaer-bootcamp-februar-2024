package org.example;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private String vorname;
    private String nachname;
    private String ort;

}
