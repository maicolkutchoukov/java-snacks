package org.snacks;

import java.util.Scanner;

/*
Snack1
Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
*/
public class Snack1 {
    public static void main(String[] args) {
        System.out.print("Inserisci un numero:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println(n);
        } else {
            System.out.println(n+1);
        }
    }
}
