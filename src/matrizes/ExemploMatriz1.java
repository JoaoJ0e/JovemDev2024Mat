package matrizes;

import java.util.Random;

public class ExemploMatriz1 {
	
	public static void main(String[] args) {
		int[][] matriz = new int [4][4]; 
		
		String[] linhas = {"Lobisomem", "Bruxa", "Saci", "Mula"};
		String[] colunas = {"Nova", "Cheia", "Minguante", "Crescente"};
		
		Random r = new Random();
		
		matriz[0][0] = r.nextInt(99);
		matriz[0][1] = r.nextInt(99);
		matriz[0][2] = r.nextInt(99);
		matriz[0][3] = r.nextInt(99);
		
		matriz[1][0] = r.nextInt(99);
		matriz[1][1] = r.nextInt(99);
		matriz[1][2] = r.nextInt(99);
		matriz[1][3] = r.nextInt(99);
		
		matriz[2][0] = r.nextInt(99);
		matriz[2][1] = r.nextInt(99);
		matriz[2][2] = r.nextInt(99);
		matriz[2][3] = r.nextInt(99);
		
		
		matriz[3][0] = r.nextInt(99);
		matriz[3][1] = r.nextInt(99);
		matriz[3][2] = r.nextInt(99);
		matriz[3][3] = r.nextInt(99);
		
		int[][] matriz2 = {{1,2},{3,4,5,6},{7},{8,9}};
		System.out.println(matriz2.length);
		System.out.println(matriz2[0].length);
		System.out.println(matriz2[1].length);
		System.out.println(matriz2[2].length);
		System.out.println(matriz2[3].length);
		System.out.println("====================");
		
		// Mostrar a matriz no formato original
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + "\t");
			} 
		}

		/*
		 * Somar cada linha e apresentar:
		 * LINHA 1: X
		 * LINHA 2: X
		 * ...
		 */
		
		int[] somaLinhas = new int[matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 4; j++) {
				somaLinhas[i] += matriz[i][j];			
			} 
		}
		
		for (int i = 0; i < somaLinhas.length; i++) {
				System.out.print("\n" + linhas[i] + ": " + somaLinhas[i]);
		}
		
		System.out.println();

		/*
		 * Somar cada coluna e apresentar:
		 * COLUNA 1: X
		 * COLUNA 2: X
		 * ...
		 */
		
		for (int i = 0; i < matriz.length; i++) {
			int somaColuna = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				somaColuna +=  matriz[j][i];
			} 
			System.out.print("\n" + colunas[i] + ": " + somaColuna);
		}

		System.out.println();

		
		/*
		 * Somar diagonal principal e apresentar:
		 */
		int somaDiagonal = 0;
		for (int i = 0; i < matriz.length; i++) {
			somaDiagonal +=  matriz[i][i];
		}
		System.out.println("\nDIAG. PRINCIPAL: "+ somaDiagonal);
		
	}
}
