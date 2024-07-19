package avaliacao1;

import javax.swing.JOptionPane;

public class DecideAlcoolOuGasolina {

	public static void main(String[] args) {

		double valorLitroAlcool = Double
				.parseDouble(JOptionPane.showInputDialog("Insira o valor do litro do Álcool:"));
		double valorLitroGasolina = Double
				.parseDouble(JOptionPane.showInputDialog("Insira o valor do litro da Gasolina:"));

		if (valorLitroGasolina - (valorLitroGasolina * 0.3) > valorLitroAlcool) {
			JOptionPane.showMessageDialog(null, "Vale a pena abastecer com Álcool!");
		} else {
			JOptionPane.showMessageDialog(null, "Não vale a pena abastecer com Álcool!");
		}

	}
}
