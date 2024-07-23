package aula_introducao;

import java.util.Random;

public class ExemploRandom {

	public static void main(String[] args) {
		Random r = new Random();
		
		int valorMaximo = 5;
		System.out.println(r.nextInt(valorMaximo));
		System.out.println(r.nextInt(10));
	
		System.out.println(r.nextDouble()*100);
	
	
	}

}
