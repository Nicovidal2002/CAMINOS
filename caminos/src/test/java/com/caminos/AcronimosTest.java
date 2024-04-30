package com.caminos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AcronimosTest {

    @Test
    public void obterAcronimo_SingleWord_ReturnsFirstLetter() {
        Acronimos acronimos = new Acronimos();
        String resultado = acronimos.obterAcronimo("Hola");
        assertEquals("H.", resultado);
    }

    @Test
    public void obterAcronimo_MultipleWords_ReturnsFirstLetters() {
        Acronimos acronimos = new Acronimos();
        String resultado = acronimos.obterAcronimo("Hola mundo");
        assertEquals("H.m.", resultado);
    }

    @Test
    public void obterAcronimo_EmptyString_ReturnsEmptyString() {
        Acronimos acronimos = new Acronimos();
        String resultado = acronimos.obterAcronimo("");
        assertEquals("", resultado);
    }

    @Test
    public void obterAcronimo_NullString_ReturnsEmptyString() {
        Acronimos acronimos = new Acronimos();
        String resultado = acronimos.obterAcronimo("");
        assertEquals("", resultado);
    }
}


