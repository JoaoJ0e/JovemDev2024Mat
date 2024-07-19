package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicoOrdemCrescente {

	public static void main(String[] args) {
		
		// Ler 3 números, mostrar em ordem crescente
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º Número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º Número:"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 3º Número:"));
		int maiorNumero = 0;
		int numeroDoMeio = 0;
		int menorNumero = 0;
		
		
		// Verifica o maior número
		if (n1 >= n2 && n1 >= n3) {
			maiorNumero = n1;
		} else if (n2 >= n3) {
			maiorNumero = n2;
		} else {
			maiorNumero = n3;
		}
		
	 
		// Verifica o menor número
		if (n1 <= n2 && n1 <= n3) {
			menorNumero = n1;
		} else if (n2 <= n3) {
			menorNumero = n2;
		} else {
			menorNumero = n3;
		}
		
		
		// Verifica o número do meio
		if (maiorNumero >= n1 && menorNumero <= n1) {
			numeroDoMeio = n1;
		} else if (maiorNumero >= n2 && menorNumero <= n2) {
			numeroDoMeio = n2;
		} else if (maiorNumero >= n3 && menorNumero <= n3) {
			numeroDoMeio = n3;
		}
		
		
		JOptionPane.showMessageDialog(null, "Números em ordem crescente: \n\n"
				+ menorNumero + "\n"
				+ numeroDoMeio + "\n"
				+ maiorNumero);
		
		
		
	}
	
}
