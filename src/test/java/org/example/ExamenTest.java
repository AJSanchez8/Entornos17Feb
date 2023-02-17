package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ExamenTest {

    @org.junit.jupiter.api.Test
    void ej9() {

         assertEquals(1000,Examen.ej9('N',1000,1)); //Espera que sea 16,0 y no cambia el sueldo
         assertEquals(1001,Examen.ej9('E',1001,1)); // Espera que sea 33,36 y no cambia el sueldo
         assertNotEquals(1000,Examen.ej9('R',1000,1)); // No hay valor de R, por lo que falla
         assertEquals(1000*0.5,Examen.ej9('N',1000,0)); //Error porque los meses es igual a 0
         assertNotEquals(999, Examen.ej9('N',999,1));



    }
}