package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex25 {

	public static void main(String[] args) {
		int qntAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos?"));
		String nome = "";
		int qntProvas = 0;

		double nota = 0;
		double somaNotas = 0;
		double media = 0;

		for (int i = 1; i <= qntAlunos; i++) {
			somaNotas = 0;
			qntProvas = 0;
			
			nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
			qntProvas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas o aluno fez?"));

			for (int j = 1; j <= qntProvas; j++) {
				nota = Double.parseDouble(JOptionPane.showInputDialog("Nota " + j));
				somaNotas += nota;
			}

			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nMédia: " + somaNotas / qntProvas);
			media += somaNotas / qntProvas;
		}
		JOptionPane.showMessageDialog(null, "Média da turma: " + media/qntAlunos);
	}

}
