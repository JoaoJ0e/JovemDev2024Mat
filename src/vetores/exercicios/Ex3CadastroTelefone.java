package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex3CadastroTelefone {

	public static void main(String[] args) {

		
		String menu = "1 - Cadastrar contatos\n"
				+ "2 - Buscar contatos por nome\n"
				+ "3 - Buscar contatos por telefone\n"
				+ "4 - SAIR";
		
		int op = 0;
		
		String[] nomeContatos = new String[100];
		String[] telefoneContatos = new String[100];
		int c = 0;
		
		// Cenário de testes
		nomeContatos[0] = "Joao";
		nomeContatos[1] = "Pedro";
		nomeContatos[2] = "Clavison";
		nomeContatos[3] = "Palmito";
		
		telefoneContatos[0] = "99912-3456";
		telefoneContatos[1] = "12345-6789";
		telefoneContatos[2] = "98765-4321";
		telefoneContatos[3] = "12312-1231";
		
		c = 4;
		
		// =================
		
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (op) {
			case 1:
				// 1 - Cadastrar contatos
				if (c < 50) {
					nomeContatos[c] = JOptionPane.showInputDialog("Nome do contato nº" + (c+1));
					telefoneContatos[c] = JOptionPane.showInputDialog("Telefone do contato nº" + (c+1) + " (XXXXX-YYYY)");
					c++;
					
				} else {
					JOptionPane.showMessageDialog(null, "Memória cheia!");
				}
				break;
				
			case 2:
				// 2 - Buscar contatos por nome
				
				String nomeBusca = JOptionPane.showInputDialog("Insira um nome para procurar na lista:");
				String achou = "Nome não encontrado";
				int pos = 0;
				do {
					if (nomeContatos[pos].equals(nomeBusca)) {
						achou = "Encontrado " + nomeContatos[pos] + " na posição " + pos;
					}
					pos++;
					
				} while (pos < c && achou.equals("Nome não encontrado"));
				
				JOptionPane.showMessageDialog(null, achou);
				
				break;
				
			case 3:
				// 3 - Buscar contatos por telefone
				
				String telefoneBusca = JOptionPane.showInputDialog("Insira um telefone para procurar na lista:  (XXXXX-YYYY)");
				String achouTelefone = "Nome não encontrado";
				int pos2 = 0;
				do {
					if (telefoneContatos[pos2].equals(telefoneBusca)) {
						achouTelefone = "Encontrado " + telefoneContatos[pos2] + " na posição " + pos2;
					}
					pos2++;
					
				} while (pos2 < c && achouTelefone.equals("Nome não encontrado"));
				
				JOptionPane.showMessageDialog(null, achouTelefone);
				
				break;
				
			case 4:
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
	
			}
			
		} while (op != 4);

	}

}
