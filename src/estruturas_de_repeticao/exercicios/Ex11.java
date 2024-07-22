package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		int qntNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos números para verificar?"));
		double numero = 0;
		double menorNumero = 0;

		for (int i = 1; i <= qntNumeros; i++) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Insira o " + i + "º número:"));

			if (i == 1) {
				menorNumero = numero;
			}
			if (numero < menorNumero) {
				menorNumero = numero;
			}
		}

		JOptionPane.showMessageDialog(null, "Menor número: " + menorNumero);

	}

}
