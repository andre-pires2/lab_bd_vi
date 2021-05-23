package fatec.labvi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    //Declaração comum entre os testes
    Calculadora calculadora = new Calculadora();

    //Teste com valor 0
    @Test
    public void subtracaoComZero() {
        assertEquals(0f,calculadora.subtrair(0f, 0f), 0.01f);
    }

    //Teste com valor proximo ao valor limite positivo inferior
    @Test
    public void subtracaoComValorLimitePositivoInferior() {
        assertEquals(0.01f,calculadora.subtrair(0.11f, 0.1f), 0.01f);
    }

    //Teste com valor proximo ao valor limite positivo superior
    @Test
    public void subtracaoComValorLimitePositivoSuperior() {
        assertEquals(0.01f,calculadora.subtrair(99.99f,99.98f), 0.01f);
    }

    //Teste com valor proximo ao valor limite negativo inferior
    @Test
    public void subtracaoComValorLimiteNegativoInferior() {
        assertEquals(-0.01f,calculadora.subtrair(-0.11f,-0.1f), 0.01f);
    }

    //Teste com valor proximo ao valor limite negativo superior
    @Test
    public void subtracaoComValorLimiteNegativoSuperior() {
        assertEquals(-0.01f,calculadora.subtrair(-99.99f,-99.98f), 0.01f);
    }
}
