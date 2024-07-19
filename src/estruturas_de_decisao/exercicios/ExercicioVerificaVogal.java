package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioVerificaVogal {

	public static void main(String[] args) {
		
		char letra = JOptionPane.showInputDialog("Digite uma letra minúscula:").toLowerCase().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			JOptionPane.showMessageDialog(null, "Sua letra é uma vogal!");
		} else {
			JOptionPane.showMessageDialog(null, "Sua letra não é uma vogal.");
		}
	}
}

