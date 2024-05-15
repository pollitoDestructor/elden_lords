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
	}
	public void ordenarRanking() {
		 Iterator<InfoJugador> itr = this.getIterador();
		 ArrayList<InfoJugador> listaOrdenada = new ArrayList<InfoJugador>();
		 InfoJugador mayorPuntuacion;
		 InfoJugador puntuacionActual;
		 int index = 0;
		 int posAEliminar = 0;
		 while(this.lista.size() > 0) {
			 index = 0;
			 mayorPuntuacion = new InfoJugador(0,"a");
			 while(itr.hasNext()) {
				 puntuacionActual = itr.next();
				 if(puntuacionActual.getPuntuacion()>mayorPuntuacion.getPuntuacion()) {
					 mayorPuntuacion = puntuacionActual;
					 posAEliminar = index;
				 }
				 index = index + 1;
			 }
			 listaOrdenada.add(mayorPuntuacion);
			 lista.remove(posAEliminar);
			 itr = lista.listIterator();
		 }
		 this.lista = listaOrdenada;
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