package matrizes.exercicios;

import javax.swing.JOptionPane;

public class Ex1Alunos {

	public static void main(String[] args) {
		
		/*
		 * Uma turma com N alunos realizou X provas. Faça um programa que cadastre os alunos e as notas obtidas 
		 * em cada prova, armazenando essas informações em matrizes e vetores conforme a melhor arquitetura. 
		 * Apenas os nomes dos alunos e as notas de cada prova devem ser armazenados durante o cadastro, 
		 * sem acumular outras informações.

			O programa deve permitir as seguintes funcionalidades:
			
			-Cadastrar Alunos e Notas: Permitir o cadastro de alunos e suas respectivas notas nas provas.
			-Listar Alunos: Exibir uma lista de todos os alunos com seus nomes, médias das notas e situação 
				(aprovado, reprovado ou em recuperação).
			-Buscar Aluno por Nome: Permitir a busca de um aluno pelo nome e exibir sua média e situação 
				(aprovado, reprovado ou em recuperação).
			-Listar Alunos Aprovados: Mostrar os nomes de todos os alunos aprovados.
			-Listar Alunos em Recuperação: Mostrar os nomes de todos os alunos que estão em recuperação.
			-Listar Alunos Reprovados: Mostrar os nomes de todos os alunos reprovados.
			
			Considere:
			Aprovado média >=7
			Reprovado média <3
			Recuperação média entre 3 e 7
		 * 
		 */
		
		String menu = "1 - Cadastrar alunos e suas notas\n" // Feito!
				+ "2 - Listar alunos (nome, media, situacao)\n"
				+ "3 - Buscar aluno por nome (mostrar nome, media, situacao)\n"
				+ "4 - Listar alunos Aprovados (mostrar nomes)\n"
				+ "5 - Listar alunos em Recuperação (mostrar nomes)\n"
				+ "6 - Listar alunos Reprovados (mostrar nomes)\n\n"
				+ "9 - SAIR";
		
		int op = 0;
		int c = 0;
		
		String[] alunos = new String[50];
		int qtdNotas =  Integer.parseInt(JOptionPane.showInputDialog("Número de provas para esse semestre?"));
		
		double[][] notasAlunos = new double[alunos.length][qtdNotas];
		
		// CASO DE TESTE
		
		alunos[0] = "Pedro";
		alunos[1] = "João";
		alunos[2] = "José";
		alunos[3] = "Gabriel";
		alunos[4] = "Jeremias";
		

		// Aprovado
		notasAlunos[0][0] = 8.3;
		notasAlunos[0][1] = 7.6;
		notasAlunos[0][2] = 10;
		
		// Recuperação
		notasAlunos[1][0] = 2;
		notasAlunos[1][1] = 4;
		notasAlunos[1][2] = 6;

		
		// Reprovado
		notasAlunos[2][0] = 1;
		notasAlunos[2][1] = 2;
		notasAlunos[2][2] = 3;

		
		// Aprovado
		notasAlunos[3][0] = 9;
		notasAlunos[3][1] = 9;
		notasAlunos[3][2] = 9;
		
		// Recuperação
		notasAlunos[4][0] = 5;
		notasAlunos[4][1] = 5;
		notasAlunos[4][2] = 5;
		
		c = 5;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				// 1 - Cadastrar alunos
				if (c < 50) {
					alunos[c] = JOptionPane.showInputDialog("Nome do aluno nº" + (c+1));
					
					int i = 0;
					
					do { // Cadastrar todas as notas do aluno
						notasAlunos[c][i] = Double.parseDouble(JOptionPane.showInputDialog(
								"Nota " + (i+1) + " de " + alunos[c]));
						i++;
					} while (i < qtdNotas);
					
					c++;
					
				} else {
					JOptionPane.showMessageDialog(null, "Memória cheia!");
				}
				break;
				
			case 2:
				// 2 - Listar alunos (nome, media, situacao)
				String msg1 = "";
				
				for (int i = 0; i < c; i++) {
					msg1 += "Aluno " + (i+1) + ": " + alunos[i] + "\n";
				}				
				System.out.println(msg1);
				break;
				
			case 3:
				
				
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
				
			case 6:
				break;
				
			case 9:
				// Fecha o programa
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
	
			}
			
		} while (op != 9);
		
	}
	
}
