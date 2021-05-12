package com.example.test;

import com.example.dev.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main_test {
    // comprobar que retorne un numero romano
    @Test
    public void check_numRoman() {
        double control, obtenido;
        control = 1;
        obtenido = Main.romanToDecimal("I");
        Assertions.assertEquals(control, obtenido);
    }
    // comprobar que retorne un numero romano si le introducimos un numero en minuscula
    @Test
    public void check_numRoman_toUpperCase() {
        double control, obtenido;
        control = 2;
        obtenido = Main.romanToDecimal("ii");
        Assertions.assertEquals(control, obtenido);
    }
    // comprobar que retorne un numero romano solo que aumente hacia la derecha
    @Test
    public void check_bigger_numRman_right() {
        double control, obtenido;
        control = 23;
        obtenido = Main.romanToDecimal("XXIII");
        Assertions.assertEquals(control, obtenido);
    }
    // comprobar que retorne cualquier numero romano
    @Test
    public void check_all_numRoman() {
        double control, obtenido;
        control = 540;
        obtenido = Main.romanToDecimal("DXL");
        Assertions.assertEquals(control, obtenido);
    }
}
