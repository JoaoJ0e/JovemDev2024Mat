package avaliacao1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalculaVelocidadeDeDownload {

	public static void main(String[] args) {
		double velocDownload = Double.parseDouble(JOptionPane.showInputDialog("Insira sua velocidade de download (em mb/s:"));
		double tamanhoArquivo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho do arquivo a ser baixado (em mb - megabytes):"));
		
		DecimalFormat min = new DecimalFormat("#");
		min.setRoundingMode(RoundingMode.FLOOR);
		
		double minutos = tamanhoArquivo / velocDownload/60;
		double segundos = (tamanhoArquivo / velocDownload)%60;
		
		JOptionPane.showMessageDialog(null, "Tempo estimado de Download: "
				+ min.format(minutos) + " min " + segundos +" s");
		
	}

}
