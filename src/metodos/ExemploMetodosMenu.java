package metodos;

import javax.swing.JOptionPane;

public class ExemploMetodosMenu {

	public static void main(String[] args) {
		
		System.out.println(escolheMenu());

	}

	public static int escolheMenu() {
		String m = "1 - Cadastrar alunos e suas notas\n" 
				+ "2 - Listar alunos (nome, media, situacao)\n"
				+ "3 - Buscar aluno por nome (mostrar nome, media, situacao)\n"
				+ "4 - Listar alunos Aprovados (mostrar nomes)\n"
				+ "5 - Listar alunos em Recuperação (mostrar nomes)\n"
				+ "6 - Listar alunos Reprovados (mostrar nomes)\n\n"
				+ "9 - SAIR";
		
		int op = Integer.parseInt(JOptionPane.showInputDialog(m));
		
		if ((op < 1 || op > 6) && op != 9) {
			return escolheMenu();
		}
		return op;
		
	}
	
	
	
}
