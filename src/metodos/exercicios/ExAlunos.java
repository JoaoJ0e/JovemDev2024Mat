package metodos.exercicios;

import java.util.ArrayList;

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
		
		int op = 0;
		
		do {
			op = menu();
			switch (op) {
			case 1: 
				cadastraAluno(alunos);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, listaAlunos(alunos));;
				break;
			case 3:
				JOptionPane.showMessageDialog(null, encontraPorNome(alunos)); // fazer funcionar
				break;
			case 4:
				//listaAprovados();
				break;
			case 5:
				//listaRecuparacao();
				break;
			case 6:
				//listaReprovados();
				break;
				

			
		}

		} while(op != 9);
		
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
		
		return soma/notas.size();
	}
	
	public static String verificaStatus(Aluno a) {
			
			double media = calculaMedia(a.notas);
			
			if (media >= 7) {
				return "APROVADO";
			} else if (media < 3){ 
				return "REPROVADO";
			}
			return "EM RECUPERAÇÃO";
		}
	
	public static String listaAlunos(ArrayList<metodos.exercicios.Aluno> alunos) {
		String lista = "";
		
		for (Aluno a : alunos) {
			lista += "Nome: " + a.nome + "\nMédia: " + calculaMedia(a.notas) + "\nStatus: " + verificaStatus(a) + "\n\n";
		}
		
		return lista;
	}
	
	public static Aluno encontraPorNome(ArrayList<Aluno> alunos) {		
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
			return null ;
		}
		
		return alunos.get(c-1);
	}
	
	
	
}
