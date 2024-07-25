package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
//		double nota1 = 10.0;
//		double nota2 = 5.0;
//		
//		System.out.println(verificaAprovacao(calculaMedia(nota1, nota2)));
		
//		int x = 10;
//		
//		manipulaPrimitivo(x);
//		System.out.println(x);
		
//		String nome = "capitão jack sparrow";
//		
//		manipulaString(nome);
//		System.out.println(nome);
		
		String[] v = {"aqui não tem ABC"};
		manipulaVetor(v);
		System.out.println(v[0]);
	}
	
	// Objetos não guardam valores, guardam endereços de memória!
	
	public static void manipulaVetor(String[] v) {
		v[0] = "Agora tem ABC";
		System.out.println(v[0]);
	}
	
	
	public static void manipulaString(String str) {
		str = str.toUpperCase();
		System.out.println(str);
		}
	

	public static void manipulaPrimitivo(int numero) {
		numero += 10;
		System.out.println(numero);
	}
	
	
	public static double calculaMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}

	public static String verificaAprovacao(double media) {
		// Se acontece um return, o programa sai da função.
		// Por isso, não precisamos de mais um else!
		
		if (media >= 7) {
			return "APROVADO";
		} else if (media < 3) {
			return "REPROVADO";
		}

		return "RECUPERAÇÃO";
	}
	
	public static void testeVariaveis() {
		int a = 10;
		int b = 5;
		System.out.println(a + b);
	}
	
	
	
}
