package aula_introducao;

public class ExemploOperadores {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println("Hello world!")
		
		int int1 = 10; 
		int int2 = -5;
		int int3 = 3;
		
		double double1 = 2.5;
		//double double2 = -5.0;
		double double3 = 3.3;
		
		
		// UM SIRI FAZENDO BARRA
		
	/* 
	 * ================================
	 * EXEMPLOS DE OPERAÇÕES ARITMÉTICAS
	 * =================================
	 */
		
		// SOMA
		int r1 = int1 + int2;
			System.out.println("Soma de dois inteiros: " + r1);

		double r2 = double1 + double3;
			System.out.println("Soma de dois doubles: " + r2);
				
		double r3 = int1 + double1;
			System.out.println("Soma de int e double: " + r3);

		
		// SUBTRAÇÃO
		int r4 = int1 - int2;
			System.out.println("Subtração de dois inteiros: " + r4);
		
		double r5 = double1 - double3;
			System.out.println("Subtração de dois doubles: " + r5);
		
		double r6 = int1 - double1;
			System.out.println("Subtração de int e double: " + r6);
		
		
		// MULTIPLICACAO
		int r7 = int1 * int2;
			System.out.println("Multiplicação de dois inteiros: " + r7);
		
		double r8 = double1 * double3;
			System.out.println("Multiplicação de dois doubles: " + r8);
		
		double r9 = int1 * double1;
			System.out.println("Multiplicação de int e double: " + r9);

		
		// DIVISÃO
		int r10 = int1 / int2;
			System.out.println("Divisão de dois inteiros: " + r10);
		
		int r11 = int1 / int3;
			System.out.println("Divisão de dois inteiros (com dízima): " + r11);
		
		double r111 = int1 / int3;
			System.out.println("Divisão de dois inteiros (com dízima, em real): " + r111);

		double r222 = int1 / (double) int3; // CONVERSÃO AO VIVO!
			System.out.println("Divisão de dois inteiros (com dízima, em real, cast): " + r222);
		
		double r12 = double1 / double3;
			System.out.println("Divisão de dois doubles: " + r12);
		
		double r13 = int1 / double1;
			System.out.println("Divisão de int e double: " + r13);
		
		// A DIVISÃO DE DOIS INTEIROS SEMPRE VAI SER UM INTEIRO
		
		
		// RESTO DA DIVISÃO (MÓDULO)
		r10 = 16 % 7;
			System.out.println("Módulo: " + r10);
		
		r13 = 5 % 4;
			System.out.println("Módulo: " + r13);

		// EXPONENCIAÇÃO
			System.out.println(Math.pow(2, 64));
		
		//double r44 = Math.pow(int1, int3); // para expo, usa lib. retorna em double.
	
		
		/* 
		 * =================================
		 * EXEMPLOS DE OPERAÇÕES RELACIONAIS	
		 * =================================
		 */
	
		System.out.println("10 é igual a 5? " + (10 == 5));
		System.out.println("10 é igual a 10? " + (10 == 10));
		System.out.println("int1 é maior que int3? " + (int1 > int3));
		System.out.println("10 é diferente de 5? " + (10 != 5));
		
		System.out.println("D é maior que A? " + ('D' > 'A')); //ordem alfabetica
		
		System.err.println("Erro! Cor do texto não é preta!");
		
		/* 
		 * ====================
		 *  OPERADORES LÓGICOS	
		 * ====================
		 */
	

		boolean b1 = true;
		//boolean b2 = false;
		boolean b3 = true;
		
		
		// && = AND
		// || = OR
		// ! = NOT
		
		System.out.println(b1 && b3);
		
		
		/* 
		 * ===================================
		 *  EXEMPLOS DE OPERAÇÕES COM STRINGS
		 * ===================================
		 */
		
		String str1 = "CASA";
		String str2 = "ESCOLA";
		String str3 = " ";
		String str4 = "10";
		String str5 = "cAsA";
		
		char c1 = 65; // 65 = A na tabela ASCII
		char c2 = '5';
		char c3 = ' ';
		
		System.out.println(str1 + str3 +str2);
		System.out.println(c1 + c1); //soma os códigos ASCII
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str5));
	
		
		System.out.println(str2.substring(2,4)); // str2[2:4], só que no java!
		
		String str6 = c1+"" + c3+"" + c2+"";
		System.out.println(str6);
		
		// == MANIPULAÇÃO DE STRINGS ==
		
		//COMPRIMENTO DE UMA STRING
		int c_str2 = str2.length();
		System.out.println(c_str2);
		//System.out.println(str2.length());
		
		
		System.out.println(str2.indexOf("CO")); // "Onde está o ()?"
		System.out.println(str2.indexOf("ASDADSGSDFGSD")); // -1 = não tem
		System.out.println(str2.contains("CO")); // "Tem o ()?"
		System.out.println(str2.startsWith("ES")); // "Começa com ()?"
		System.out.println(str2.endsWith("A")); // "Termina com ()?"
		
		
		
		System.out.println(str2.contains("C") || str2.contains("L"));
		
		// Padrão de nomenclatura = camelCaseQuePodeTerNumeros123143Xyz
		// fordGtModel1945
		
	}	
}
