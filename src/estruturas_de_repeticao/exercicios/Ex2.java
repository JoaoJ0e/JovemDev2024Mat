package estruturas_de_repeticao.exercicios;

public class Ex2 {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			soma += i + (i+1);
			System.out.println(i);
		}

		System.out.println("Soma: " + soma);
		
	}

}
