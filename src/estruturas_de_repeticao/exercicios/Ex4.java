package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para calcular seu Fatorial (N!)"));
		int nFat = 1;
		
		
		for (int i = n; i>0;i--) {
			nFat *= i;
		}

		JOptionPane.showMessageDialog(null, n + "! = " + nFat);
		
	}

}
