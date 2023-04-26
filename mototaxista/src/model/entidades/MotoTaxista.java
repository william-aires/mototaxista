package model.entidades;

import java.util.ArrayList;

public class MotoTaxista extends Pessoa {
	private Veiculo veiculo;
	private float nota;
	private ArrayList<Long> historico = new ArrayList<Long>();
	private ArrayList<Long> requerentesBloqueados = new ArrayList<Long>();

	public MotoTaxista() {

	}

	public MotoTaxista(String nome, String nascimento, String email, String senha, Veiculo veiculo) {
		super(nome, nascimento, email, senha);
		this.veiculo = veiculo;
		this.nota = 0;
		// TODO Auto-generated constructor stub
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public ArrayList<Long> getHistorico() {
		return historico;
	}

	public void addHistorico(Long id) {
		this.historico.add(id);
	}

	public ArrayList<Long> getRequerentesBloqueados() {
		return requerentesBloqueados;
	}

	public void addBloqueados(Long id) {
		this.requerentesBloqueados.add(id);
	}

}
