package fatec.labvi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    //Declaração comum entre os testes
    Calculadora calculadora = new Calculadora();
    double a = 10.0;
    double b = 5.0;

    //Teste que garante o caso de sucesso do método subtrair da classe Calculadora
    @Test
    public void testCalculadoraSubtracaoSucesso() {
        assertEquals(5.0,calculadora.subtrair(a,b));
    }

    //Teste que garante o caso de falha do método subtrair da classe Calculadora
    @Test
    public void testCalculadoraSubtracaoFalha() {
        assertNotEquals(0,calculadora.subtrair(a,b));
    }
}
