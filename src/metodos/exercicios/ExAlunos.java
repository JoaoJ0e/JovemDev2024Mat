package metodos.exercicios;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ExAlunos {

	public static void main(String[] args) {
		
		
//		  Uma turma com N alunos realizou X provas. Faça um programa que cadastre os alunos e as notas obtidas 
//		  em cada prova, armazenando essas informações em matrizes e vetores conforme a melhor arquitetura. 
//		  Apenas os nomes dos alunos e as notas de cada prova devem ser armazenados durante o cadastro, 
//		  sem acumular outras informações.
//
//			O programa deve permitir as seguintes funcionalidades:
//			
//			-Cadastrar Alunos e Notas: Permitir o cadastro de alunos e suas respectivas notas nas provas.
//			-Listar Alunos: Exibir uma lista de todos os alunos com seus nomes, médias das notas e situação 
//				(aprovado, reprovado ou em recuperação).
//			-Buscar Aluno por Nome: Permitir a busca de um aluno pelo nome e exibir sua média e situação 
//				(aprovado, reprovado ou em recuperação).
//			-Listar Alunos Aprovados: Mostrar os nomes de todos os alunos aprovados.
//			-Listar Alunos em Recuperação: Mostrar os nomes de todos os alunos que estão em recuperação.
//			-Listar Alunos Reprovados: Mostrar os nomes de todos os alunos reprovados.
//			
//			Considere:
//			Aprovado média >=7
//			Reprovado média <3
//			Recuperação média entre 3 e 7
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		// CASO DE TESTE
		
		Aluno a = new Aluno();

		a.nome = "Pedro";
		a.notas.add(7.8);
		a.notas.add(8.6);
		a.notas.add(9.4);
		alunos.add(a);
		
		Aluno b = new Aluno();

		b.nome = "Genivaldo";
		b.notas.add(4.3);
		b.notas.add(5.6);
		b.notas.add(6.7);
		alunos.add(b);

		Aluno c = new Aluno();

		c.nome = "Reprovadinho Junior";
		c.notas.add(1.1);
		c.notas.add(3.3);
		c.notas.add(2.6);
		alunos.add(c);
		
		
		int op = 0;

		do {
			op = menu();
			switch (op) {
			case 1:
				cadastraAluno(alunos);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, listaAlunos(alunos));
				break;
			case 3:
				// Primeiro jeito que fiz, vou deixar comentado
				//JOptionPane.showMessageDialog(null, mostraAluno(alunos, encontraPosicao(alunos)));
				
				String lista = "";
				for (Aluno al : buscaPorNome(alunos)) {
					 lista += "\nNome: " + al.nome + "\nMedia: " + calculaMedia(al.notas); 
				}
				JOptionPane.showMessageDialog(null, lista);
				
				break;
			case 4:
				JOptionPane.showMessageDialog(null, listaAprovados(alunos));
				break;
			case 5:
				JOptionPane.showMessageDialog(null, listaRecuperacao(alunos));
				break;
			case 6:
				JOptionPane.showMessageDialog(null, listaReprovados(alunos));
				break;

			}

		} while (op != 9);

	}

	public static int menu() {
		String m = "1 - Cadastrar alunos e suas notas\n" 
				+ "2 - Listar alunos (nome, media, situacao)\n"
				+ "3 - Buscar aluno por nome (mostrar nome, media, situacao)\n"
				+ "4 - Listar alunos Aprovados (mostrar nomes)\n"
				+ "5 - Listar alunos em Recuperação (mostrar nomes)\n"
				+ "6 - Listar alunos Reprovados (mostrar nomes)\n\n"
				+ "9 - SAIR";

		int op = Integer.parseInt(JOptionPane.showInputDialog(m));

		if ((op < 1 || op > 6) && op != 9) {
			return menu();
		}
		return op;
	}

	public static void cadastraAluno(ArrayList<Aluno> alunos) {

		Aluno a = new Aluno();

		a.nome = JOptionPane.showInputDialog("Nome do aluno: ");

		double nota = 0;

		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Nota (-1 para sair)"));
			if (nota != -1) {
				a.notas.add(nota);
			}

		} while (nota != -1);

		alunos.add(a);
	}

	public static double calculaMedia(ArrayList<Double> notas) {
		double soma = 0;
		for (Double nota : notas) {
			soma += nota;
		}

		return formataDouble(soma / notas.size());
	}

	public static String verificaStatus(Aluno a) {

		double media = calculaMedia(a.notas);

		if (media >= 7) {
			return "APROVADO";
		} else if (media < 3) {
			return "REPROVADO";
		}
		return "EM RECUPERAÇÃO";
	}

	public static String listaAlunos(ArrayList<Aluno> alunos) {
		String lista = "";

		if (alunos.size() <= 0) {
			lista = "Nenhum aluno cadastrado";
		} else {
			for (Aluno a : alunos) {
				lista += "Nome: " + a.nome 
						+ "\nMédia: " + calculaMedia(a.notas) 
						+ "\nStatus: " + verificaStatus(a)
						+ "\n\n";
			}

		}

		return lista;
	}

	public static ArrayList<Aluno> buscaPorNome(ArrayList<Aluno> alunos) {
		ArrayList<Aluno> busca = new ArrayList<Aluno>();
		String nomeBusca = JOptionPane.showInputDialog("Nome para procurar:");
		
		int c = 0;
		do {
			if (alunos.get(c).nome.equals(nomeBusca)) {
				busca.add(alunos.get(c));
			}
			c++;
		} while (c < alunos.size());
		
		if (busca.size() <=0 ) {
			Aluno erro = new Aluno();
			erro.nome = "Aluno não encontrado/Aluno não cadastrado";
			erro.notas.add(0.0);
			busca.add(erro);
		}
		
		
		return busca;
	}
	
	public static int encontraPosicao(ArrayList<Aluno> alunos) {
		String nomeBusca = JOptionPane.showInputDialog("Nome para procurar:");
		boolean nomeEncontrado = false;
		int c = 0;

		do {
			if (alunos.get(c).nome.equals(nomeBusca)) {
				nomeEncontrado = true;
			}
			c++;

		} while (c < alunos.size() && !nomeEncontrado);

		if (!nomeEncontrado) {
			return -1;
		}

		return c-1;
	}
	
	public static String mostraAluno(ArrayList<Aluno> alunos, int pos) {
		String msg = "";
		
		if (pos < 0) {
			msg = "Aluno não encontrado";
		} else {
			msg = "Nome: " + alunos.get(pos).nome 
				+ "\nMedia: " + calculaMedia(alunos.get(pos).notas)
				+ "\nStatus: " + verificaStatus(alunos.get(pos))
				+ "\n\n";
		}
		
		return msg;
	}

	public static String listaAprovados(ArrayList<Aluno> alunos) {
		String lista = "Lista de alunos aprovados: \n\n";

		if (alunos.size() <= 0) {
			lista = "Nenhum aluno cadastrado";
		} else {

			double media = 0;
			
			for (Aluno a : alunos) {
				media = calculaMedia(a.notas);
				if (media >= 7) {
					lista += "Nome: " + a.nome + "\nMedia: " + media + "\n\n";
				}
			}

		}

		return lista;

	}
	
	public static String listaRecuperacao(ArrayList<Aluno> alunos) {
		String lista = "Lista de alunos em recuperacao: \n\n";

		if (alunos.size() <= 0) {
			lista = "Nenhum aluno cadastrado";
		} else {

			double media = 0;
			
			for (Aluno a : alunos) {
				media = calculaMedia(a.notas);
				if (media < 7 && media >= 3) {
					lista += "Nome: " + a.nome + "\nMedia: " + media + "\n\n";
				}
			}

		}

		return lista;

	}
	
	public static String listaReprovados(ArrayList<Aluno> alunos) {
		String lista = "Lista de alunos reprovados: \n\n";

		if (alunos.size() <= 0) {
			lista = "Nenhum aluno cadastrado";
		} else {

			double media = 0;
			
			for (Aluno a : alunos) {
				media = calculaMedia(a.notas);
				if (media < 3 ) {
					lista += "Nome: " + a.nome + "\nMedia: " + media + "\n\n";
				}
			}

		}

		return lista;

	}
	
	public static double formataDouble(double n) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00", symbols); 
        return Double.parseDouble(df.format(n));
    }
	
}
