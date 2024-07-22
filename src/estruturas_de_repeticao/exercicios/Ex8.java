package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		int qntOperacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas operações bancárias foram realizadas nesse mês?"));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual é seu saldo?")); 
		double valorDaOperacao = 0;
		
		
		for (int i = qntOperacoes; i > 0; i--) {
			char op = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toLowerCase().charAt(0);
			
			// Valida o valorDaOperacao
			while (op != 'd' && op != 'r') {
				op = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toLowerCase().charAt(0);
			}
			
			// Realiza a operação desejada
			if (op == 'd') {
				valorDaOperacao = Double.parseDouble(JOptionPane.showInputDialog("Quantos R$ você vai depositar?"));
				saldo += valorDaOperacao;
			} else {
				valorDaOperacao = Double.parseDouble(JOptionPane.showInputDialog("Quantos R$ você vai sacar?"));
				saldo -= valorDaOperacao;
			}
			
	
			//System.out.println("R$ "+saldo); puramente para debug/logs
		}
		JOptionPane.showMessageDialog(null, "Saldo final: R$" + saldo);
		
		
	}

}
