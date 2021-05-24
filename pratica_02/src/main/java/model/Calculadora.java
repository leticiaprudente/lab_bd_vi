package model;
import java.math.BigDecimal;

public class Calculadora{
	public BigDecimal inverso(int x)  throws Exception {
		//FASE VERDE 2
		/*if(x == 0){ 
			throw new Exception("Nao e possivel realizar divisao por zero!");	
		}
		else if(x>=1 && x<=10000){
			BigDecimal y = new BigDecimal(x);
			BigDecimal um = new BigDecimal(1);
			BigDecimal retorno = um.divide(y); 
			System.out.println(retorno); 	
			return retorno ;
		}
		else{
			throw new Exception("O valor inserido esta fora do limite esperado");	
		}*/

		return ((float) 1 ) / ((float) x) ; 
	}	
}