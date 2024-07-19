package avaliacao1;

import javax.swing.JOptionPane;

public class CalculaValorParcela {

	public static void main(String[] args) {
		
		double valorOriginal = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da compra:"));
		int qntParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas você deseja pagar?"
				+ "\nÁ vista = 10% de desconto"
				+ "\nAté 3 parcelas = sem juros"
				+ "\n4 ou mais parcelas = 15% de juros"));
		
		double valorFinal = valorOriginal;
		
		if (qntParcelas == 1) {
			valorFinal = valorOriginal - (valorOriginal*0.1);
		} else if (qntParcelas > 3) {
			valorFinal = valorOriginal + (valorOriginal*0.15);
		}
		
		JOptionPane.showMessageDialog(null, String.format("Valor total da compra: R$" + "%.2f"
								+ "\nTotal de parcelas: " + qntParcelas
								+ "\nValor da parcela: R$" + "%.2f",
								valorFinal, valorFinal/qntParcelas));
		
	}

}
