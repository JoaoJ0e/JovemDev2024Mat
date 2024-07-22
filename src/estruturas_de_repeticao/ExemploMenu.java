package estruturas_de_repeticao;

import javax.swing.JOptionPane;

public class ExemploMenu {

	public static void main(String[] args) {
		String menu ="1 - Miojo"
				+ "\n2 - Churrasco"
				+ "\n3 - Pizza"
				+ "\n4 - Sushi"
				+ "\n5 - Lasanha"
				+ "\n6 - Batata Frita"
				+ "\n9 - Fechar pedido";

		String pedido = "";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				pedido += "Miojo\n";
				break;
			case 2:
				pedido += "Churrasco\n";
				break;
			case 3:
				pedido += "Pizza\n";
				break;
			case 4:
				pedido += "Sushi\n";
				break;
			case 5:
				pedido += "Lasanha\n";
				break;
			case 6:
				pedido += "Batata Frita\n";
				break;
			case 7:
				pedido += "Miojo\n";
				break;
			case 9:
				if (pedido .equals(""))
					pedido = "Pedido vazio! Por favor compre alguma coisa :(";
				break;
				
				
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				break;

				
				
			}
		} while (op != 9);

		JOptionPane.showMessageDialog(null, pedido);
		
//		do do {}
//		e &&do {}
	}

}
