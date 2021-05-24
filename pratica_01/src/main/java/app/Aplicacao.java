package app;
import model.Calculadora;

public class Aplicacao{
	public static void main(String [] args){
		Calculadora calc = new Calculadora();
		
		try{
			float resultado = calc.inverso(0);
			System.out.print(resultado);	
		}catch (Exception error){
			error.printStackTrace();	
		}
		
	}
}