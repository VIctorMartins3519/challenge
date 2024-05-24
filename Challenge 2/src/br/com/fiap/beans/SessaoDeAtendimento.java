package br.com.fiap.beans;

public class SessaoDeAtendimento {

	private int idAtendimento;
	private Usuario usuarioEmAtendimento;
	private boolean sesssaoFinalizada;
	
	//metodo vazio
	public SessaoDeAtendimento() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo cheio
	public SessaoDeAtendimento(int idAtendimento, Usuario usuarioEmAtendimento, boolean sesssaoFinalizada) {
		super();
		this.idAtendimento = idAtendimento;
		this.usuarioEmAtendimento = usuarioEmAtendimento;
		this.sesssaoFinalizada = sesssaoFinalizada;
	
	}
	public int getIdAtendimento() {
		return idAtendimento;
	
	}
	public Usuario getUsuarioEmAtendimento() {
		return usuarioEmAtendimento;
	
	}
	public boolean isSesssaoFinalizada() {
		return sesssaoFinalizada;
	
	}
	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	
	}
	public void setUsuarioEmAtendimento(Usuario usuarioEmAtendimento) {
		this.usuarioEmAtendimento = usuarioEmAtendimento;
	
	}
	public void setSesssaoFinalizada(boolean sesssaoFinalizada) {
		this.sesssaoFinalizada = sesssaoFinalizada;
	}
	
	
}
