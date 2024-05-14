package com.eldenlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

	public class Ranking {
	private ArrayList<InfoJugador> lista;
	private static Ranking miRanking = new Ranking();

	private Ranking() {
    	lista = new ArrayList<InfoJugador>();
	}

	public static Ranking getRanking() {
		return miRanking;
	}
	public void añadirRanking(InfoJugador pInfoJugador) {
		this.lista.add(pInfoJugador);
		//Collections.sort(this.lista);
	}

	public void reiniciarRanking() {
    	lista = new ArrayList<InfoJugador>();
	}

	private Iterator<InfoJugador> getIterador(){
    	return this.lista.iterator();
	}	

	public void imprimirRanking() {
		Iterator<InfoJugador> itr = this.getIterador();
		while( itr.hasNext()) {
			InfoJugador esteJugador = itr.next();
			esteJugador.imprimirInfoJugador();
		}
	}

}