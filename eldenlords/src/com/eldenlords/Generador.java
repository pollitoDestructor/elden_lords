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
    	int filledMap = 1;
    	Coordenada posSalida = new Coordenada(0,0);
    	Coordenada posNuevoWalker = new Coordenada(0,0);
    	Coordenada posCentro = Mapa.getMapa().getCentro();
    	boolean wantsToAdd = false;
    	Walker cWalker;
    	this.walkers.add(new Walker(posCentro.x(),posCentro.y()));
    	this.walkers.add(new Walker(posCentro.x(),posCentro.y()));
    	this.walkers.add(new Walker(posCentro.x(),posCentro.y()));
    	Iterator<Walker> itr = this.getIterador();
    	Mapa.getMapa().habilitarCasilla(posCentro);
    	while(filledMap/(25*25f)<this.porcentajeARellenar) {
    		wantsToAdd = false;
    		while(filledMap/(25*25)<this.porcentajeARellenar&& itr.hasNext() && wantsToAdd == false) {
    			cWalker = itr.next();
    			cWalker.chooseAction();
    			if(Mapa.getMapa().estaHabilitada(cWalker.getCoord()) == false) {
    				Mapa.getMapa().habilitarCasilla(cWalker.getCoord());
    				filledMap = filledMap + 1;
    				posSalida = cWalker.getCoord();
    			}
    			if(this.walkers.size() < this.maxWalkers && cWalker.createsNewQ()) {
    				wantsToAdd = true;
    				posNuevoWalker = cWalker.getCoord();
    			}
    			
    		}
    		if(wantsToAdd == true){
    			this.walkers.add(new Walker(posNuevoWalker.x(),posNuevoWalker.y()));
			}
    		itr = walkers.listIterator();
    	}
    	Mapa.getMapa().ponerCasillaFinal(posSalida);
    }
}
