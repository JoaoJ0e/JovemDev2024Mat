package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex2Cores {

	public static void main(String[] args) {
		int qntCores = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cores:"));
		String[] cores = new String[qntCores];
		
		// Guarda as cores no vetor cores
		for(int i = 0; i < qntCores; i++) {
			cores[i] = JOptionPane.showInputDialog("Insira a cor nroº " + (i+1));
		}
		
		String msgCoresInvertidas = "";
		
		// Mostra as cores na ordem inversa
		for(int i = qntCores; i > 0; i--) {
			msgCoresInvertidas += cores[i] + " ";
		}
	
	
	JOptionPane.showMessageDialog(null, msgCoresInvertidas);
	
	}

}
