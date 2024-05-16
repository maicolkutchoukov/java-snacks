package org.snacks;
/*
Snack 6
Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
Possibile usare solo :
cicli
chartAt
if / switch
Es. “25" come stringa deve essere convertito in intero 25.*/
import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        String userString;

        System.out.print("Inserisci un numero: ");
        userString = scanner.nextLine();

        int result = 0, pos = 1;
        for (int i = userString.length()-1; i >= 0; i--) {
            result += (userString.charAt(i) - '0') * pos;
            pos *= 10;
        }

        System.out.println(result + result);

        // Close Scanner
        scanner.close();
    }
}
