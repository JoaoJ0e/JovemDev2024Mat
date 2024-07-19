package aula_introducao;
/*
import java.math.RoundingMode;
import java.text.DecimalFormat;

sim, ele da warning mesmo comentado.
*/
import javax.swing.JOptionPane;

public class ExercicioConversoes {

	public static void main(String[] args) {
	/*
	  	== USANDO DECIMALFORMAT ==
		DecimalFormat df = new DecimalFormat("#.#####");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		
		double pe = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a medida em Pés: "));
		JOptionPane.showMessageDialog(null, "-=- CONVERSÕES -=-\n"
				+ df.format(pe) + " pés é equivalente à:\n -> "
				+ df.format(pe * 12) + " Polegadas\n -> " 
				+ df.format(pe / 3) + " Jardas\n -> " 
				+ df.format(pe / 5280) +" Milhas" );
	*/
		
		// == USANDO STRING.FORMAT (Padrão) ==
		double pe = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a medida em Pés: "));
		JOptionPane.showMessageDialog(null, String.format("-=- CONVERSÕES -=-\n"
		        + "%.5f pés é equivalente à:\n -> "
				+ "%.5f Polegadas\n ->" 
		        + "%.5f Jardas\n -> "
				+ "%.5f Milhas",
		          pe, pe * 12, pe / 3, pe / 5280));

		
	}

}
