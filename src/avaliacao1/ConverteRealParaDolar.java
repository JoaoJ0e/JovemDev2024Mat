package avaliacao1;

import javax.swing.JOptionPane;

public class ConverteRealParaDolar {

	public static void main(String[] args) {
		double qntReal = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade em Reais (R$): "));
		double cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Insira a cotação do Dólar ($):"));

		JOptionPane.showMessageDialog(null,
				String.format("R$ " + qntReal + " equivale a $ " + "%.2f", (qntReal / cotacaoDolar)));

	}

}
