package avaliacao1.melhoras;

import javax.swing.JOptionPane;

public class VelocidadeMelhorada {

	public static void main(String[] args) {
		double velocDownload = Double.parseDouble(JOptionPane.showInputDialog("Insira sua velocidade de download (em mb/s:"));
		double tamanhoArquivo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho do arquivo a ser baixado (em mb - megabytes):"));
				
		JOptionPane.showMessageDialog(null, "Tempo estimado de Download: "
									+ (int) (tamanhoArquivo / velocDownload/60) + " min " 
									+ (int) (tamanhoArquivo / velocDownload)%60 +" s");
		
	}

}
