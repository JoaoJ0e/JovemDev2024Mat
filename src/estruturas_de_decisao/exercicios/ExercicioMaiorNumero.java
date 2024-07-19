package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioMaiorNumero {

	public static void main(String[] args) {

		// Ler 3 números, mostrar o maior
	 
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º Número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º Número:"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 3º Número:"));
		int maiorNumero = 0;

		if (n1 >= n2 && n1 >= n3) {
			maiorNumero = n1;
		} else if (n2 >= n3) {
			maiorNumero = n2;
		} else {
			maiorNumero = n3;
		}
		
		JOptionPane.showMessageDialog(null, "O maior número é " + maiorNumero);
		
	}

}
