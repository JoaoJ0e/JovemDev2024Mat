package metodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>(); 

		int op = 0;
		
		do {
			op = menu();
			
			switch (op) {
			case 1: 
				cadastraNome(nomes);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, listaTodos(nomes));
				break;
				
			case 3: 
				JOptionPane.showMessageDialog(null, filtrarPorNome(nomes));
				break;
			}
			
			
		} while (op != 4);
		
		
		
	}

	public static int menu() {
		String m = "1 - Cadastrar\n"
				+ "2 - Listar todos\n"
				+ "3 - Buscar por nome\n"
				+ "4 - Sair";

		int op = Integer.parseInt(JOptionPane.showInputDialog(m));

		// Validação com recursividade
		if (op < 1 || op > 4) {
			return menu();
		}

		return op;

	}

	public static void cadastraNome(ArrayList<String> lista) {
		lista.add(JOptionPane.showInputDialog("Qual nome deseja cadastrar?"));
	}

	public static String listaTodos(ArrayList<String> lista) {
		String ret = "NOMES CADASTRADOS:\n";

		for (String nome : lista) {
			ret += nome + "\n";
		}
		return ret;
	}

	public static String filtrarPorNome(ArrayList<String> lista) {
		String nomeBusca = JOptionPane.showInputDialog("Nome que deseja buscar:");
		
		for (int i = 0; i < lista.size(); i++) {
			String nome = lista.get(i);
			if (nome.equals(nomeBusca)) {
				return nome + " encontrado na posição " + (i+1);
			}
		}
		
		return "Nome não encontrado";


	}

}
