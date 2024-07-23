package vetores;

import javax.swing.JOptionPane;

public class ExemploVetores3 {

	public static void main(String[] args) {
		// Ler nome e idade de 100 pessoas
		// Verif. nomePessoaMaisVelha
		// Verif in nomeInput esta na lista
		
		String menu = "1 - Cadastrar\n"
				+ "2 - Nome da pessoa mais velha\n"
				+ "3 - Buscar pessoa \n\n"
				+ "9 - SAIR";
		
		int op = 0;
		
		String[] nomes = new String[100];
		int[] idades = new int[100];
		int c = 0;
		
		// Cenário de testes
		nomes[0] = "A";
		nomes[1] = "B";
		nomes[2] = "C";
		nomes[3] = "D";
		nomes[4] = "E";
		
		idades[0] = 5;
		idades[1] = 11;
		idades[2] = 8;
		idades[3] = 7;
		idades[4] = 1;
		
		c = 5;
		
		// =================
		
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				if (c < 100) {
					nomes[c] = JOptionPane.showInputDialog("Nome nº " + (c+1));
					idades[c] = Integer.parseInt(JOptionPane.showInputDialog("Idade de " + nomes[c]));
					c++;
				} else {
					JOptionPane.showMessageDialog(null, "Memória cheia!");
				}
				break;
				
			case 2:
				int posMaisVelha = 0;
			
				for (int i = 1; i < c; i++) {
					if (idades[i] > idades[posMaisVelha]) {
						posMaisVelha = i;
					}
				}
					
				
				JOptionPane.showMessageDialog(null, "A pessoa mais velha é " + nomes[posMaisVelha] + ", com " + idades[posMaisVelha] + " anos de idade!");

				break;
				
			case 3:
				String nomeBusca = JOptionPane.showInputDialog("Insira um nome para procurar na lista:");
				String achou = "Nome não encontrado";
				int pos = 0;
				do {
					if (nomes[pos].equals(nomeBusca)) {
						achou = "Encontrado " + nomes[pos] + " na posição " + pos;
					}
					pos++;
					
				} while (pos < c && achou.equals("Nome não encontrado"));
				
				JOptionPane.showMessageDialog(null, achou);
				
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
	
			}
			
		} while (op != 9);
		
		
		
		

		
		
		//		if (i != 1) {
//			if (idades[i] > posMaisVelha) {
//				posMaisVelha = i; 
//			}
//		} else {
//			posMaisVelha = i;
//		}
		
		
		
		
		

	}

}
