package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor A: (A^B)"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor B: (A^B)"));
		int exp = 1;
		
		for (int i = 0; i<b; i++) {
			exp *= a;
		}
		
		JOptionPane.showMessageDialog(null, exp);;
		
	}

}
