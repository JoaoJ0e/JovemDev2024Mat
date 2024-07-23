package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {
		int qntFilas = Integer
				.parseInt(JOptionPane.showInputDialog("Quantas filas tem no banco?"));
		int qntClientes = 0;
		//double valorDaOperacao = 0;
		int somaDep = 0;
		int somaRet = 0;

		for (int i = 0; i < qntFilas; i++) {
			qntClientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes tem na " + (i+1) + "a fila?"));
			for (int j = 0; j < qntClientes; j++) {

				// Valida o valorDaOperacao
				char op = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toLowerCase().charAt(0);
				while (op != 'd' && op != 'r') {
					op = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toLowerCase().charAt(0);
				}
					// Realiza a operação desejada
					if (op == 'd') {
						somaDep += 1;
//						valorDaOperacao = Double.parseDouble(JOptionPane.showInputDialog("Quantos R$ você vai depositar?"));
//						saldo += valorDaOperacao;
					} else {
						somaRet += 1;
//						valorDaOperacao = Double.parseDouble(JOptionPane.showInputDialog("Quantos R$ você vai sacar?"));
//						saldo -= valorDaOperacao;
					}

				

			}

		}

		JOptionPane.showMessageDialog(null, "Total de depositos: " + somaDep
										   +"\nTotal de retiradas: " + somaRet);	
		
	}

}
