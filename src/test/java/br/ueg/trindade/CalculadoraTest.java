package br.ueg.trindade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Caso de testes 1 - Somar 2 + 2")
    void somar2Mais2() {
        int resultado = calculadora.somar(2, 2);
        assertEquals(4, resultado);
    }

    @Test
    @DisplayName("Caso de testes 2 - Subtrair 10 - 4")
    void subtrair10Menos4() {
        int resultado = calculadora.subtrair(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    @DisplayName("Caso de testes 3 - Multiplicar 3 x 4")
    void multiplicar3Vezes4() {
        int resultado = calculadora.multiplicar(3, 4);
        assertEquals(12, resultado);
    }

    @Test
    @DisplayName("Caso de testes 4 - Dividir 10 / 2")
    void dividir10Por2() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Caso de testes 5 - Dividir por zero lança erro")
    void dividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}