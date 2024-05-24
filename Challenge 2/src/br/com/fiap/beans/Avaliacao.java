package br.com.fiap.beans;

public class Avaliacao {

	private Usuario usuario;
	private int avaliacao;
	
	//metodo vazio
	public Avaliacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo cheio
	public Avaliacao(Usuario usuario, int avaliacao) {
		super();
		this.usuario = usuario;
		this.avaliacao = avaliacao;
	
	}
	public Usuario getUsuario() {
		return usuario;
	
	}
	public int getAvaliacao() {
		return avaliacao;
	
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	
	}
	
	
	
}
