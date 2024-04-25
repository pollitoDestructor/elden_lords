package com.eldenlords;

import java.util.ArrayList;
import java.util.Iterator;

public class Generador {
	private static Generador miGenerador = new Generador();
	private int maxWalkers = 10;
	private float porcentajeARellenar = 0.25f;
	private ArrayList<Walker> walkers;
	
	public Generador() {
		
	}
	
	public static Generador getGenerador() {
		return miGenerador;
	}
	
	private Iterator<Walker>getIterador(){
		return this.walkers.iterator();
	}
	
	public void generarMapa() {
    	this.walkers = new ArrayList<Walker>();
    	int mapaRelleno = 1;
    	Coordenada posSalida = new Coordenada(0,0);
    	Coordenada posNuevoWalker = new Coordenada(0,0);
    	Coordenada posCentro = Mapa.getMapa().getCentro();
    	boolean quiereAñadir = false;
    	Walker cWalker;
    	this.walkers.add(new Walker(posCentro.x(),posCentro.y()));
    	this.walkers.add(new Walker(posCentro.x(),posCentro.y()));
    	this.walkers.add(new Walker(posCentro.x(),posCentro.y()));
    	Iterator<Walker> itr = this.getIterador();
    	int limite = Mapa.getMapa().getTamano();
    	Mapa.getMapa().habilitarCasilla(posCentro);
    	while((float)mapaRelleno/(limite * limite)<this.porcentajeARellenar) {
    		quiereAñadir = false;
    		while((float)mapaRelleno/(limite*limite)<this.porcentajeARellenar&& itr.hasNext() && quiereAñadir == false) {
    			cWalker = itr.next();
    			cWalker.chooseAction();
    			if(Mapa.getMapa().estaHabilitada(cWalker.getCoord()) == false) {
    				switch(cWalker.tipoCasilla()) {
    				case 0:
    					Mapa.getMapa().habilitarCasilla(cWalker.getCoord());
    					posSalida = cWalker.getCoord();
    				break;
    				case 1:
    					Mapa.getMapa().ponerCasillaTeleport(cWalker.getCoord());
    				break;
    				case 2:
    					Mapa.getMapa().ponerCasillaPreguntona(cWalker.getCoord());
    				break;
    				}
    				
    				mapaRelleno = mapaRelleno + 1;
    				
    			}
    			if(this.walkers.size() < this.maxWalkers && cWalker.creaNuevoWalker()) {
    				quiereAñadir = true;
    				posNuevoWalker = cWalker.getCoord();
    			}
    			
    		}
    		if(quiereAñadir == true){
    			this.walkers.add(new Walker(posNuevoWalker.x(),posNuevoWalker.y()));
			}
    		itr = walkers.listIterator();
    	}
    	Mapa.getMapa().ponerCasillaFinal(posSalida);
    }
}
