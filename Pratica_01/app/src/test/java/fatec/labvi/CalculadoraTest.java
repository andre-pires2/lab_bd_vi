package fatec.labvi;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Before
    Calculadora calculadora = new Calculadora();

    @Test
    public void testCalculadoraSubtracao() {
        int a = 10;
        int b = 5;

        assertEquals(5,calculadora.subtrair(a,b));
    }
}
