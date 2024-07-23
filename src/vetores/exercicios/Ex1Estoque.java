package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex1Estoque {

	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar mercadorias\n"
				+ "2 - Verififcar qnt de Merc. com menos que 10 un em estoque\n"
				+ "3 - Verificar qnt merc Custo > R$100 && est > 10\n"
				+ "4 - Verificar Nome e preço da mercadoria com menor estoque\n"
				+ "5 - Verificar estoque da mercadoria com maior preço\n"
				+ "6 - Verif % merc est. 0un\n\n"
				+ "9 - SAIR";
		
		int op = 0;
		
		String[] nomesMerc = new String[50];
		double[] precosMerc = new double[50];
		int[] unEstMercs = new int[50];
		int c = 0;
		
		// Cenário de testes
		nomesMerc[0] = "Café Medíocre";
		nomesMerc[1] = "Arroz Queimado 1kg";
		nomesMerc[2] = "Feijão Ruinzão 1kg";
		nomesMerc[3] = "Cheiro de Ferrero Rocher 1g";
		nomesMerc[4] = "Pão Visconti-de-mau-hálito";
		
		precosMerc[0] = 10.78;
		precosMerc[1] = 2.99;
		precosMerc[2] = 3.58;
		precosMerc[3] = 758.89;
		precosMerc[4] = 5.68;
		
		unEstMercs[0] = 80;
		unEstMercs[1] = 300;
		unEstMercs[2] = 50;
		unEstMercs[3] = 12;
		unEstMercs[4] = 0;
		
		c = 5;
		
		// =================
		
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				// 1 - Cadastrar mercadorias
				if (c < 50) {
					nomesMerc[c] = JOptionPane.showInputDialog("Nome do produto nº" + (c+1));
					unEstMercs[c] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque do " + nomesMerc[c]));
					precosMerc[c] = Double.parseDouble(JOptionPane.showInputDialog("Preço do " + nomesMerc[c]));
					c++;
					
				} else {
					JOptionPane.showMessageDialog(null, "Memória cheia!");
				}
				break;
				
			case 2:
				// 2 - Verififcar qnt de Merc. com menos que 10 un em estoque
				
				int qntMerc = 0;
				for (int i = 0; i < c; i++) {
					if (unEstMercs[i] < 10) {
						qntMerc++;
					}
				}
				
				JOptionPane.showMessageDialog(null, "Quantidade de mercadorias com menos de 10un em estoque: " + qntMerc);
				
				break;
				
			case 3:
				// 3 - Verif. qnt merc Custo > R$100 && est > 10
				
				int qntMerc100 = 0;
				for (int i = 0; i < c; i++) {
					if (unEstMercs[i] > 10 && precosMerc[i] > 100) {
						qntMerc100++;
					}
				}
				
				JOptionPane.showMessageDialog(null, "Quantidade de mercadorias com mais de 10un em estoque "
						+ "\ne preço maior que R$ 100,00: " + qntMerc100);
				
				break;
				
			case 4:
				// 4 - Verif Nome e preço da merc c/ menor estoque
				
				int posMenorEstoque = 0;
				
				for (int i = 0; i < c; i++) {
					if (i != 0 ) {
						if (unEstMercs[i] < unEstMercs[posMenorEstoque]) {
							posMenorEstoque = i;
						}
					} 
				}
				
				JOptionPane.showMessageDialog(null, "Mercadoria com menor estoque: " + nomesMerc[posMenorEstoque]
												  + "\nPreço: R$ " + precosMerc[posMenorEstoque]
												  + "\nEstoque: " + unEstMercs[posMenorEstoque]);
				break;
				
			case 5:
				//5 - Verif est. da merc com maior preço
				int posMaiorPreco = 0;
								
				for (int i = 0; i < c; i++) {
					if (i != 0 ) {
						if (precosMerc[i] > precosMerc[posMaiorPreco]) {
							posMaiorPreco = i;
						}
					} 
				}
				
				JOptionPane.showMessageDialog(null, "Mercadoria com maior preço: " + nomesMerc[posMaiorPreco]
						  + "\nPreço: R$ " + precosMerc[posMaiorPreco]
						  + "\nEstoque: " + unEstMercs[posMaiorPreco]);
				
				
				break;
				
				
			case 6:
				// 6 - Verif % merc est. 0un
				
				int qntMercSemEst = 0;
				for (int i = 0; i < c; i++) {
					if (unEstMercs[i] == 0) {
						qntMercSemEst++;
					}
					System.out.println(qntMercSemEst);
					
				}
				System.out.println(c);
				JOptionPane.showMessageDialog(null, "Porcentagem de produtos com estoque zerado: " + (((double) qntMercSemEst/ (double)c)*100) + "%");
				
				
				break;
				
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
	
			}
			
		} while (op != 9);
	}

}
