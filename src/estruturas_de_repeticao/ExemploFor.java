package estruturas_de_repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
//		Avança de 2 em 2
//		for (int i=0; i<10; i+=2) {
//			System.out.print(i + " ");
//		}

		
		// Com pontos finais e iniciais de input, mostra os numeros entre eles
		int pontoIn = Integer.parseInt(JOptionPane.showInputDialog("Ponto inicial"));
		int pontoFn = Integer.parseInt(JOptionPane.showInputDialog("Ponto final"));
		
		
		if (pontoIn < pontoFn) {
			for (int i = pontoIn; i<= pontoFn; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = pontoIn; i>= pontoFn; i--) {
				System.out.println(i);
			}
		}
		
		// Pede um número, e mostra todos os numeros pares abaixo dele
		// (usando operadores ternários)
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número, e veja os números pares abaixo dele!"));
		
		for (int i = (numero % 2 != 0) ? numero - 1 : numero; i>0; i-=2) {
				System.out.println(i);
		}
		
		
		
		
		
	}

}
