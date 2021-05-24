package model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class CalculadoraTest{
	
	@Test
	public void inversoTest() throws Exception {
		Calculadora calc = new Calculadora();
		BigDecimal resultado = calc.inverso(2);
		assertEquals(0.5, resultado);
	}
/*
	@Test
	public void inversoTestValidoSuperior() throws Exception {
		Calculadora calc = new Calculadora();
		BigDecimal resultado = calc.inverso(10000);
		assertEquals(0.0001, resultado);
	}

	@Test
	public void inversoTestValidoInferior() throws Exception {
		Calculadora calc = new Calculadora();
		BigDecimal resultado = calc.inverso(1);
		assertEquals(1, resultado);
	}

	@Test
	public void inversoTestInvalidoSuperior() throws Exception {
		try { 
			Calculadora calc = new Calculadora();
			BigDecimal resultado = calc.inverso(100001);
			fail("O teste falhou");
		}
		catch (Exception error) {
			assertEquals("O valor inserido esta fora do limite esperado", error.getMessage());
		}

	}
		
	@Test
	public void inversoTestZero() {
		try {
			Calculadora calc = new Calculadora();
			BigDecimal resultado = calc.inverso(0);
			fail("O teste falhou");
		} 
		catch (Exception error) {
			assertEquals( "Nao e possível realizar divisao por zero!", error.getMessage());
		}

	}

*/
}
