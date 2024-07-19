package estruturas_de_decisao;

public class ExemploEstruturasCondicionais {

	public static void main(String[] args) {
		
		/* == IFS E AFINS ==
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("A é maior do que B");
		} else if(a == b) {
			System.out.println("A e B são iguais");
		} else {
			System.out.println("B é maior do que A");
		}
		
		Existem:
		- IF Simples
		- IF Composto (com else)
		- IF Encadeado (com else if)
		*/
		
		// == O LINDO E MARAVILHOSO SWITCH CASE <3 ==
		int turno = 3;
		switch(turno) {
				case 1:
					System.out.println("Matutino");
					break;
				case 2:
					System.out.println("Vespertino");
					break;
				case 3:
					System.out.println("Noturno");
					break;
				default:
					System.out.println("Turno inválido");
		}
		
	}
	
}
