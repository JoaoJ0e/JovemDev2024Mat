package vetores;

import javax.swing.JOptionPane;

public class ExemploVetores {

	public static void main(String[] args) {
//		Declaração de Vetores
//		String[] nomes = new String[10];
//		int[] idades = new int[10];
		
        String[] nomes = new String[100]; 
		String nome = "";
		int c = 0;
		
		do {
			if (c < 100) {
				nome = JOptionPane.showInputDialog("Insira o nome da pessoa nº " + c);
				if (!nome.equals("")) {
					nomes[c] = nome;
					c++;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Memória cheia!");
			}
		} while(!nome.equals(""));
		
		for(int i=0; i < c; i++) {
			System.out.println(nomes[i]);
		}
		
	}

}
