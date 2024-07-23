package estruturas_de_repeticao.exercicios;

import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		int andarAtual = -1;
		while (andarAtual < 0) {
			andarAtual = Integer.parseInt(JOptionPane.showInputDialog("Em qual andar o elevador se encontra?"));
		}

		int proxAndar = -1;
		boolean continuar = true;

		while (continuar) {
			do {
				proxAndar = Integer.parseInt(JOptionPane.showInputDialog("Próximo andar?"));
			} while (proxAndar < 0);

			if (proxAndar > andarAtual) {
				JOptionPane.showMessageDialog(null, "Sobe");
			} else if (proxAndar < andarAtual) {
				JOptionPane.showMessageDialog(null, "Desce");
			} else {
				continuar = false;
			}

			andarAtual = proxAndar;

		}

		JOptionPane.showMessageDialog(null, "Parando o elevador - Destino é o andar atual!");
	}

}
