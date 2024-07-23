package vetores;

import java.util.Random;

public class ExemploVetores2 {

	public static void main(String[] args) {
		String[] meses = {
				"Janeiro",
				"Fevereiro",
				"Março",
				"Abril",
				"Maio",
				"Junho",
				"Julho",	
				"Agosto",	
				"Setembro",	
				"Outubro",	
				"Novembro",	
				"Dezembro",	
		};
		
		for (String m : meses) {
			System.out.println(m);
		}

		System.out.println(meses[new Random().nextInt(6)]);
		
	}

}
