package aula_introducao;

import java.util.Locale;
import java.util.Scanner;

public class ExemploEntradaSaidaScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // define o padrão US. (12,34 -> 12.34)
		
		System.out.println("Qual é seu nome? ");
		String nome = sc.next();
		System.out.println("Qual é seu peso (em kg)? ");
		double peso = sc.nextDouble();
		System.out.println("Qual é sua altura (em m)? ");
		double altura = sc.nextDouble();
		double imc = peso / (altura * altura);
		System.out.println("Olá " + nome + ", seu IMC é " + imc + "!");
		sc.close();
		
	}

}
