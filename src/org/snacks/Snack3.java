package org.snacks;
/*
Snack3
Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
*/
public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0){
                result += numbers[i];
            }
        }
        System.out.println(result);
    }
}
