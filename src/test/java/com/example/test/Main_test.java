package com.example.test;

import com.example.dev.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main_test {

    @Test
    public void check_numRoman() {
        double control, obtenido;
        control = 1;
        obtenido = Main.romanToDecimal("I");
        Assertions.assertEquals(control, obtenido);
    }

    @Test
    public void check_numRoman_ingnoreCase() {
        double control, obtenido;
        control = 2;
        obtenido = Main.romanToDecimal("ii");
        Assertions.assertEquals(control, obtenido);
    }

    @Test
    public void check_only_higher() {
        double control, obtenido;
        control = 23;
        obtenido = Main.romanToDecimal("XXIII");
        Assertions.assertEquals(control, obtenido);
    }

    @Test
    public void check_all_roman() {
        double control, obtenido;
        control = 540;
        obtenido = Main.romanToDecimal("DXL");
        Assertions.assertEquals(control, obtenido);
    }
}
