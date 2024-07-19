package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioDiaDaSemana{

	public static void main(String[] args) {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Insira um dia (1-7):"));
		switch(escolha) {
				case 1:
					JOptionPane.showMessageDialog(null, "Domingo");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Segunda-feira");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Terça-feira");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Quarta-feira");
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Quinta-feira");
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Sexta-feira");
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Sábado");
					break;	
				default:
					JOptionPane.showMessageDialog(null, "Valor inválido!");
		}
		
		
	}

}
