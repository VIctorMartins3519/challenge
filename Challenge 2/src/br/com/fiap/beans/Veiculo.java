package br.com.fiap.beans;

public class Veiculo {

	private int id; 
	private String marca;
	private String modelo;
	private String cor;
	private String pecaQuebrada;
	private Usuario donoDoVeiculo;
	private String placa;

	//metodo vazio
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo cheio
	public Veiculo(int id, String marca, String modelo, String cor, String pecaQuebrada, Usuario donoDoVeiculo) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.pecaQuebrada = pecaQuebrada;
		this.donoDoVeiculo = donoDoVeiculo;
	
	}
	public int getId() {
		return id;
	
	}
	public String getMarca() {
		return marca;
	
	}
	public String getModelo() {
		return modelo;
	
	}
	public String getCor() {
		return cor;
	
	}
	public String getPecaQuebrada() {
		return pecaQuebrada;
	
	}
	public Usuario getDonoDoVeiculo() {
		return donoDoVeiculo;
	
	}
	public void setId(int id) {
		this.id = id;
	
	}
	public void setMarca(String marca) {
		this.marca = marca;
	
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	
	}
	public void setCor(String cor) {
		this.cor = cor;
	
	}
	public void setPecaQuebrada(String pecaQuebrada) {
		this.pecaQuebrada = pecaQuebrada;
	
	}
	public void setDonoDoVeiculo(Usuario donoDoVeiculo) {
		this.donoDoVeiculo = donoDoVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", pecaQuebrada="
				+ pecaQuebrada + ", donoDoVeiculo=" + donoDoVeiculo + ", placa=" + placa + ", getId()=" + getId()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getCor()=" + getCor()
				+ ", getPecaQuebrada()=" + getPecaQuebrada() + ", getDonoDoVeiculo()=" + getDonoDoVeiculo()
				+ ", getPlaca()=" + getPlaca() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}