package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex22 {

	public static void main(String[] args) {
		int qntFilas = Integer.parseInt(JOptionPane.showInputDialog("Quantas filas tem no banco?"));
		int qntClientes = 0;

		int filaMaiorDepositos = 0;
		int maiorDep = 0;
		int filaMenorRetiradas = 0;
		int menorRet = 0;
		
		
		for (int i = 1; i <= qntFilas; i++) {
			int somaDep = 0;
			int somaRet = 0;
			
			// Verifica por fila
			qntClientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes tem na " + i + "a fila?"));
			for (int j = 0; j < qntClientes; j++) {

				// Valida a operacao
				char op = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toLowerCase().charAt(0);
				while (op != 'd' && op != 'r') {
					op = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toLowerCase().charAt(0);
				}
				// Realiza a operação desejada
				if (op == 'd') {
					somaDep += 1;
				} else {
					somaRet += 1;
				}

			} 
	
			// Define a primeira fila como todas
			if (i == 1) {
				filaMaiorDepositos = i;
				filaMenorRetiradas = i;
				maiorDep = somaDep;
				menorRet = somaRet;
				
			}
			if (somaDep > maiorDep ) {
				filaMaiorDepositos = i;
				maiorDep = somaDep;
			}
			if (somaRet < menorRet) {
				filaMenorRetiradas = i;
				menorRet = somaRet;
			}
			
			
		}

		JOptionPane.showMessageDialog(null, "Fila com mais depositos: " + filaMaiorDepositos + "\nTotal de depositos: " + maiorDep);
		JOptionPane.showMessageDialog(null, "Fila com menos retiradas: " + filaMenorRetiradas + "\nTotal de retiradas: " + menorRet);
		
	}

}
