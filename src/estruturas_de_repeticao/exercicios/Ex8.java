package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		int qntOperacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas operações bancárias foram realizadas nesse mês?"));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual é seu saldo?")); 
		double valorDaOperacao = 0;
		
		
		for (int i = qntOperacoes; i > 0; i--) {
			char op = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toLowerCase().charAt(0);
			
			
			// Valida a valorDaOperacao
			if (op != 'd' && op != 'r') {
				JOptionPane.showMessageDialog(null, "Opção inválida! Use (D) ou (R)");
				i += 1;
			} else {
				if (op == 'd') {
				valorDaOperacao = Double.parseDouble(JOptionPane.showInputDialog("Quantos R$ você vai depositar?"));
				} else {
					valorDaOperacao = Double.parseDouble(JOptionPane.showInputDialog("Quantos R$ você vai sacar?"));
				}
				
				// Adiciona/subtrai o valor do saldo
				if (op == 'd') {
					saldo += valorDaOperacao;
				} else {
					saldo -= valorDaOperacao;
				}
				System.out.println("R$ "+saldo);
			}
			
			
		}
		JOptionPane.showMessageDialog(null, "Saldo final: R$" + saldo);
		
		
	}

}
