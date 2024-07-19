package aula_introducao;

import javax.swing.JOptionPane;

public class ExercicioAreaTriangulo {

	public static void main(String[] args) {

		double base = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		JOptionPane.showMessageDialog(null, "A área do triângulo de é " + (base * altura) / 2 + "m²!");
	}

}
