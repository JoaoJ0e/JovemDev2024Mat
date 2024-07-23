package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex23 {

	public static void main(String[] args) {
		int somaPrimos = 0;
		int qntNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros voce quer verificar?"));
		int numero = 0;

		// Deixa o usuario inserir a quantidade desejada de numeros
		for (int i = 1; i <= qntNumeros; i++) {
			boolean isPrimo = true;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "o numero"));

			// Verifica se o numero inserido é primo
			for (int j = 2; j < numero; j++) {
				if ((numero % j) == 0) {
					isPrimo = false;
				}
			} // Se o numero for primo, adiciona 1 para a soma de primos
			if (isPrimo) {
				somaPrimos++;
			}

		}

		JOptionPane.showMessageDialog(null, "Total de numeros primos: " + somaPrimos);

	}

}
