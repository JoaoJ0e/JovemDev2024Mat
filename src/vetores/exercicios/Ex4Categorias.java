package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex4Categorias {

	public static void main(String[] args) {
		String menu = "1 - Cadastrar\n"
				+ "2 - Verificar categorias\n"
				+ "9 - SAIR";
		
		int op = 0;
		
		String[] nomes = new String[350];
		int[] idades = new int[350];
		int c = 0;
		
		// Cenário de testes
		nomes[0] = "A";
		nomes[1] = "B";
		nomes[2] = "C";
		nomes[3] = "D";
		nomes[4] = "E";
		
		idades[0] = 6;
		idades[1] = 5;
		idades[2] = 7;
		idades[3] = 15;
		idades[4] = 18;
		
		c = 5;
		
		// =================
		
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				if (c < 350) {
					nomes[c] = JOptionPane.showInputDialog("Nome nº " + (c+1));
					idades[c] = Integer.parseInt(JOptionPane.showInputDialog("Idade de " + nomes[c]));
					c++;
				} else {
					JOptionPane.showMessageDialog(null, "Memória cheia!");
				}
				break;
				
			case 2:
				
				boolean consultando = true;
				String categoriaBusca = "";
				
				while (consultando) {
					String nomeBusca = JOptionPane.showInputDialog("Insira um nome para consultar sua categora (enter para sair)");
					
					if (nomeBusca.equals("")) {
						consultando = false;
						break;
					}
					
					String categoria = "";
					boolean nomeEncontrado = false;
					
					
					int pos = 0;
					do {
						if (nomes[pos].equals(nomeBusca)) {
			                nomeEncontrado = true;

							// Verifica a categoria da pessoa baseada na sua idade
							if (idades[pos] >= 5 && idades[pos] <= 7) {
								categoria = "Infantil A";
							} else if (idades[pos] >= 8 && idades[pos] <= 10) {
								categoria = "Infantil B";
							} else if (idades[pos] >= 11 && idades[pos] <= 17) {
								categoria = "Juvenil";
							} else if (idades[pos] >= 18) {
								categoria = "Adulto";
							} else {
								categoria = "Essa pessoa nao pode competir!";
							}
							
							categoriaBusca += "Nome: " + nomeBusca + "\nIdade: " + idades[pos] + "\nCategoria: " + categoria + "\n\n";
						}
						pos++;
						
					} while (pos < c);
					
					if (!nomeEncontrado) {
			            JOptionPane.showMessageDialog(null, "Nome não encontrado!"); 
			        }
					
					}
				
				JOptionPane.showMessageDialog(null, categoriaBusca);
				
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
