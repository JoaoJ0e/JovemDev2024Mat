package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		int qntAlunos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos: "));
		
		int media = 0;
		String nome = "";
		
		int maiorMedia = 0;
		String maiorNome = "";
		
		for (int i = 1; i <=qntAlunos; i++) {
			nome = JOptionPane.showInputDialog("Nome " + i);
			media = Integer.parseInt(JOptionPane.showInputDialog("Média " + i));
		
			if (i == 1) {
				maiorMedia = media;
				maiorNome = nome;
				
			}
			if (media > maiorMedia) {
				maiorMedia = media;
				maiorNome = nome;
			}
		
		}
		
		JOptionPane.showMessageDialog(null, "Aluno com a maior média: " + maiorNome
										  + "\nMedia: " + maiorMedia);
		

	}

}
