package model.entidades;

public class Veiculo {
	private String nome;
	private String Placa;

	public Veiculo() {

	}

	public Veiculo(String nome, String placa) {
		super();
		this.nome = nome;
		Placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

}
