package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		
		int somaPar = 0;
		int somaImpar = 0;
		
		for (int i = 1; i < 101; i+=2) {
			somaImpar += i;
		}
		for (int i = 2; i < 101; i+=2) {
			somaPar += i;
		}
		
		JOptionPane.showMessageDialog(null, somaImpar - somaPar);;
		
	}

}
