package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioPrimeiraData {

	public static void main(String[] args) {
	
		int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia da primeira data:"));
		int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês da primeira data:"));
		int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano da primeira data:"));
		String data1 = dia1 +"-"+ mes1 +"-"+ ano1;
		
		
		int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia da segunda data:"));
		int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês da segunda data:"));
		int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano da segunda data:"));
		String data2 = dia2 +"-"+ mes2 +"-"+ ano2;
		
		if (ano1 < ano2) {
			JOptionPane.showMessageDialog(null, "A primeira data ("+data1+") ocorreu cronologicamente primeiro");
		} else if (ano2 < ano1){
			JOptionPane.showMessageDialog(null, "A segunda data ("+data2+") ocorreu cronologicamente primeiro");
		} else {
			if (mes1 < mes2) {
				JOptionPane.showMessageDialog(null, "A primeira data ("+data1+") ocorreu cronologicamente primeiro");
			} else if (mes2 < mes1) {
				JOptionPane.showMessageDialog(null, "A segunda data ("+data2+") ocorreu cronologicamente primeiro");
			} else {
				if (dia1 < dia2) {
					JOptionPane.showMessageDialog(null, "A primeira data ("+data1+") ocorreu cronologicamente primeiro");
				} else if (dia2 < dia1) {
					JOptionPane.showMessageDialog(null, "A segunda data ("+data2+") ocorreu cronologicamente primeiro");
				} else {
					JOptionPane.showMessageDialog(null, "As duas datas são iguais!");
				}
			}
		}
		
	}

}
