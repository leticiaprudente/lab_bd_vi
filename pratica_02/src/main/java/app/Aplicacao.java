package app;
import model.Calculadora;
import java.math.BigDecimal;

public class Aplicacao{
	public static void main(String [] args){
		Calculadora calc = new Calculadora();
		
		try{
			BigDecimal resultado = calc.inverso(10000);
			System.out.print(resultado);	
		}catch (Exception error){
			error.printStackTrace();	
		}
		
	}
}