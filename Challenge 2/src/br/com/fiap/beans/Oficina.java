package br.com.fiap.beans;

public class Oficina {

	
	private int id;
	private Endereco endereco;
	private String cnpj;
	private String razaoSocial;
	private boolean oficinaDaPorto;
	private String especiealidade;
	
	//metodo vazio
	public Oficina() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo cheio
	public Oficina(int id, Endereco endereco, String cnpj, String razaoSocial, boolean oficinaDaPorto,
			String especiealidade) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.oficinaDaPorto = oficinaDaPorto;
		this.especiealidade = especiealidade;
	
	}
	public int getId() {
		return id;
	
	}
	public Endereco getEndereco() {
		return endereco;
	
	}
	public String getCnpj() {
		return cnpj;
	
	}
	public String getRazaoSocial() {
		return razaoSocial;
	
	}
	public boolean isOficinaDaPorto() {
		return oficinaDaPorto;
	
	}
	public String getEspeciealidade() {
		return especiealidade;
	
	}
	public void setId(int id) {
		this.id = id;
	
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	
	}
	public void setOficinaDaPorto(boolean oficinaDaPorto) {
		this.oficinaDaPorto = oficinaDaPorto;
	
	}
	public void setEspeciealidade(String especiealidade) {
		this.especiealidade = especiealidade;
	}
	
	
}
