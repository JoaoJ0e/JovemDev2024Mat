package avaliacao1;

import javax.swing.JOptionPane;
import java.lang.Math;

public class CalculaEquacaoSegundoGrau {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C: "));
		
		JOptionPane.showMessageDialog(null, "X' = " + (-b + (( Math.sqrt((b*b) - 4*a*c))/2*a))
								        + "\nX'' = "+ (-b - (( Math.sqrt((b*b) - 4*a*c))/2*a)) );
	
		// Resultado NaN = Delta ficou negativo == sem solução!
		
		
	}

}
