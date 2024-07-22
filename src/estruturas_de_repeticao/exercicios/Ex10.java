package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		int qntAlunos = Integer.parseInt("Quantos alunos irás verificar?");
		int somaMasc = 0;
		
		for (int i = 0; i <= qntAlunos; i++) {
			String nomeAluno = JOptionPane.showInputDialog("Nome:");
			char sexo = JOptionPane.showInputDialog("Sexo (M/F):").toLowerCase().charAt(0);
			
			if (sexo != 'm' && sexo != 'f') {
				JOptionPane.showMessageDialog(null, "Opção inválida! Use (M/F)");
				i += 1;
			} else {
				
			}
			
		}
		
	}

}
