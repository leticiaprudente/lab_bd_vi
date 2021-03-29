package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculadoraTest{
	
	@Test
	public void inversoTest() throws Exception {
		Calculadora calc = new Calculadora();
		float resultado = calc.inverso(2);
		assertEquals(0.5, resultado);
	}
	
	@Test
	public void inversoTestNegativo() throws Exception {
		Calculadora calc = new Calculadora();
		float resultado = calc.inverso(-4);
		assertEquals(-0.25, resultado);
	}
	
	@Test
	public void inversoTestZero() {
		try {
			Calculadora calc = new Calculadora();
			float resultado = calc.inverso(0);
			fail("O teste falhou");
		} 
		catch (Exception error) {
			assertEquals( "Nao e possível realizar divisao por zero!", error.getMessage());
		}

	}	

}
