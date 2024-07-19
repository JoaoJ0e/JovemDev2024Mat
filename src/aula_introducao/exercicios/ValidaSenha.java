package aula_introducao.exercicios;

import javax.swing.JOptionPane;

public class ValidaSenha {

	public static void main(String[] args) {
		
		String senhaInput = JOptionPane.showInputDialog(null, "Cria sua senha, seguindo os requisitos abaixo:" 
														+ "\n-> 8 ou mais caracteres"
														+ "\n-> Deve conter letras e números"
														+ "\n-> 1 ou mais letras maiúsculas" 
														+ "\n-> 1 ou mais destes caracteres: !  @  #  %  & ");

		boolean senhaValida = true; // Variavel que controla a validez da senha
		String msgInvalidez = "Senha inválida! Sua senha deve:";
		
		// Verifica cada requisito da senha indiviualmente
		
		// Verifica se possui letra e números
		if (!senhaInput.matches(".*[a-zA-Z].*") || (!senhaInput.matches(".*[0-9].*"))) {
			msgInvalidez += "\n-> Conter letras e números";
			senhaValida = false;
		} // Verifica se possui letras maiúsculas
		if (!senhaInput.matches(".*[A-Z].*")) {
			msgInvalidez += "\n-> Conter no mínimo uma letra maiúscula";
			senhaValida = false;
		} // Verifca se possui um dos caracteres especiais definidos no enunciado
		if (!senhaInput.matches(".*[!@#%&].*")) {
			msgInvalidez += "\n-> Conter pelo menos um destes caracteres especiais: !  @  #  %  &";
			senhaValida = false;
		} // Verifica o comprimento
		if (senhaInput.length() < 8) {
			msgInvalidez += "\n-> Ter 8 ou mais caracteres";
			senhaValida = false;
		}

		// Se a senha é válida, pede a confirmação da senha
		if (senhaValida) {
            String confirmacaoSenha = JOptionPane.showInputDialog(null, "Agora, confirme sua senha:");

            if (!senhaInput.equals(confirmacaoSenha)) {
                JOptionPane.showMessageDialog(null, "As senhas são diferentes! Insira a mesma senha em ambos os campos.");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Senha criada com sucesso!");
            }
		} else {
			JOptionPane.showMessageDialog(null, msgInvalidez);
		}

	}

}