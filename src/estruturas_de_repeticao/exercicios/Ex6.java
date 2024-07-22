package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		
		// O enunciado fala pra colocar nomes, mas como não são usados no programa nao implementei
		
		int somaIdades = 0;
		int idade = 0;
		int qntIdades = Integer.parseInt(JOptionPane.showInputDialog("Quantas idades?"));
		
		for (int i = qntIdades; i > 0; i--) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			somaIdades += idade;
		}
		JOptionPane.showMessageDialog(null,"Soma das idades: " + somaIdades
										+ "\nMédia das idades: " + (somaIdades/qntIdades));
	}

}
