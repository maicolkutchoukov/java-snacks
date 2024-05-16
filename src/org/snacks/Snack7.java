package org.snacks;

import java.util.Scanner;

/*Snack 7
Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi
e mostri a video la stringa generata (secondi → “hh:mm:ss”)*/
public class Snack7 {
    public static void main(String[] args) {
        int inputSeconds, hh = 0, mm, ss;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i secondi da convertire:");
        inputSeconds = scanner.nextInt();
        mm = inputSeconds / 60;
        ss = inputSeconds - (mm*60);
        if (mm >= 60){
            hh = mm / 60;
            mm = mm - (hh*60);
        }
        String strHh = hh < 10 ? "0" + hh : String.valueOf(hh);
        String strMm = mm < 10 ? "0" + mm : String.valueOf(mm);
        String strSs = ss < 10 ? "0" + ss : String.valueOf(ss);

        System.out.println("La conversione di " + inputSeconds + " secondi è di: " + strHh + ":" + strMm + ":" + strSs);


    }
}
