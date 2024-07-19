package aula_introducao;

import javax.swing.JOptionPane;

public class ExemploEntradaSaidaJOptionPane {

	public static void main(String[] args) {
		/* vv jeito feio e redundante vv
		String nome = JOptionPane.showInputDialog("Nome: ");
		String peso = JOptionPane.showInputDialog("Peso: ");
		String altura = JOptionPane.showInputDialog("Altura: ");
		double pesoD = Double.parseDouble(peso);
		double alturaD = Double.parseDouble(altura);
		double imc = pesoD / (alturaD * alturaD);
		String msg = nome + ", seu IMC é:\n" + imc;
		JOptionPane.showMessageDialog(null, msg);
		*/
		
		String nome = JOptionPane.showInputDialog("Nome: ");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		JOptionPane.showMessageDialog(null, nome + ", seu IMC é:\n" + peso / (altura * altura));
	}

}
