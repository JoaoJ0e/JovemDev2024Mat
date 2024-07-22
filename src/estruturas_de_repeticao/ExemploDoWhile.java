package estruturas_de_repeticao;

import javax.swing.JOptionPane;

public class ExemploDoWhile {

	public static void main(String[] args) {
		double vlOrcamento = Double.parseDouble(JOptionPane.showInputDialog("Qual teu orçamento pra hoje, meu nobre?"));
		double vlGasto = 0;
		
		
		do {
			vlGasto += Double.parseDouble(JOptionPane.showInputDialog("Gastasse quanto?"));
			JOptionPane.showMessageDialog(null, "DADOS"
					+ "\nOrçamento: " + vlOrcamento
					+ "\nGastos: " + vlGasto);
		} while(vlGasto <= vlOrcamento);
		
		JOptionPane.showMessageDialog(null, "Você não pode gastar mais!");
		
	}

}
