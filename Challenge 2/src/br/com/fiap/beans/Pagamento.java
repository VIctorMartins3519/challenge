package br.com.fiap.beans;

public class Pagamento {

	private int id;
	private String metodoDePagamento;
	private String statusPagamento;
	private double valor;
	private int tokenSeguranca;
	
	//metodo vazio
	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo cheio
	public Pagamento(int id, String metodoDePagamento, String statusPagamento, double valor, int tokenSeguranca) {
		super();
		this.id = id;
		this.metodoDePagamento = metodoDePagamento;
		this.statusPagamento = statusPagamento;
		this.valor = valor;
		this.tokenSeguranca = tokenSeguranca;
	
	}
	public int getId() {
		return id;
	
	}
	public String getMetodoDePagamento() {
		return metodoDePagamento;
	
	}
	public String getStatusPagamento() {
		return statusPagamento;
	
	}
	public double getValor() {
		return valor;
	
	}
	public int getTokenSeguranca() {
		return tokenSeguranca;
	
	}
	public void setId(int id) {
		this.id = id;
	
	}
	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	
	}
	public void setValor(double valor) {
		this.valor = valor;
	
	}
	public void setTokenSeguranca(int tokenSeguranca) {
		this.tokenSeguranca = tokenSeguranca;
	}
	public String toString() {
		return "Pagamento [id=" + id + ", metodoDePagamento=" + metodoDePagamento + ", statusPagamento="
				+ statusPagamento + ", valor=" + valor + ", tokenSeguranca=" + tokenSeguranca + ", getId()=" + getId()
				+ ", getMetodoDePagamento()=" + getMetodoDePagamento() + ", getStatusPagamento()="
				+ getStatusPagamento() + ", getValor()=" + getValor() + ", getTokenSeguranca()=" + getTokenSeguranca()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
