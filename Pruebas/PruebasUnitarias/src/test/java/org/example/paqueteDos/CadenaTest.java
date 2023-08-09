package org.example.paqueteDos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadenaTest {

    private Cadena cadena;

    @BeforeEach

    public void setUp (){
        Cadena cadena = new Cadena();
        this.cadena = cadena;
    }

    @Test

    public void registrarClienteCorrecto () {
        String nombreCorrecto = "Camilo Orozco";
        String contrasenaCorrecta = "password";
        String contrasenaCorrectaDos = "password";

      Boolean resultado = cadena.registrarCliente(nombreCorrecto, contrasenaCorrecta,contrasenaCorrectaDos);
      Assertions.assertTrue(resultado);
      Assertions.assertDoesNotThrow(()->cadena.registrarCliente(nombreCorrecto,contrasenaCorrecta,contrasenaCorrectaDos));
      Assertions.assertEquals(true, resultado);
    }

}