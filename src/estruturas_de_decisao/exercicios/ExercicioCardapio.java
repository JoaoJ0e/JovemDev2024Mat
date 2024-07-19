package estruturas_de_decisao.exercicios;

import javax.swing.JOptionPane;

public class ExercicioCardapio {

	public static void main(String[] args) {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções do cardápio para ver mais detalhes:\n"
				+ "\n1 - Miojo"
				+ "\n2 - Churrasco"
				+ "\n3 - Pizza"
				+ "\n4 - Sushi"
				+ "\n5 - Lasagna"
				+ "\n6 - Batata Frita"
				+ "\n7 - Memória RAM"));
		
		switch(escolha) {
				case 1:
					JOptionPane.showMessageDialog(null, "MIOJO"
							+ "\n\nMassa altamente saborosa, econômica e cancerígena de origem japonesa");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "CHURRASCO"
							+ "\n\nTambém conhecido como a oitava maravilha do mundo, o churrasco é um corte de carne assado sob a brasa de um carvão ardente.");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "PIZZA"
							+ "\n\nUm sanduíche aberto chique da Itália");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "SUSHI"
							+ "\n\nMolho tarê com um pouco de peixe cru e arroz. Sério gente, por que esse troço custa tanto?!?!?");
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "LASAGNA"
							+ "\n\nGostinho de segunda-feira");
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "BATATA FRITA"
							+ "\n\nBatatas cortadas e fritas. Preciso dizer mais?");
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "MEMÓRIA RAM"
							+ "\n\nO lanchinho favorito do Google Chrome!");
					break;
					
				default:
					System.out.println("Item inválido! Escolha uma das opções do Menu");
		}
		
		
	}

}
