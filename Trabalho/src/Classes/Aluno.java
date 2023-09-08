package Classes;

import telas.TelaNotas;

public class Aluno extends Usuario{

    private  String nome;
    private Notas notas = new Notas();
    
	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}
    
  public void VerNotas() {
	 TelaNotas notas = new TelaNotas(this);
	 notas.setVisible(true); 
	}
 
}
