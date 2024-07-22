package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		
		int qntAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos você vai verificar?"));
		String statusAluno = "Em Recuperação";
		
		for (int i = qntAlunos; i > 0; i--) {
			String nomeAluno = JOptionPane.showInputDialog("Insira o nome do aluno:");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a média do aluno?"));
		
			if (media >= 7) {
				statusAluno = "Aprovado";
			} else if (media < 2) {
				statusAluno = "Reprovado";
			}
			
			JOptionPane.showMessageDialog(null, "Nome: " + nomeAluno 
											  + "\nMédia :" + media
								     		  + "\nStatus: " + statusAluno);
		}
		
	}

}
