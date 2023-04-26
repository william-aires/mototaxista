package model.entidades;

import java.util.Date;

public class Corrida {
	private long id;
	private Requerente requerente;
	private MotoTaxista motoTaxista;
	private float nota;
	private String localDaPartida;
	private String localDoDestino;
	private float distancia;
	private Date data;

	public Corrida() {

	}

	public Corrida(Requerente requerente, MotoTaxista motoTaxista, float nota, String localDaPartida,
			String localDoDestino, float distancia, Date data) {
		this.id = System.currentTimeMillis();
		this.requerente = requerente;
		this.motoTaxista = motoTaxista;
		this.nota = nota;
		this.localDaPartida = localDaPartida;
		this.localDoDestino = localDoDestino;
		this.distancia = distancia;
		this.data = data;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Requerente getRequerente() {
		return requerente;
	}

	public void setRequerente(Requerente requerente) {
		this.requerente = requerente;
	}

	public MotoTaxista getMotoTaxista() {
		return motoTaxista;
	}

	public void setMotoTaxista(MotoTaxista motoTaxista) {
		this.motoTaxista = motoTaxista;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getLocalDaPartida() {
		return localDaPartida;
	}

	public void setLocalDaPartida(String localDaPartida) {
		this.localDaPartida = localDaPartida;
	}

	public String getLocalDoDestino() {
		return localDoDestino;
	}

	public void setLocalDoDestino(String localDoDestino) {
		this.localDoDestino = localDoDestino;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
