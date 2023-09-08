package pack;

import Classes.Id_Senha;
import telas.TelaLogin;

public class Principal {
	
	public static void main(String[] args) {
		Id_Senha IdSenha = new Id_Senha();
		TelaLogin login = new TelaLogin(IdSenha.getAlunoInfo());
		login.frame.setVisible(true);
		
	}
}
