package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioCalculaIdade {

	public static void main(String[] args) {
		
		int ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira seu ano de nascimento: (yyyy)"));
		int mes_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira seu mês de nascimento: (mm)"));

		int ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: (yyyy)"));
		int mes_atual = Integer.parseInt(JOptionPane.showInputDialog("Insira mês atual: (mm)"));
		
		int idade = 0;
		
		
		// Verifica se a pessoa faz aniversário no mês atual
		if (mes_nascimento == mes_atual) {
			JOptionPane.showMessageDialog(null, "Você faz aniversário neste mês! Já planejou sua festa?");
		} else {
			JOptionPane.showMessageDialog(null, "Não é o mês do seu aniversário :(");
		}
		
		// Calcula a idade da pessoa com base no ano e mês
		if (mes_nascimento <= mes_atual) {
			idade = ano_atual - ano_nascimento;
		} else {
			idade = (ano_atual - ano_nascimento) - 1 ;
		}
		JOptionPane.showMessageDialog(null, "Você tem "+ idade + " anos de idade!");
	}

}
