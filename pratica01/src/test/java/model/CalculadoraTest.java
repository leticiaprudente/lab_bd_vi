package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest{
	
	/*@Test
	public void inversoTest() throws Exception {
		Calculadora calc = new Calculadora();
		float resultado = calc.inverso(2);
		assertEquals(0.5, resultado);
	}*/
	
	@Test
	public void inversoTestZero(){
	/*	
		Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
                Calculadora calc = new Calculadora();
				float resultado = calc.inverso(0);
            }
    );
 
    assertEquals("Nao e possível realizar divisao por zero", exception.getMessage()); 
	*/	
		try {
			Calculadora calc = new Calculadora();
			float resultado = calc.inverso(0);
			Fail("O teste falhou");
		} 
		catch (Exception error) {
			assertEquals( "Nao e possível realizar divisao por zero!", error.getMessage());
		}

	}
	
	/*@Test
	public void inversoTestNegativo(){
		Calculadora calc = new Calculadora();
		float resultado = calc.inverso(-2);
		assertEquals(-0.5, resultado);
	}*/
	
}
