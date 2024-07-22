package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		int qntAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos irás verificar?"));
		int somaMasc = 0;

		for (int i = 1; i <= qntAlunos; i++) {
			//String nomeAluno = JOptionPane.showInputDialog("Nome:");
			char sexo = ' ';

			while (sexo != 'm' && sexo != 'f') {
				sexo = JOptionPane.showInputDialog("Sexo (M/F):").toLowerCase().charAt(0);
			}

			if (sexo == 'm') {
				somaMasc += 1;
			}

		}
		
		JOptionPane.showMessageDialog(null, "Quantidade de Homens: " + somaMasc
									      + "\nQuantidade de Mulheres: " + (qntAlunos - somaMasc));

	}

}
