package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex2Cores {

	public static void main(String[] args) {
        
        int qntCores = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cores:"));
        String[] cores = new String[qntCores];

        
        for (int i = 0; i < qntCores; i++) {
            cores[i] = JOptionPane.showInputDialog("Insira a cor nº " + (i + 1));
        }

        
        String msgCoresInvertidas = "Cores na ordem inversa: ";

        
        for (int i = qntCores - 1; i >= 0; i--) {
            msgCoresInvertidas += cores[i];
            if (i > 0) {
                msgCoresInvertidas += " - ";
            }
        }

        // Display the reversed order of colors
        JOptionPane.showMessageDialog(null, msgCoresInvertidas);
	}

}
