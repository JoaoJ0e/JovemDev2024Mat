package avaliacao_2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {
	
	/*
	 *  	Um medicamento, além do nome comercial, tem os nomes dos princípios ativos que o compõe.

			Por exemplo, o medicamento CIMEGRIPE é composto por:
			- PARACETAMOL,
			- CLORFENIRAMINA 
			- FENILEFRINA.
			Já o medicamento TYLENOL é composto por 
			- PARACETAMOL
			
			Desta forma, um medicamento pode ter um ou vários princípios ativos e um princípio ativo pode ser utilizado em vários medicamentos.
			
			Pede-se um programa que possibilite o cadastro de medicamentos com os seguintes requisitos:
			
			a.	Utilize Registro para representar cada medicamento
			b.	Utilize sub-rotinas para realizar as operações solicitadas.
			c.	Utilize ArrayList para armazenar os medicamentos
			d.	Restrinja a inclusão de no máximo 500 medicamentos 
			
			O programa deve exibir um menu com as seguintes opções:
			
			1 – Incluir medicamento {fazer o cadastro do medicamento em memória}
			2 – Listar todos os medicamentos { listar todos os medicamentos cadastrados cada qual com os respectivos princípios ativos}
			3 – Buscar por nome de princípio ativo {usuário digita o nome de um princípio ativo e o programa mostra todos os medicamentos que contém aquele o princípio ativo}
			4 – Mostrar o percentual de memória livre {o programa deve mostrar em PERCENTUAL a quantidade disponível para cadastro}
			0 – Sair do sistema

	 */

	public static void main(String[] args) {

		ArrayList<Medicamento> meds = new ArrayList<Medicamento>();

		

//		// CASO DE TESTE
//		Medicamento m = new Medicamento();
//		m.nome = "CIMEGRIPE";
//		m.ativos.add("PARACETAMOL");
//		m.ativos.add("CLORFENIRAMINA");
//		m.ativos.add("FENILEFRINA");
//		meds.add(m);
//		
//		m = new Medicamento();
//		m.nome = "TYLENOL";
//		m.ativos.add("PARACETAMOL");
//		meds.add(m);
//		
//		
//		// Adiciona medicamentos teste
//		
//		//Medicamento m = null;
//		for (int i = 0; i < 250; i++) {
//			m = new Medicamento();
//			m.nome = "Nome " + i;
//			m.ativos.add(i+"");
//			meds.add(m);
//		}
//		
//		// =============

		int op = 0;

		do {
			op = menu();
			switch (op) {
			case 1:
				cadastraMedicamento(meds);
				break;
			case 2:
				listaMedicamentos(meds);
				break;
			case 3:
				String msg = "Medicamentos contendo o Ativo digitado: \n";
				for (Medicamento b : buscaPorAtivo(meds)) {
					msg += mostraMedicamento(b);
				}
				
				if (msg.equals("Medicamentos contendo o Ativo digitado: \n")) {
					msg = "Nenhum medicamento cadastrado contém o ativo digitado";
				}
				
				JOptionPane.showMessageDialog(null, msg);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, mostraPercentualLivre(meds));
				break;
			}
		} while (op != 0);

	}

	// testar
	public static int menu() {
		String menu = "1 - Incluir medicamento\n"
				+ "2 - Listas todos os medicamentos\n"
				+ "3 - Buscar por nome de princípio ativo\n"
				+ "4 - Mostrar o percentual de memória livre\n"
				+ "0 - Sair do sistema";
		
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));

		if (op < 0 && op > 4) {
			return menu();
		}

		return op;
	}

	// testar
	public static void cadastraMedicamento(ArrayList<Medicamento> meds) {

		if (meds.size() >= 500) {
			JOptionPane.showMessageDialog(null, "Erro: Memória cheia! Limite de 500 cadastros foi atingido");
		} else {
			Medicamento m = new Medicamento();
			m.nome = JOptionPane.showInputDialog("Insira o nome do medicamento a ser cadastrado:").toUpperCase();
			String ativo = "";
			do {
				ativo = JOptionPane.showInputDialog("Digite um ativo de " + m.nome + " ('0' para encerrar)").toUpperCase();
				if (!ativo.equals("0")) {
					m.ativos.add(ativo);
				}
			} while (!ativo.equals("0"));
			meds.add(m);
		}

	}

	public static String mostraMedicamento(Medicamento m) {
		String lista = "\nNome: " + m.nome + "\nPrincípios Ativos: \n";
		for (String s : m.ativos) {
			lista += "-> " + s + "\n";
		}

		return lista;

	}

	public static void listaMedicamentos(ArrayList<Medicamento> meds) {
		String lista = "";

		// Validação de tamanho
		if (meds.size() <= 0) {
			JOptionPane.showMessageDialog(null, "Nenhum medicamento cadastrado");
		} else if (meds.size() > 500) {
			JOptionPane.showMessageDialog(null, "Erro: Memória cheia! Limite de 500 cadastros foi atingido");

		// Trata uma lista pequena de forma mais adequada
		} else if (meds.size() <= 10) {
			for (Medicamento m : meds) {
				lista += mostraMedicamento(m);
			}
			JOptionPane.showMessageDialog(null, lista);

		// Quando a lista possui mais de 10 itens, mostra-os em páginas separas, de 10 em 10.
		} else {
			int x = 10;
			for (int i = 0; i < ((meds.size() / 10) + 1); i++) { // i = qtd de paginas que serão mostradas
				lista = "";
				for (int j = x - 10; j < x; j++) {
					lista += mostraMedicamento(meds.get(j));
				}
				JOptionPane.showMessageDialog(null, lista);

				x += 10;

			}

		}
	}

	public static ArrayList<Medicamento> buscaPorAtivo(ArrayList<Medicamento> meds) {
		ArrayList<Medicamento> medsBusca = new ArrayList<Medicamento>();

		if (meds.size() <= 0) {
			JOptionPane.showMessageDialog(null, "Nenhum medicamento cadastrado");
			return medsBusca;
		}

		String ativoBusca = JOptionPane.showInputDialog("Digite um ativo para ver os medicamentos que o contêm:")
				.toUpperCase();

		int c = 0;
		do {
			if (meds.get(c).ativos.contains(ativoBusca)) {
				medsBusca.add(meds.get(c));
			}
			c++;
		} while (c < meds.size());

		return medsBusca;

	}

	public static double calculaPercentualLivre(ArrayList<Medicamento> meds) {
		return 100 - ((double) meds.size() / 5);
	}

	public static double formataDouble(double n) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		DecimalFormat df = new DecimalFormat("#.00", symbols);
		return Double.parseDouble(df.format(n));
	}

	public static String mostraPercentualLivre(ArrayList<Medicamento> meds) {
		return "Percentual de memória livre: " + formataDouble(calculaPercentualLivre(meds)) + "%\n"
				+ "Espaços ocupados: " + meds.size()
				+ "\nEspaços livres: " + (500 - meds.size());
	}
	
}
