package model;

public class Calculadora{
	public float inverso(int x)  throws Exception {
		if(x == 0){
			throw new Exception("Nao e possível realizar divisao por zero!");	
		}
		/*if ( size == 0) {
			throw new EmptyStackException("E necessário inserir um valor para realizar a divisao");
		}*/
		System.out.println("x é " +x);
		System.out.println("resultado é " +((float) 1 )/((float) x));
		return ((float) 1 )/((float) x);
	}	
}