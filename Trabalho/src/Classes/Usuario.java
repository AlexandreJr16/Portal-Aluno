package Classes;

import javax.swing.ImageIcon;

public abstract class Usuario {
	
	private String login, senha;
    private ImageIcon foto = new ImageIcon();
    
	public Usuario() {
		super();
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ImageIcon getFoto() {
		return foto;
	}

	public void setFoto(ImageIcon foto) {
		this.foto = foto;
	}
	
	

}
