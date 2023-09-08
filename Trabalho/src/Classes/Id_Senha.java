package Classes;

import java.util.HashMap;

import javax.swing.ImageIcon;

public class Id_Senha {
	private HashMap<String, Aluno> IdSenha = new HashMap<String, Aluno>();
	private Aluno Alexandre = new Aluno();
	private Aluno Davi = new Aluno();
	private Aluno Danilo = new Aluno();
	private Aluno Joao = new Aluno();
	
	public Id_Senha(){
		Alexandre.setLogin("227067");
		Alexandre.setSenha("10");
		Alexandre.setNome("Alexandre");
		Alexandre.setFoto(new ImageIcon(getClass().getResource("Ale.jpg")));
		Davi.setLogin("227164");
		Davi.setSenha("10");
		Davi.setNome("Davi");
		Davi.setFoto(new ImageIcon (getClass().getResource("Davi.jpg")));
		Danilo.setLogin("227157");
		Danilo.setSenha("10");
		Danilo.setNome("Danilo");
		Joao.setNome("João");
		Joao.setSenha("10");
		Joao.setLogin("227094");
		Joao.setFoto(new ImageIcon (getClass().getResource("Joao.jpeg")));
		
		
		IdSenha.put(Alexandre.getLogin(), Alexandre);
		IdSenha.put(Davi.getLogin(), Davi);
		IdSenha.put(Danilo.getLogin(), Danilo);
		IdSenha.put(Joao.getLogin(), Joao);
		
	}

	public HashMap<String, Aluno> getAlunoInfo(){
		return IdSenha;
	}
	
	
}
