package br.com.fiap.beans;

public class LoginSessao {

	private String email;
	private String senha;
	private boolean auenticacaoDoisFatores;
	private String dispositivoSessao;
	private int tempoDeLogin;
	
	//metodo vazio
	public LoginSessao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//metodo cheio
	public LoginSessao(String email, String senha, boolean auenticacaoDoisFatores, String dispositivoSessao,
			int tempoDeLogin) {
		super();
		this.email = email;
		this.senha = senha;
		this.auenticacaoDoisFatores = auenticacaoDoisFatores;
		this.dispositivoSessao = dispositivoSessao;
		this.tempoDeLogin = tempoDeLogin;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public boolean isAuenticacaoDoisFatores() {
		return auenticacaoDoisFatores;
	}

	public String getDispositivoSessao() {
		return dispositivoSessao;
	}

	public int getTempoDeLogin() {
		return tempoDeLogin;
	}

	public void setEmail(String email) {
		this.email = email;
	
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setAuenticacaoDoisFatores(boolean auenticacaoDoisFatores) {
		this.auenticacaoDoisFatores = auenticacaoDoisFatores;
	}

	public void setDispositivoSessao(String dispositivoSessao) {
		this.dispositivoSessao = dispositivoSessao;
	}

	public void setTempoDeLogin(int tempoDeLogin) {
		this.tempoDeLogin = tempoDeLogin;
	}
	
	
	
	
	
}
