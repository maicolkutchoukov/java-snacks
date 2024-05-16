package org.snacks;

import java.util.Arrays;
import java.util.Random;

/*
* Snack2
Generatore di “nomi cognomi” casuali:
il Grande Gatsby ha una lista di nomi e una lista di cognomi,
e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
 */
public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"Francesco", "Alessio", "Luigi", "Marco", "Leonardo", "Andrea", "Giacomo", "Fabrizio", "Tommaso", "Camilla"};
        String[] surnames = {"Rossi", "Bianchi", "Verdi", "Giorgi", "Arancioni", "Viola", "Grigio", "Ferri", "Dari", "Sonno"};
        Random randomGenerator = new Random();
        String[] persons = new String[10];
        for (int i = 0; i < persons.length; i++) {
            int randomNumOne = randomGenerator.nextInt(names.length);
            int randomNumTwo = randomGenerator.nextInt(surnames.length);
            persons[i] = names[randomNumOne] + ' ' + surnames[randomNumTwo];
        }
        System.out.println(Arrays.toString(persons));

    }
}
