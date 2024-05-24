package br.com.fiap.beans;

public class Cliente {

	private String nome;
	private String sobrenome;
	private int idade;
	private String email;
	
	//metodo vazio
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//metodo cheio
	public Cliente(String nome, String sobrenome, int idade, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
