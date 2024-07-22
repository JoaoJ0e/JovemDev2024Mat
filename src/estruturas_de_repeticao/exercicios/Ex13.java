package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		int qntFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de funcionários: "));
		
		int idade = 0;
		String nome = "";
		
		int menorIdade = 0;
		String menorNome = "";
		
		for (int i = 1; i <=qntFuncionarios; i++) {
			nome = JOptionPane.showInputDialog("Nome " + i);
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade " + i));
		
			if (i == 1) {
				menorIdade = idade;
				menorNome = nome;
				
			}
			if (idade < menorIdade) {
				menorIdade = idade;
				menorNome = nome;
			}
		
		}
		
		JOptionPane.showMessageDialog(null, "Funcionário mais novo: " + menorNome
										  + "\nIdade: " + menorIdade);
	}

}
