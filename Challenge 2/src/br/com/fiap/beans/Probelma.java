package br.com.fiap.beans;

public class Probelma {

	private String pecaComProblema;
	private Veiculo veiculo;
	private double precoConserto;
	private boolean pronblemaComplexo;
	
	//metodo vazio
	public Probelma() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo cheio
	public Probelma(String pecaComProblema, Veiculo veiculo, double precoConserto, boolean pronblemaComplexo) {
		super();
		this.pecaComProblema = pecaComProblema;
		this.veiculo = veiculo;
		this.precoConserto = precoConserto;
		this.pronblemaComplexo = pronblemaComplexo;
	
	}
	public String getPecaComProblema() {
		return pecaComProblema;
	
	}
	public Veiculo getVeiculo() {
		return veiculo;
	
	}
	public double getPrecoConserto() {
		return precoConserto;
	
	}
	public boolean isPronblemaComplexo() {
		return pronblemaComplexo;
	
	}
	public void setPecaComProblema(String pecaComProblema) {
		this.pecaComProblema = pecaComProblema;
	
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	
	}
	public void setPrecoConserto(double precoConserto) {
		this.precoConserto = precoConserto;
	
	}
	public void setPronblemaComplexo(boolean pronblemaComplexo) {
		this.pronblemaComplexo = pronblemaComplexo;
	}
	public String toString() {
		return "Probelma [pecaComProblema=" + pecaComProblema + ", veiculo=" + veiculo + ", precoConserto="
				+ precoConserto + ", pronblemaComplexo=" + pronblemaComplexo + ", getPecaComProblema()="
				+ getPecaComProblema() + ", getVeiculo()=" + getVeiculo() + ", getPrecoConserto()=" + getPrecoConserto()
				+ ", isPronblemaComplexo()=" + isPronblemaComplexo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
