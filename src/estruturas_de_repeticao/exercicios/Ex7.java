package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N:"));
		double soma = 0;
		
		for (double i = n; i > 0; i--) {
			soma += (1/i);
		}
		JOptionPane.showMessageDialog(null, soma);
	}

}
