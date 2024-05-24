package br.com.fiap.beans;

public class Usuario {

	private int id;
	private String nomeUsuario;
	private int idadeUsuario;
	private String email;
	private String telefone;
	private Endereco endereco;
	private String planoDeSeguro;
	
	//metodo vazio
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	//metodo cheio
	public Usuario(int id, String nomeUsuario, int idadeUsuario, String email, String telefone, Endereco endereco,
			String planoDeSeguro) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.idadeUsuario = idadeUsuario;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.planoDeSeguro = planoDeSeguro;
		
	
	}
	public int getId() {
		return id;
	
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	
	}
	public int getIdadeUsuario() {
		return idadeUsuario;
	
	}
	public String getEmail() {
		return email;
	
	}
	public String getTelefone() {
		return telefone;
	
	}
	public Endereco getEndereco() {
		return endereco;
	
	}
	public String getPlanoDeSeguro() {
		return planoDeSeguro;
	
	}
	public void setId(int id) {
		this.id = id;
	
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	
	}
	public void setIdadeUsuario(int idadeUsuario) {
		this.idadeUsuario = idadeUsuario;
	
	}
	public void setEmail(String email) {
		this.email = email;
	
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	
	}
	public void setPlanoDeSeguro(String planoDeSeguro) {
		this.planoDeSeguro = planoDeSeguro;
	}
	public String toString() {
		return "Usuario [id=" + id + ", nomeUsuario=" + nomeUsuario + ", idadeUsuario=" + idadeUsuario + ", email="
				+ email + ", telefone=" + telefone + ", endereco=" + endereco + ", planoDeSeguro=" + planoDeSeguro
				+ ", getId()=" + getId() + ", getNomeUsuario()=" + getNomeUsuario() + ", getIdadeUsuario()="
				+ getIdadeUsuario() + ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone()
				+ ", getEndereco()=" + getEndereco() + ", getPlanoDeSeguro()=" + getPlanoDeSeguro() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}