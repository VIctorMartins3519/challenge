package br.com.fiap.beans;

public class Veículo {

	private String placa;
	private int documento;
	private int ano;
	private String marca;
	private String cor;
	
	//metodo cheio
	public Veículo(String placa, int documento, int ano, String marcar, String cor) {
		super();
		this.placa = placa;
		this.documento = documento;
		this.ano = ano;
		this.marca = marcar;
	}
	//metodo vazio
	public Veículo() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getDocumento() {
		return documento;
	}
	
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getMarcar() {
		return marca;
	}
	
	public void setMarcar(String marcar) {
		this.marca = marcar;
	}
	
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
	}
}