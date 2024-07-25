package aula_introducao;

public class ExemploMedidaTempo {

	public static void main(String[] args) {

		String[] nomes = new String[10000];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = "nome " + i;
		}

		String[] buscas = { "X", "nome 9999", "nome 0" };

		for (String busca : buscas) {
			String ret = "NÃO EXISTE";

			long t1 = System.nanoTime();

			// Jeito ruim
//			for (String s : nomes) {
//				if(s.equals(busca)) {
//					ret = "Achei";
//				} else {
//					ret = "Não achei";
//				}

			// Jeito bom
			int pos = 0;
			do {

				if (nomes[pos].equals(busca)) {
					ret = "Achei";
				} else {
					ret = "Não achei";
				}

				System.out.println(ret);
				long t2 = System.nanoTime();

				System.out.println(t2 - t1);

			} while (pos < nomes.length && ret.equals("NÃO EXISTE"));

		}

	}
}
