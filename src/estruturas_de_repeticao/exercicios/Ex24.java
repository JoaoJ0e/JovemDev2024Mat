package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex24 {

	public static void main(String[] args) {
		/*
		 * Empresa -> N Funcionarios
		 * 	Para cada Funcionario:
		 * 		X Servicos, nome
		 * 			Para cada Servico:
		 * 				Mao de obra				
		 * 				Y Pecas -> QNT, preco
		 */
		
		int qntFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionarios"));

		
		// Variaveis usadas dentro de loops / variaveis temporarias
		String nome = ""; 
		int qntServicos = 0; 
		int qntPecas = 0; 
		int qntPorPeca = 0;
		double custoPorPeca = 0;
		double custoMdo = 0;
		double custoMdoPorFunc = 0;
		double totalServico = 0;
		double totalPorFunc = 0;

		// Variaveis exibidas no final do programa
		double totalDoDia = 0;	
		String nomeFuncMaiorMdo = "";
		double maiorMdo = 0;
		String nomeFuncMenorMdo = "";
		double menorMdo = 0;

		// Loop para cada funcionario
		for (int i = 1; i <= qntFuncionarios; i++) {
			totalPorFunc = 0;
			
			nome = JOptionPane.showInputDialog("Nome do funcionario " + i);
			qntServicos = Integer.parseInt(JOptionPane.showInputDialog("Quantos servicos " + nome + " prestou hoje?"));

			// Loop para cada serviço
			for (int j = 1; j <= qntServicos; j++) {
				totalServico = 0;
				qntPorPeca = 0;
				custoPorPeca = 0;
				custoMdo = 0;
				custoMdoPorFunc = 0;
				
				
				
				qntPecas = Integer.parseInt(JOptionPane
						.showInputDialog("Quantos pecas foram usadas no servico " + j + " de " + nome + "?"));

				// Loop para cada peça
				for (int k = 1; k <= qntPecas; k++) {
					qntPorPeca = Integer.parseInt(JOptionPane
							.showInputDialog("Quantidade da peça " + k + " do serviço " + j + " de " + nome + "?"));
					custoPorPeca = Double.parseDouble(JOptionPane
							.showInputDialog("Custo da peça " + k + " do serviço " + j + " de " + nome + "?"));
					
					totalServico += qntPorPeca * custoPorPeca;
					
				} // Fim do loop de peca
				
				custoMdo = Double.parseDouble(JOptionPane
						.showInputDialog("Custo de Mao de Obra do serviço " + j + " de " + nome + "?"));
				
				totalServico += custoMdo;
				JOptionPane.showMessageDialog(null, "Total do serviço " + j + " de " + nome + ": R$" + totalServico);
				totalPorFunc += totalServico;
				custoMdoPorFunc += custoMdo;
			} // Fim do loop de Servico
			
			JOptionPane.showMessageDialog(null, "Nome: " + nome
												+"\nTotal arrecadado: R$" + totalPorFunc);
			
			totalDoDia += totalPorFunc;
			
			
			if (i == 1) {
				nomeFuncMaiorMdo = nome;
				maiorMdo = custoMdo;
				nomeFuncMenorMdo = nome;
				menorMdo = custoMdo;
			}
			
			if (custoMdoPorFunc > maiorMdo) {
				nomeFuncMaiorMdo = nome;
				maiorMdo = custoMdoPorFunc;
			}
			
			if (custoMdoPorFunc < menorMdo) {
				nomeFuncMenorMdo = nome;
				menorMdo = custoMdoPorFunc;
			}
			
		} // Fim do loop de funcionario
		
		JOptionPane.showMessageDialog(null, "Total arrecadado pela empresa: R$" + totalDoDia);
		JOptionPane.showMessageDialog(null, "Funcionario que mais arrecadou com Mao de Obra: " + nomeFuncMaiorMdo
										   +"\nTotal arrecadado de MDO: R$" + maiorMdo
										   +"\n\nFuncionario que menos arrecadou com Mao de Obra: " + nomeFuncMenorMdo
										   +"\nTotal arrecadado de MDO: R$" + menorMdo);
		
	}

}
