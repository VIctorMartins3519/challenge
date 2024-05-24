package br.com.fiap.main;

import br.com.fiap.beans.LoginSessao;
import br.com.fiap.beans.Usuario;
import br.com.fiap.beans.Avaliacao;
import br.com.fiap.beans.SessaoDeAtendimento;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.Veiculo;
import br.com.fiap.beans.Probelma;
import br.com.fiap.beans.Agendamento;
import br.com.fiap.beans.Pagamento;

public class TesteSistema {

	
	public static void main(String[] args) {
        Usuario usuario = new Usuario();
        LoginSessao loginSessao = new LoginSessao();
        Avaliacao avaliacao = new Avaliacao();
        SessaoDeAtendimento sessaoDeAtendimento = new SessaoDeAtendimento();
        Endereco endereco = new Endereco();
        Oficina oficina = new Oficina();
        Veiculo veiculo = new Veiculo();
        Problema problema = new Problema(); 
        Agendamento agendamento = new Agendamento();
        Pagamento pagamento = new Pagamento();
    	public String getPlaca() {
    		return placa;
    		public String getPlaca() {
    			return placa;
    		}
    		public void setPlaca(String placa) {
    			this.placa = placa;
    		}
    	public void setPlaca(String placa) {
    		this.placa = placa;
        usuario.setNome("João");
        usuario.setEmail("joao@example.com");

       
        System.out.println("Informações do Usuário:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail()); 
	}
		}
Agendamento agendamento = new Agendamento();
agendamento.setUsuario(usuario);
agendamento.setVeiculo(veiculo);
agendamento.setOficina(oficina);
agendamento.setProblema(problema);
agendamento.setData("2024-05-30");
agendamento.setHorario("09:00");

Pagamento pagamento = new Pagamento();
pagamento.setValor(200.50);
pagamento.setDescricao("Pagamento pelo serviço de reparo");

// Exibir informações de Agendamento
System.out.println("\nInformações do Agendamento:");
System.out.println("Usuário: " + agendamento.getUsuario().getNome());
System.out.println("Veículo: " + agendamento.getVeiculo().getModelo());
System.out.println("Oficina: " + agendamento.getOficina().getNome());
System.out.println("Problema: " + agendamento.getProblema().getDescricao());
System.out.println("Data: " + agendamento.getData());
System.out.println("Horário: " + agendamento.getHorario());

// Exibir informações de Pagamento
System.out.println("\nInformações do Pagamento:");
System.out.println("Valor: R$" + pagamento.getValor());
System.out.println("Descrição: " + pagamento.getDescricao());
	}

}