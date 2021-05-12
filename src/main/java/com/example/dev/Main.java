package com.example.dev;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("v2");
    }

    // funcion que convierta numero romano valido a decimal
    public static double romanToDecimal(String numRomano) {
        double resultado = 0, number = 0;
        // clave - valor
        Map<Character, Integer> romanos = new HashMap<>();
        romanos.put('I', 1);
        romanos.put('V', 5);
        romanos.put('X', 10);
        romanos.put('L', 50);
        romanos.put('C', 100);
        romanos.put('D', 500);
        romanos.put('M', 1000);

        // TRANSFORMAR EL STRING INGRESADOO A MAYUSCULAS
        String roman = numRomano.toUpperCase();
        // XIX
        for(int i=0; i<roman.length(); i++) {
            double numberNow = romanos.get(roman.charAt(i));

            if(number == 0) {
                number = numberNow;
                continue;
            }
            // CADA VEZ QUE EL NUMERO ANTERIOR ES MENOR QUE EL NUMERO
            if(number < numberNow) {
                number = -number;
            }

            resultado += number;
            number = numberNow;
        }

        return resultado + number;
    }
}
