package model.entidades;

public abstract class Pessoa {
	private long id;
	private String nome;
	private String nascimento;
	private String email;
	private String senha;
	private HistoricoDeCorridas historicoDeCorridas;
	private Credito credito;

	public Pessoa() {

	}

	public Pessoa(String nome, String nascimento, String email, String senha) {
		this.id = System.currentTimeMillis();
		this.credito = new Credito(10);
		this.historicoDeCorridas = new HistoricoDeCorridas();
		this.nome = nome;
		this.nascimento = nascimento;
		this.email = email;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public HistoricoDeCorridas getHistoricoDeCorridas() {
		return historicoDeCorridas;
	}

	public void setHistoricoDeCorridas(HistoricoDeCorridas historicoDeCorridas) {
		this.historicoDeCorridas = historicoDeCorridas;
	}

	public Credito getCredito() {
		return credito;
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
	}

}
