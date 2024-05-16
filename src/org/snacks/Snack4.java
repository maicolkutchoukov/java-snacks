package org.snacks;

import java.util.Scanner;

/*
*Snack4
Data in input una stringa verificare se è palindroma
* ITOPINONAVEVANONIPOTI *
**/
public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa:");
        String str = scanner.nextLine();
        StringBuilder str2 = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(i);
            str2.append(str.charAt(i));
        }
        if (str.contentEquals(str2)){
            System.out.println("La parola inserita è palindroma");
        } else {
            System.out.println("La parola inserita non è palindroma");
        }
        System.out.println(str2);
    }
}
