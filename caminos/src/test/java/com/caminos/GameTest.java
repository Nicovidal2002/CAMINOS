package com.caminos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GameTest {
    @Test
    public void obtenerDivisores10() throws Exception { // prueba 1

        byte n = 10;
        String resultadoEsperado = "1 2 5 10"; // Divisores de 10: 1, 2, 5 y 10

        String resultadoObtenido = new Game().obtenerDivisores(n);

        // Assert (Verificar)
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void obtenerDivisores17() throws Exception { // prueba 1

        byte n = 17;
        String resultadoEsperado = "1 17";

        String resultadoObtenido = new Game().obtenerDivisores(n);

        // Assert (Verificar)
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void obtenerDivisores1() throws Exception { // prueba 1

        byte n = 1;
        String resultadoEsperado = "1";

        String resultadoObtenido = new Game().obtenerDivisores(n);

        // Assert (Verificar)
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void ObtenerDivisoresZero() {
        Game game = new Game();
        Exception e = assertThrows(Exception.class, () -> game.obtenerDivisores((byte) 0));
        assertTrue(e.getMessage().contains("Error. El número tiene que ser >0 y <=127"));
    }
    @Test
    public void ObtenerDivisoresNegativo() {
        Game game = new Game();
        Exception e = assertThrows(Exception.class, () -> game.obtenerDivisores((byte) -1));
        assertTrue(e.getMessage().contains("Error. El número tiene que ser >0 y <=127"));
    }
}
