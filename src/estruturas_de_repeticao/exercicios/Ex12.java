package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		int qntResTub = 0;
		int qntResJag = 0;
		int qntMenorQue17 = 0;
		
		int qntAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos?"));
		for (int i = 1; i <= qntAlunos; i++) {
			// pedir nome
			String cidade = JOptionPane.showInputDialog("Insira sua cidade (sem acentos)").toLowerCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
			
			if (cidade.equals("tubarao")) {
				qntResTub += 1;
			} else if (cidade.equals("jaguaruna")) {
				qntResJag += 1;
			}
			if (idade > 17) {
				qntMenorQue17 += 1;
			}
			
		}
		JOptionPane.showMessageDialog(null, qntResTub + " moradores de Tubarão\n"
				+ qntResJag + " moradores de Jaguaruna\n"
				+ qntMenorQue17 + " menores de 17 anos\n");
	}
		
}
