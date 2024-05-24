package br.com.fiap.beans;

public class Agendamento {

	private int idAgendamento;
	private String horario;
	private String tipoDeServiço;
	
	//metodo vazio
	public Agendamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo cheio
	public Agendamento(int idAgendamento, String horario, String tipoDeServiço) {
		super();
		this.idAgendamento = idAgendamento;
		this.horario = horario;
		this.tipoDeServiço = tipoDeServiço;
	
	}
	public int getIdAgendamento() {
		return idAgendamento;
	
	}
	public String getHorario() {
		return horario;
	
	}
	public String getTipoDeServiço() {
		return tipoDeServiço;
	
	}
	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	
	}
	public void setHorario(String horario) {
		this.horario = horario;
	
	}
	public void setTipoDeServiço(String tipoDeServiço) {
		this.tipoDeServiço = tipoDeServiço;
	
	}
	
	
}
