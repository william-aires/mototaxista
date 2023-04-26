package model.entidades;

import java.util.ArrayList;

public class HistoricoDeCorridas {
	private ArrayList <Corrida> historico = new ArrayList<Corrida>();
	
	public void addCorrida(Corrida corrida) {
		historico.add(corrida);
	}
	public ArrayList<Corrida> getHistorico() {
		return historico;
	}
	
}
