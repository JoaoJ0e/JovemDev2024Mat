
package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioVerificaTriangulo {

	public static void main(String[] args) {
		
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º lado do triângulo:"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º lado do triângulo:"));
		int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 3º lado do triângulo:"));
		
		if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
			if (lado1 == lado2 && lado2 == lado3) {
				JOptionPane.showMessageDialog(null, "O Triângulo é equilátero!");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				JOptionPane.showMessageDialog(null, "O Triângulo é escaleno!");
			} else {
				JOptionPane.showMessageDialog(null, "O Triângulo é isósceles!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Erro: Triângulo impossível com estas medidas!!");
		}

	}

}
