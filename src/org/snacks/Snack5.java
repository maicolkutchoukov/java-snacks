package org.snacks;
/*
* Snack5
Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
Continuare a chiedere una nuova stringa finchè non si inserisce 0.

* */
import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caratteriAlfabetici = 0;
        int numeri = 0;
        int simboli = 0;
        while (true) {
            System.out.print("Inserisci una stringa (digita 0 per terminare): ");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                System.out.println("Programma terminato.");
                break;
            }

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    caratteriAlfabetici++;
                } else if (Character.isDigit(c)) {
                    numeri++;
                } else {
                    simboli++;
                }
            }
        }
        System.out.println("Caratteri alfabetici: " + caratteriAlfabetici);
        System.out.println("Numeri: " + numeri);
        System.out.println("Simboli non alfanumerici: " + simboli);
        scanner.close();
    }
}
