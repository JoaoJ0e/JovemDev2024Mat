package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		int qntAlunos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos: "));
		
		int media = 0;
		String nome = "";
		
		int menorMedia = 0;
		String menorNome = "";
		
		for (int i = 1; i <=qntAlunos; i++) {
			nome = JOptionPane.showInputDialog("Nome " + i);
			media = Integer.parseInt(JOptionPane.showInputDialog("Média " + i));
		
			if (i == 1) {
				menorMedia = media;
				menorNome = nome;
				
			}
			if (media < menorMedia) {
				menorMedia = media;
				menorNome = nome;
			}
		
		}
		
		JOptionPane.showMessageDialog(null, "Aluno com a menor média: " + menorNome
										  + "\nMedia: " + menorMedia);
		



	}

}
